import javax.swing.*;
import java.time.LocalDate;

public class BloodTest {

    public static void main(String[] args) {
        String userId, userRHFactor, userBloodType;
        int userAge;

        userId = JOptionPane.showInputDialog(null, "What is your ID?");
        userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age?"));
        userBloodType = JOptionPane.showInputDialog(null, "What is your blood type?");
        while (!userBloodType.equalsIgnoreCase("A") && !userBloodType.equalsIgnoreCase("B") && !userBloodType.equalsIgnoreCase("AB") &&
                !userBloodType.equalsIgnoreCase("O")) {
            userBloodType = JOptionPane.showInputDialog(null, "Invalid blood type. Please enter A, B, AB, or O.");
        }

        userRHFactor = JOptionPane.showInputDialog(null, "What is your RH factor?");

        BloodData user1bd = new BloodData(userBloodType, userRHFactor);
        donor user1d = new donor(userId, userAge, user1bd);

        displayUserData(user1d.getId(), user1d.getAge(), user1d.getBloodData().getBloodType(), user1d.getBloodData().getRhFactor(), user1d.getLocalDate());

    }

    public static void displayUserData(String userId, int userAge, String userBloodType, String userRHFactor, LocalDate ld) {
        JOptionPane.showMessageDialog(null, "ID number: " + userId + "\n" +
                "Age: " + userAge + "\n" +
                "Your blood Type: " + userBloodType.toUpperCase().concat(userRHFactor) + "\n" +
                "Date: " + ld);
    }
}