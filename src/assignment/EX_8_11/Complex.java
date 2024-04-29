package EX_8_11;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public Complex(double real, double imagine) {
        this.realPart = real;
        this.imaginaryPart = imagine;
    }

    public double getRealPart() {
        return this.realPart;
    }

    public double getImaginaryPart() {
        return this.imaginaryPart;
    }

    public static Complex add(Complex augend, Complex addend) {
        return new Complex(augend.getRealPart() + addend.getRealPart(), augend.getImaginaryPart() + addend
                .getImaginaryPart());
    }

    public static Complex subtract(Complex minuend, Complex subtrahend) {
        return new Complex(minuend.getRealPart() - subtrahend.getRealPart(),
                minuend.getImaginaryPart() - subtrahend.getImaginaryPart());
    }

    public void printComplex() {
        System.out.printf("(%f, %f)\n", realPart, imaginaryPart);
    }
}
