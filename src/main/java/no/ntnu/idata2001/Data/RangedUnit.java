package no.ntnu.idata2001.Data;

public class RangedUnit extends Unit {

    public int numAttacks=3;

    /**
     * Lager pil å bue skyter objektet
     * @param name lager navnet til pil og bue skytteren
     * @param health lager helsen til pil og bue skyteren
     * @param attack lager angrep til pil og bue skyteren
     * @param armor lager armor til pil og bue skyteren
     */

    public RangedUnit(String name, int health, int attack, int armor, Terrain terrain)
    {
        super(name, health, attack, armor, terrain);
    }

    public RangedUnit(String name, int health, Terrain terrain) {

        super(name, health, 15, 8, terrain);
    }

    @Override
    public int getAttackBonus() {
        int attackBonus = 3;
        if(getTerrain() == Terrain.HILLS){
            attackBonus++;
            attackBonus++;
        }
        if(getTerrain() == Terrain.FOREST) {
            attackBonus++;
        }
        return attackBonus;
    }
    @Override
    public int getResistBonus() {
        int value = numAttacks *2;
        numAttacks--;
        if (value <= 2) {
            return 2;
        }
        return value;
    }
}
