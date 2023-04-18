import javax.swing.*;

public class BloodTest {

    public static void main(String[] args) {

        String userId = JOptionPane.showInputDialog(null, "What is your ID?");
        int userAge = Integer.parseInt(JOptionPane.showInputDialog(null, "What is your age?"));
        String userBloodType = JOptionPane.showInputDialog(null, "What is your blood type?");
        String userRHFactor = JOptionPane.showInputDialog(null, "What is your RH factor?");

        BloodData user1bd = new BloodData(userBloodType, userRHFactor);
        donor user1d = new donor(userId, userAge, user1bd);

        displayUserData(user1d.getId(), user1d.getAge(), user1bd.getBloodType(), user1bd.getRhFactor());

    }

    public static void displayUserData(String userId, int userAge, String userBloodType, String userRHFactor) {
        JOptionPane.showMessageDialog(null, "ID number: " + userId + "\n"
                + "Age: " + userAge + "\n"
                + "Your blood Type: " + userBloodType.concat(userRHFactor));
    }
}
