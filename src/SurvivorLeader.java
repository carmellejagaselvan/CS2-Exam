public class SurvivorLeader {

    public static void main(String[] args) {
        SurvivorLeader myCode = new SurvivorLeader();
    }

    private String transmission = "q2xf1t8r5w3t tm9c5i8l900d5n7heto 3g5t6hgw44y5e7bhty605rh8t5 85ml95ak2k5r7qw5ksp295e5t7p45 o5i3n 6z5n205 9soe5o8hhg5lygtt5dq7th 5 gf34s9o 35j7j5o45k99hg5kyqqcjg5mkpl20z5o629sle5k20sk5k9c5 gh73h qxp25vi8t5i3f2v1q 9x7z6t5l8r9j3o4v5l3l1w 9y5a4d6f7x2c9l5g h8s45ek6";
    public Shelter[] shelters;
    public boolean equalSupplies = false;

    public SurvivorLeader() {
        System.out.println("Goodbye World! Good luck surviving the apocalypse!");
        shelters = new Shelter[40];

        for (int i = 0; i < shelters.length; i++) {
            shelters[i] = new Shelter((int) (Math.random() * 100) + 1, (int) (Math.random() * 1001));
        }
        displayShelters();
        checkSupplies();
        System.out.println("It is " + equalSupplies + " that at least two shelters have the same number of supplies.");
        System.out.println();
        System.out.println("Decoded Message: " + decipher(transmission));
        newDefense();
        displayShelters();
    }

    public void displayShelters() {
        for (int i = 0; i < shelters.length; i++) {
            int shelterNumber = i + 1;
            System.out.println("Shelter: " + shelterNumber);
            shelters[i].printInfo();
            System.out.println();
        }
    }

    public boolean checkSupplies() {
        for (int i = 0; i < shelters.length; i++) {
            for (int j = 0; j < shelters.length; j++) {
                if(shelters[i].getNumberOfSupplies() == shelters[j].getNumberOfSupplies() && i!=j){
                    equalSupplies = true;
                }
            }
        }
        return equalSupplies;
    }

    public String decipher(String text){
        String decodedTransmission = " ";
        int fiveIndex = transmission.indexOf("5");
        while (fiveIndex != -1){
            decodedTransmission += transmission.substring(fiveIndex+1, fiveIndex+2);
            fiveIndex = transmission.indexOf("5", fiveIndex+2);
        }
        return decodedTransmission;
    }

    public void newDefense(){
        for (int i=0; i<shelters.length; i++){
            for (int j = 0; j < shelters.length; j++) {
                while (shelters[i].getDefenseLevel() == shelters[j].getDefenseLevel() && i!=j){
                    shelters[j].setDefenseLevel((int) (Math.random() * 100) + 1);
                }
            }
        }
    }

}


