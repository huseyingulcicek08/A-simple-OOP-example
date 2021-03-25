public class Elderly extends Person {
    public String getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(String isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    /**
     * Constructs a Person instance with the given name,lastName,age,HEScode
     *
     * @param name
     * @param lastName
     * @param age
     * @param HEScode
     */
    public String isVaccinated;
    public Elderly(String name, String lastName, int age, int HEScode,String iVac) {
        super(name, lastName, age, HEScode);
        iVac= isVaccinated;

    }
}

