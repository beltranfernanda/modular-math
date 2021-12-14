package co.com.criptology.modular.arithmetic.service;

public interface IModularArithmeticService {

    int sum(int num1, int num2, int modulo);

    int product(int num1, int num2, int modulo);

    int subtract(int num1, int num2, int modulo);

    int division(int num1, int num2, int modulo);
}
