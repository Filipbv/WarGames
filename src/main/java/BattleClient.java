public class BattleClient {
    public static void main(String[] args) {
        Army armyOne = new Army("Human Army");
        Army armyTwo = new Army("Orcish horde");
        for (int i = 0; i<500; i++){
            InfantryUnit unit = new InfantryUnit("Footman", 100);
            armyOne.add(unit);
        }
        for (int i = 0; i<100; i++){
            CavalryUnit unit = new CavalryUnit("Knight", 100);
            armyOne.add(unit);
        }
        for (int i = 0; i<200; i++){
            RangedUnit unit = new RangedUnit("Archer", 100);
            armyOne.add(unit);
        }
        CommanderUnit unit = new CommanderUnit("Mountain King", 180);
        armyOne.add(unit);

        for (int i = 0; i<500; i++){
            InfantryUnit unitTwo = new InfantryUnit("Grunt", 100);
            armyOne.add(unitTwo);
        }
        for (int i = 0; i<100; i++){
            CavalryUnit unitTwo = new CavalryUnit("Raider", 100);
            armyOne.add(unitTwo);
        }
        for (int i = 0; i<200; i++){
            RangedUnit unitTwo = new RangedUnit("Spearman", 100);
            armyOne.add(unitTwo);
        }
        CommanderUnit unitTwo = new CommanderUnit("Gul´dan", 180);
        armyOne.add(unitTwo);

        Battle battle = new Battle(armyOne, armyTwo);
        Army winningArmy = battle.simulate();
    }
}
