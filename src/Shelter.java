public class Shelter {

    private int defenseLevel;
    private int numberOfSupplies;

    public Shelter(int pDefenseLevel, int pNumberOfSupplies){
        defenseLevel = pDefenseLevel;
        numberOfSupplies = pNumberOfSupplies;
    }

    public int getDefenseLevel(){
        return defenseLevel;
    }

    public void setDefenseLevel(int newDefenseLevel){
        this.defenseLevel = newDefenseLevel;
    }

    public int getNumberOfSupplies(){
        return numberOfSupplies;
    }

    public void setNumberOfSupplies(int newNumberOfSupplies){
        this.numberOfSupplies = newNumberOfSupplies;
    }

    public void printInfo(){
        System.out.println("Defense Level: " + defenseLevel);
        System.out.println("Number Of Supplies: " + numberOfSupplies);
    }

}
