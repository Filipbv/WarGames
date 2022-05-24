package no.ntnu.idata2001.GUI;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import no.ntnu.idata2001.Data.Army;
import no.ntnu.idata2001.Data.Terrain;
import no.ntnu.idata2001.Data.Unit;
import no.ntnu.idata2001.Factory.UnitFactory;
import javafx.fxml.FXML;
import no.ntnu.idata2001.Factory.UnitType;
import no.ntnu.idata2001.Simulation.Battle;

import java.util.ArrayList;
import java.util.List;



public class MainMenuController {
    Army armyOne;
    Army armyTwo;
    Terrain terrain = Terrain.DEFAULT;

    @FXML
    private TextField infantryUnitNameArmyOne;
    @FXML
    private TextField infantryUnitHPArmyOne;
    @FXML
    private TextField infantryUnitAmountArmyOne;
    @FXML
    private TextField rUNAO;
    @FXML
    private TextField rUHPAO;
    @FXML
    private TextField rUAAO;
    @FXML
    private TextField cUNAO;
    @FXML
    private TextField cUHPAO;
    @FXML
    private TextField cUAAO;
    @FXML
    private TextField coUNAO;
    @FXML
    private TextField coUHPAO;
    @FXML
    private TextField coUAAO;
    @FXML
    private TextField infantryUnitNameArmyTwo;
    @FXML
    private TextField infantryUnitHPArmyTwo;
    @FXML
    private TextField infantryUnitAmountArmyTwo;
    @FXML
    private TextField rUNAT;
    @FXML
    private TextField rUHPAT;
    @FXML
    private TextField rUAAT;
    @FXML
    private TextField cUNAT;
    @FXML
    private TextField cUHPAT;
    @FXML
    private TextField cUAAT;
    @FXML
    private TextField coUNAT;
    @FXML
    private TextField coUHPAT;
    @FXML
    private TextField coUAAT;
    @FXML
    private TextField winner;


    /***
     * Lager armyOne ut ifra hva brukeren har skrevet inn i applikasjonene
     */
    public void crateArmyOne(){
        List<Unit> units = new ArrayList<>();
        this.armyOne = new Army("armyOne", units);
        createInfantryUnits1(units);
        createRangedUnits1(units);
        createCavlaryUnits1(units);
        createCommanderUnits1(units);
    }

    /**
     * Lager armyTwo ut ifra hva brukeren har skrevet inn i applikasjonene
     */
    public void crateArmyTwo(){
        List<Unit> units = new ArrayList<>();
        this.armyTwo = new Army("armyTwo", units);
        createInfantryUnits2(units);
        createRangedUnits2(units);
        createCavlaryUnits2(units);
        createCommanderUnits2(units);
    }


    /**
     * Lager infantry units til armyOne
     * @param units
     */
    private void createInfantryUnits1(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.INFANTRY, this.infantryUnitNameArmyOne.getText(), Integer.parseInt(this.infantryUnitHPArmyOne.getText()), terrain, Integer.parseInt(infantryUnitAmountArmyOne.getText()));
        armyOne.addAll(units);
    }

    /**
     * Lager Ranged units til armyOne
     * @param units
     */
    private void createRangedUnits1(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.RANGED, this.rUNAO.getText(), Integer.parseInt(this.rUHPAO.getText()), terrain, Integer.parseInt(rUAAO.getText()));
        armyOne.addAll(units);
    }

    /**
     * Lager Cavlary units til armyOne
     * @param units
     */
    private void createCavlaryUnits1(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.CAVLARY, this.cUNAO.getText(), Integer.parseInt(this.cUHPAO.getText()), terrain, Integer.parseInt(cUAAO.getText()));
        armyOne.addAll(units);
    }

    /**
     * Lager commander units til armyOne
     * @param units
     */
    private void createCommanderUnits1(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.COMANDER, this.coUNAO.getText(), Integer.parseInt(this.coUHPAO.getText()), terrain, Integer.parseInt(coUAAO.getText()));
        armyOne.addAll(units);
    }

    /**
     * Lager infantry units til armyTwo
     * @param units
     */
    private void createInfantryUnits2(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.INFANTRY, this.infantryUnitNameArmyTwo.getText(), Integer.parseInt(this.infantryUnitHPArmyTwo.getText()), terrain, Integer.parseInt(infantryUnitAmountArmyTwo.getText()));
        armyTwo.addAll(units);
    }

    /**
     * Lager Ranged units til armyTwo
     * @param units
     */
    private void createRangedUnits2(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.RANGED, this.rUNAT.getText(), Integer.parseInt(this.rUHPAT.getText()), terrain, Integer.parseInt(rUAAT.getText()));
        armyTwo.addAll(units);
    }

    /**
     * Lager Cavlary units til armyTwo
     * @param units
     */
    private void createCavlaryUnits2(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.CAVLARY, this.cUNAT.getText(), Integer.parseInt(this.cUHPAT.getText()), terrain, Integer.parseInt(cUAAT.getText()));
        armyTwo.addAll(units);
    }

    /**
     * Lager Commander units til armyTwo
     * @param units
     */
    private void createCommanderUnits2(List<Unit> units) {
        UnitFactory unitFactory = new UnitFactory();
        units = unitFactory.crateUnits(UnitType.COMANDER, this.coUNAT.getText(), Integer.parseInt(this.coUHPAT.getText()), terrain, Integer.parseInt(coUAAT.getText()));
        armyTwo.addAll(units);
    }


    /**
     * Kaller på battel metoden med arméene brukeren har laget og skriver ut vinneren
     */
    @FXML
    protected void simulateButton (){
        crateArmyOne();
        crateArmyTwo();
        Battle battle = new Battle(armyOne, armyTwo);

        this.winner.setText("The winner is " + battle.simulate().getArmyName());

    }

}
