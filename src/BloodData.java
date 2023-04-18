public class BloodData {

    /**
     *
     * these are the declarations
     */
    private String bloodType;
    private String rhFactor;

    /**
     *
     * this is the default constructor
     */
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    /**
     *
     * this is the overloaded constructor
     */
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }


    /**
     *
     * these are the getters and setters
     */
    public String getBloodType() {

        return bloodType;
    }

    public void setBloodType(String bloodType) {

        this.bloodType = bloodType;
    }

    public String getRhFactor() {

        return rhFactor;
    }

    public void setRhFactor(String rhFactor) {

        this.rhFactor = rhFactor;
    }
}
