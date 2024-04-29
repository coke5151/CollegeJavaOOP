package EX_8_11;

public class MainApp {
    public static void main(String[] args) {
        Complex num1 = new Complex(4, 5);
        Complex num2 = new Complex(-1, 3);
        System.out.printf("num1: ");
        num1.printComplex();   
        System.out.printf("num2: ");
        num2.printComplex();
        System.out.printf("num1 + num2: ");
        Complex.add(num1, num2).printComplex();
        System.out.printf("num1 - num2: ");
        Complex.subtract(num1, num2).printComplex();
    }
}
