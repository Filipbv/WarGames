public class CavalryUnit extends Unit2 {

    private int numAttacks=0;

    public CavalryUnit(String name, int health, int attack, int armor)
    {
        super(name, health, attack, armor);
    }

    public CavalryUnit(String name, int health) {

        super(name, health, 20, 12);
    }
    @Override
    public int getAttackBonus() {

        if (numAttacks == 0) {
            numAttacks++;
            return 4 + 2;
        } else {

            return 2;
        }
    }
    @Override
    public int getResistBonus() {

        return 1;
    }
}