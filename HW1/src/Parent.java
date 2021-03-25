public class Parent extends Person{


    /**
     * Constructs a Person instance with the given name,lastName,age,HEScode
     *
     * @param name
     * @param lastName
     * @param age
     * @param HEScode
     */

    public int numberOfKids;
    public Parent(String name,  String lastName, int age, int HEScode,int numberOfKids) {
        super(name,  lastName, age, HEScode);
        int[] Kids = new int[]{};

    }
    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }
}
