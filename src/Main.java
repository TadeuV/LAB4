import Calculator.Operation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        double a;
        double b;
        String oper;
        Scanner scan = new Scanner(System.in);
        Operation cal = new Operation();
        String ans = "continue";

      
        while (ans.equals("continue")) {

            System.out.println("Please type the first number:");
            a = scan.nextDouble();
            System.out.println(
                    "Please choose the operation: \n > Type + for addition\n > Type - for subtracation\n > Type * for multiplication\n > Type / for division\n");
            oper = scan.next();
            System.out.println("Please type the second number: ");
            b = scan.nextDouble();

            if (oper.equals("/") && b == 0) {
                System.out.println("Cannot divide by 0.");

            } else if (oper.equals("+")) {
                System.out.println("\n"+ cal.add(a, b));
            } else if (oper.equals("-")) {
                System.out.println("\n"+cal.sub(a, b));
            } else if (oper.equals("*")) {
                System.out.println("\n"+cal.mult(a, b));
            } else if (oper.equals("/")) {
                System.out.println("\n"+cal.div(a, b));
            } else {
                System.out.println("You did not type a correct operator.");
            }
            System.out.println("Would you like to quit or continue?");
            ans = scan.next();
            if (ans.toLowerCase().equals("quit")) {
                System.out.println("\nbye!");
            }
            
        }
        scan.close();
        
    }
}
