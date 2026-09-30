import java.util.Scanner;

    public class Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while (answer.equalsIgnoreCase("yes")) || answer.equalsIgnoreCase("y")){

        System.out.println("Calculator");
        System.out.println("pick the if its addition, subtraction, multiplication, or division ");
        String calcu = input.nextLine();

        System.out.println("First Number");
        int cal1 = input.nextInt();
        System.out.println("Second Number");
        int cal2 = input.nextInt();

        if (calcu.equalsIgnoreCase("addition") || (calcu.equalsIgnoreCase("add"))){
            int result= cal1 + cal2;
            System.out.println(result);
        } else if (calcu.equalsIgnoreCase("subtraction") || (calcu.equalsIgnoreCase("sub"))){
            int result1= cal1 - cal2;
            System.out.println(result1);
        } else if (calcu.equalsIgnoreCase("multiplication") || (calcu.equalsIgnoreCase("mult"))){
            int result2= cal1 * cal2;
            System.out.println(result2);
        } else if (calcu.equalsIgnoreCase("division") || (calcu.equalsIgnoreCase("div"))){
            if  (cal2 == 0) {
                System.out.println("the zero is not allowed");
            }else {
                  double result3 = (double) cal1 / cal2;
                    System.out.println(result3);
                 }
        } else{
            System.out.println("Invalid input");
        }
        
        System.out.println("Do you want to continue? (yes/no)");
        String answer = input.next();

        if (answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("y")){
            
        }else if (answer.equalsIgnoreCase("no")  || answer.equalsIgnoreCase("n")){
            System.out.println("Thanks for using the calculator");
        } else {
            System.out.println("Invalid answer");
        }
            answer = input.next();
        }
   }
}