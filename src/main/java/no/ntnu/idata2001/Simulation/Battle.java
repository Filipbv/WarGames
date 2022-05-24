package no.ntnu.idata2001.Simulation;

import no.ntnu.idata2001.Data.Army;
import no.ntnu.idata2001.Data.Unit;

public class Battle {

    private Army armyOne;
    private Army armyTwo;

    /**
     * simulerer en krig mellom armeer
     * @param armyOne representerer den første armeen
     * @param armyTwo representerer den andre armeen
     */
    public Battle(Army armyOne, Army armyTwo) {

        this.armyOne = armyOne;
        this.armyTwo = armyTwo;
    }

    /**
     * starter simuleringen
     *
     */

    public Army simulate() {

        while(armyOne.hasUnits() && armyTwo.hasUnits()) {

            Unit unitOne = armyOne.getRandom();
            Unit unitTwo = armyTwo.getRandom();
            unitTwo.attack(unitOne);
            unitOne.attack(unitTwo);
            if (unitTwo.getHealth() == 0) {
                armyTwo.remove(unitTwo);
            }

            if (unitOne.getHealth() == 0) {
                armyOne.remove(unitOne);
            }

        }
        if (armyOne.getAllUnits().size() == 0) {
            return armyTwo;
        } else if (armyTwo.getAllUnits().size() == 0) {
            return armyOne;
        }else{
            return null;
        }
    }

}