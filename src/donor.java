import java.time.LocalDate;

public class donor {

    private String id;
    private int age;
    private BloodData bd;
    private LocalDate ld = LocalDate.now();
    public donor() {
        bd = new BloodData();
        this.id = "0";
        this.age = 0;
    }

    public donor(String id, int age, BloodData bd) {
        this.id = id;
        this.age = age;
        this.bd = bd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getBloodData() {
        return bd;
    }

    public void setBloodData(BloodData bd) {
        this.bd = bd;
    }

    public LocalDate getLocalDate() {
        return ld;
    }

    public void setLocalDate(LocalDate ld) {
        this.ld = ld;
    }
}
