package no.ntnu.idata2001.Data;

public class InfantryUnit extends Unit {

    /**
     * Lager infantri objektet
     * @param name lager navnet til infantri objektet
     * @param health lager helsen til infantri objektet
     * @param attack lager angrepe til infantri objektet
     * @param armor lager armor til infatri objektet
     */
    public InfantryUnit(String name, int health, int attack, int armor, Terrain terrain)
    {
        super(name, health, attack, armor, terrain);
    }

    public InfantryUnit(String name, int health, Terrain terrain){

        super(name, health, 15, 10, terrain);


    }
    @Override
    public int getAttackBonus() {
        int attackBonus = 2;
        if(getTerrain() == Terrain.FOREST) {
            attackBonus++;
        }
        return attackBonus;
    }
    @Override
    public int getResistBonus() {
        int resistBonus = 1;
        if(getTerrain() == Terrain.FOREST) {
            resistBonus++;
        }
        return resistBonus;
    }
}
