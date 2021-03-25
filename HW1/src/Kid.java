public class Kid extends Person{
    /**
     * Constructs a Person instance with the given name,lastName,age,HEScode
     *
     * @param name
     * @param lastName
     * @param age
     * @param HEScode
     */
    public String gender;
    public Kid(String name,  String lastName, int age, int HEScode,String g) {
        super(name, lastName, age, HEScode);
        g = gender;


    }
}
