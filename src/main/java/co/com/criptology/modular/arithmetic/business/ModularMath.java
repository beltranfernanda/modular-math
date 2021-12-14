package co.com.criptology.modular.arithmetic.business;

public final class ModularMath {

    private ModularMath() {
        throw new Error("ModularMath.class Cannot be instantiate");
    }

    public static int sum(int num1, int num2, int modulo) {
        return (num1 + num2) % modulo;
    }

    public static int product(int num1, int num2, int modulo) {
        return (num1 * num2) % modulo;
    }

    public static int difference(int num1, int num2, int modulo) {
        if (num2 > num1) {
            return ((num1 - num2) % modulo) + modulo;
        }
        return (num1 - num2) % modulo;
    }

    public static int division(int num1, int num2, int modulo){
        for (int x=0; x<modulo; x++){
            if (num1 == product(num2, x, modulo)){
                return x;
            }
        }
        throw new ArithmeticException(String.format("Cannot execute modular division: %d / %d", num1, num2));
    }
}
