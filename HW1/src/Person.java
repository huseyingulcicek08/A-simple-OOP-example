/**
 * The superclass Person has name and address.
 */
public class Person {




    // private instance variables
    public String name,lastName;
    public Integer age,HEScode;

    /** Constructs a Person instance with the given name,lastName,age,HEScode */
    public Person(String name,String lastName,int age, int HEScode) {
        this.name = name;

        this.lastName = lastName;
        this.age=age;
        this.HEScode=HEScode;


    }

    public Person() {

    }

    // Getters and Setters
    public String getName() {
        return name;
    }



    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHEScode() {
        return HEScode;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setHEScode(Integer HEScode) {
        this.HEScode = HEScode;
    }

   }