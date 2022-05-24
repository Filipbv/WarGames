package no.ntnu.idata2001.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Army {

    private String armyName;
    private List<Unit> units;

    /**
     * Lager en arme (array)
     * @param armyName lager navn på armeen
     */

    public Army(String armyName) {

        this.armyName = armyName;
        this.units = new ArrayList<>();
    }

    public Army(String armyName, List<Unit> units) {

        this.armyName =  armyName;
        this.units =  units;
    }

    /**
     * returnerer armeen
     * @return
     */

    public String getArmyName() {

        return armyName;
    }

    /**
     * legger til en unit til armeen
     * @param unit
     */

    public void add(Unit unit) {

        this.units.add(unit);
    }

    /**
     *
     * @param unitList
     */

    public void addAll(List<Unit> unitList) {

        this.units.addAll(unitList);
    }

    /**
     * fjerner en unit fra armeen
     * @param unit
     */

    public void remove(Unit unit) {

        this.units.remove(unit);
    }

    /**
     * sjekker om armeen har units
     * @return
     */

    public boolean hasUnits() {
        if (units.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public List<Unit> getAllUnits() {

        return units;
    }

    /**
     * Gir deg en random unit fra en arme.
     * @return
     */

    public Unit getRandom() {

        Random rand = new Random();
        int upperbound = units.size();
        int intRandom = rand.nextInt(upperbound);
        Unit randomUnit = units.get(intRandom);
        return randomUnit;
    }

    @Override
    public String toString() {

        return "no.ntnu.idata2001.Data.Army{" +
                "armyName='" + armyName + '\'' +
                ", units=" + units +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Army army = (Army) o;
        return Objects.equals(armyName, army.armyName) &&
                Objects.equals(units, army.units);
    }

    @Override
    public int hashCode() {

        return Objects.hash(armyName, units);
    }
}
