package no.ntnu.idata2001.Data;


public class CommanderUnit extends CavalryUnit {

    /**
     * lager kommander uniten
     * @param name lager navnet til komandøren
     * @param health lager helsen til komandøren
     * @param attack lager angrep til komandøren
     * @param armor lager amoren til komandøren
     */
    public CommanderUnit(String name, int health, int attack, int armor, Terrain terrain)
    {
        super(name, health, attack, armor, terrain);
    }


        public CommanderUnit(String name, int health, Terrain terrain) {

            super(name, health, 25, 15, terrain);

    }
}
