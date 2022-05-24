package no.ntnu.idata2001.Data;

public class CavalryUnit extends Unit {

    private int numAttacks=0;

    /**
     * Klassen som lager kavlari.
     * @param name lager navnet til kavlari enheten
     * @param health lager helsen til kavlari enhetern
     * @param attack lager angrepet til kavlari enheten
     * @param armor lager armoren til kavlari enheten
     */

    public CavalryUnit(String name, int health, int attack, int armor, Terrain terrain)
    {
        super(name, health, attack, armor, terrain);
    }

    public CavalryUnit(String name, int health, Terrain terrain) {

        super(name, health, 20, 12, terrain);
    }
    @Override
    public int getAttackBonus() {
        int attackBonus = 2;
        if (numAttacks == 0) {
            numAttacks++;
            attackBonus = attackBonus + 4;
        }
        else {
            numAttacks = 2;
        }
        if(getTerrain() == (Terrain.PLAINS)) {
            attackBonus++;
        }
        return attackBonus;
    }


    @Override
    public int getResistBonus() {
        int resistBonus = 1;
        if(getTerrain() == Terrain.FOREST) {
            resistBonus = 0;
        }
        return resistBonus;
    }
}
