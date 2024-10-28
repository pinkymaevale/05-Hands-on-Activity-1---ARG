import java.util.Scanner;

public class RunBloodData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodData bd = new BloodData();
        
        System.out.print("Enter blood type of patient: ");
        String input1 = sc.nextLine();
        System.out.print("Enter the Rhesus Factor (+ or -): ");
        String input2 = sc.nextLine();

        if (!input1.isEmpty()) {
            bd.setBloodType(input1);
        }
        if (!input2.isEmpty()) {
            bd.setRhFactor(input2);
        }
        System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
    }
}
