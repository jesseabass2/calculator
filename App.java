import java.util.*;

public class App{
    static final Scanner inputScanner = new Scanner(System.in);
    

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        
        System.out.println("Enter a number: ");
        double num1 = inputScanner.nextDouble();
        System.out.println("Enter another number: ");
        double num2 = inputScanner.nextDouble();
        double result = 0;
        double result1 = calculator.add(num1,num2);
        double result2= calculator.subtract(num1,num2);
        double result3 = calculator.multiply(num1,num2);
        double result4 = calculator.divide(num1,num2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        





        //String result = String.format("You want to add %.2f and %.2f", num1, num2);
        //System.out.println(result);

        

        

        
    }


}