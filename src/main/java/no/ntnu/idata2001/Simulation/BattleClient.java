package no.ntnu.idata2001.Simulation;

import no.ntnu.idata2001.Data.*;
import no.ntnu.idata2001.Simulation.Battle;

public class BattleClient {

    /**
     * Kjører krigs simuleringen WarGames med to forhåndsbestemete arméer
     * @param args
     */

    public static void main(String[] args) {
        Army armyOne = new Army("Human Army");
        Army armyTwo = new Army("Orcish horde");
        Terrain terrain = Terrain.DEFAULT;
        for (int i = 0; i<500; i++){
            InfantryUnit unit = new InfantryUnit("Footman", 100, terrain);
            armyOne.add(unit);
        }
        for (int i = 0; i<100; i++){
            CavalryUnit unit = new CavalryUnit("Knight", 100, terrain);
            armyOne.add(unit);
        }
        for (int i = 0; i<200; i++){
            RangedUnit unit = new RangedUnit("Archer", 100, terrain);
            armyOne.add(unit);
        }
        CommanderUnit unit = new CommanderUnit("Mountain King", 180, terrain);
        armyOne.add(unit);

        for (int i = 0; i<500; i++){
            InfantryUnit unitTwo = new InfantryUnit("Grunt", 100, terrain);
            armyTwo.add(unitTwo);
        }
        for (int i = 0; i<100; i++){
            CavalryUnit unitTwo = new CavalryUnit("Raider", 100, terrain);
            armyTwo.add(unitTwo);
        }
        for (int i = 0; i<200; i++){
            RangedUnit unitTwo = new RangedUnit("Spearman", 100, terrain);
            armyTwo.add(unitTwo);
        }
        CommanderUnit unitTwo = new CommanderUnit("Gul´dan", 180, terrain);
        armyTwo.add(unitTwo);

        Battle battle = new Battle(armyOne, armyTwo);
        Army winningArmy = battle.simulate();
        System.out.println(winningArmy);
    }
}
