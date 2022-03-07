public abstract class Unit2 {

    private String name;
    private int health;
    private int attack;
    private int armor;

    public Unit2(String name, int health, int attack, int armor) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
    }

    public void attack(Unit2 unit2){

        int x = unit2.health - (this.attack+this.getAttackBonus()) + (unit2.armor+unit2.getResistBonus());
        unit2.setHealth(x);
    }

    public String getName() {

        return name;
    }

    public int getHealth() {

        return health;
    }

    public int getAttack() {

        return attack;
    }

    public int getArmor() {

        return armor;
    }

    public void setHealth(int health) {

        this.health = health;
    }

    public abstract int getAttackBonus();

    public abstract int getResistBonus();

    @Override
    public String toString() {

        return "Name: " + name + ", Health: " + health + ", Attack: " + attack + ", Armor: " + armor;
    }

}
