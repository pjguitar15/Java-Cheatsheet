import java.util.Scanner;
public class RunBloodData {
  public static void main(String[] args) {
    // Scanner object
    Scanner scan = new Scanner(System.in);
        
    // blood type input
    System.out.print("Enter blood type of patient: ");
    String bloodType = scan.nextLine();


    // rhesus factor input
    System.out.print("Enter the Rhesus factor (+ or -): ");
    String rhFactor = scan.nextLine();

    // if blood type and rh factor is not empty, then run this block
    if(!bloodType.equals("") && !rhFactor.equals("")){
        // BloodData object
        BloodData bd = new BloodData(bloodType, rhFactor);
        System.out.println(bd.display());            
    } else {
        BloodData bd = new BloodData();
        System.out.println(bd.display());            
    }
  }
}
