import java.util.List;

public class Battle {

    private Army armyOne;
    private Army armyTwo;

    public Battle(Army armyOne, Army armyTwo) {

        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    public Army simulate() {

        while(true) {

            Unit2 unitOne = armyOne.getRandom();
            Unit2 unitTwo = armyTwo.getRandom();
            unitOne.attack(unitTwo);
            if (unitOne.getHealth() < 0) {
                armyOne.remove(unitOne);
            }
            if (armyOne.getAllUnits().size() == 0) {
                return armyTwo;
            } else if (armyTwo.getAllUnits().size() == 0) {
                return armyOne;
            }
            unitTwo.attack(unitOne);
            if (unitTwo.getHealth() < 0) {
                armyTwo.remove(unitTwo);
            }
            if (armyOne.getAllUnits().size() == 0) {
                return armyTwo;
            } else if (armyTwo.getAllUnits().size() == 0) {
                return armyOne;
            }
        }
    }

}