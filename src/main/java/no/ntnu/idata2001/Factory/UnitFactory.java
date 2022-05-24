package no.ntnu.idata2001.Factory;

import no.ntnu.idata2001.Data.*;

import java.util.ArrayList;
import java.util.List;

public class UnitFactory {

    /**
     * Lager en unit fra nøkkelordene infantry, ranged, cavlary, commander og de nødvendige verdiene
     *
     */
    public Unit crateUnit(UnitType unitType, String name, int health, Terrain terrain){
        Unit unit = null;
        switch(unitType) {
            case INFANTRY ->{
                unit = new InfantryUnit(name, health, terrain);
            }
            case RANGED -> {
                unit = new RangedUnit(name, health, terrain);
            }
            case CAVLARY -> {
                unit = new CavalryUnit(name, health, terrain);
            }
            case COMANDER -> {
                unit = new CommanderUnit(name, health, terrain);
            }
            default ->
                    throw new IllegalArgumentException("This is not a walid UnitType");

        }
        return unit;
    }


    /**
     * Lager alle unitsene i en liste
     *
     */
    public List<Unit> crateUnits(UnitType unitType, String name, int health, Terrain terrain, int numOfUnits){
        List<Unit> listOfUnits = new ArrayList<>();
        if(numOfUnits > 0){
            for(int index = 1; index <= numOfUnits; index++){
                listOfUnits.add(crateUnit(unitType,name, health, terrain));

            }
        }
        else{
            throw new IllegalArgumentException("Not a valid number");
        }
        return listOfUnits;
    }

}
