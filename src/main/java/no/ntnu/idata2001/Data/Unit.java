package no.ntnu.idata2001.Data;

public abstract class Unit {

    private String name;
    private int health;
    private int attack;
    private int armor;
    private Terrain terrain;

    /**
     * Holder på informasjonen om unit
     * @param name navnet til en unit
     * @param health helsen til en unit
     * @param attack angrepet til en unit
     * @param armor amoren til en unit
     * @param terrain fordelen til units i forskjellig terreng
     */
    public Unit(String name, int health, int attack, int armor, Terrain terrain) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.armor = armor;
        this.terrain = terrain;
    }

    /**
     * Angrepet til en unit
     * @param unit2
     */

    public void attack(Unit unit2){

        int x = unit2.health - (this.attack+this.getAttackBonus()) + (unit2.armor+unit2.getResistBonus());
        unit2.setHealth(x);
    }

    /**
     * returnere navnet til en unit
     * @return
     */

    public String getName() {

        return name;
    }

    /**
     * Returnerer helsen til en unit
     * @return
     */

    public int getHealth() {

        return health;
    }

    /**
     * Returnerer angrepet til en unit
     * @return
     */

    public int getAttack() {

        return attack;
    }

    /**
     * Returnerer armoren til uniten
     * @return
     */

    public int getArmor() {

        return armor;
    }

    /**
     * Setter helsen til en unit
     * @param health
     */

    public void setHealth(int health) {
        if (health < 0){
            this.health = 0;
        }
        else{
            this.health = health;
        }

    }

    public void setTerrain(Terrain terrain){
        this.terrain = terrain;
    }

    public Terrain getTerrain(){
        return this.terrain;
    }

    public abstract int getAttackBonus();

    public abstract int getResistBonus();

    @Override
    public String toString() {

        return "Name: " + name + ", Health: " + health + ", Attack: " + attack + ", Armor: " + armor;
    }

}
