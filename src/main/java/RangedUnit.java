public class RangedUnit extends Unit {

    public int numAttacks=3;

    public RangedUnit(String name, int health, int attack, int armor)
    {
        super(name, health, attack, armor);
    }

    public RangedUnit(String name, int health) {

        super(name, health, 15, 8);
    }

    @Override
    public int getAttackBonus() {

        return 3;
    }

    @Override
    public int getResistBonus() {

        int value = numAttacks * 2;
        numAttacks--;
        if (value <= 2) {

            return 2;
        }

        return value;
    }
}
