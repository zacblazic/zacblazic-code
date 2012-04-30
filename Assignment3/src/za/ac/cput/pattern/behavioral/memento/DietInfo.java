package za.ac.cput.pattern.behavioral.memento;

/**
 *
 * @author Revar
 */

public class DietInfo {
    
    private String personName;
    private int dayNumber;
    private int weight;

    public DietInfo(String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }
    
    public Memento save() {
        return new Memento(personName, dayNumber, weight);
    }
    
    public void restore(Object object) {
        Memento memento = (Memento)object;
        personName = memento.getMementoPersonName();
        dayNumber = memento.getMementoDayNumber();
        weight = memento.getMementoWeight();
    } 
    
    private class Memento {
        
        private String mementoPersonName;
        private int mementoDayNumber;
        private int mementoWeight;

        public Memento(String mementoPersonName, int mementoDayNumber, int mementoWeight) {
            this.mementoPersonName = mementoPersonName;
            this.mementoDayNumber = mementoDayNumber;
            this.mementoWeight = mementoWeight;
        }

        public int getMementoDayNumber() {
            return mementoDayNumber;
        }

        public String getMementoPersonName() {
            return mementoPersonName;
        }

        public int getMementoWeight() {
            return mementoWeight;
        }
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return "Name: " + personName + ", day number: " + dayNumber + ", weight: " + weight;
    }
}