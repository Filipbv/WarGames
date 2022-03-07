import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Army {

    private String armyName;
    private List<Unit2> units;

    public Army(String armyName) {

        this.armyName = armyName;
        this.units = new ArrayList<>();
    }

    public Army(String armyName, List<Unit2> units) {

        this.armyName =  armyName;
        this.units =  units;
    }

    public String getArmyName() {

        return armyName;
    }

    public void add(Unit2 unit) {

        this.units.add(unit);
    }

    public void addAll(List<Unit2> unitList) {

        this.units.addAll(unitList);
    }

    public void remove(Unit2 unit) {

        this.units.remove(unit);
    }

    public boolean hasUnits() {
        if (units.isEmpty()) {
            return false;
        }
        else {
            return true;
        }
    }

    public List<Unit2> getAllUnits() {

        return units;
    }

    public Unit2 getRandom() {

        Random rand = new Random();
        int upperbound = units.size();
        int intRandom = rand.nextInt(upperbound);
        Unit2 randomUnit = units.get(intRandom);
        return randomUnit;
    }

    @Override
    public String toString() {

        return "Army{" +
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
