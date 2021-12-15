package co.com.criptology.modular.arithmetic.service;

import co.com.criptology.modular.arithmetic.business.ModularMath;
import org.springframework.stereotype.Service;

@Service
public class ModularArithmeticService implements IModularArithmeticService {

    @Override
    public int sum(int num1, int num2, int modulo) {
        if (isLessThanZero(num1) || isLessThanZero(num2)){
            throw new ArithmeticException("Numbers must be greater or equal than zero.");
        }
        if (isGreaterOrEqualThanModulo(num1, modulo) || isGreaterOrEqualThanModulo(num2, modulo)) {
            throw new IllegalArgumentException();
        }
        return ModularMath.sum(num1, num2, modulo);
    }

    @Override
    public int product(int num1, int num2, int modulo) {
        if (isLessThanZero(num1) || isLessThanZero(num2)){
            throw new ArithmeticException("Numbers must be greater or equal than zero.");
        }
        if (isGreaterOrEqualThanModulo(num1, modulo) || isGreaterOrEqualThanModulo(num2, modulo)) {
            throw new IllegalArgumentException();
        }
        return ModularMath.product(num1, num2, modulo);
    }

    @Override
    public int subtract(int num1, int num2, int modulo) {
        if (isLessThanZero(num1) || isLessThanZero(num2)){
            throw new ArithmeticException("Numbers must be greater or equal than zero.");
        }
        if (isGreaterOrEqualThanModulo(num1, modulo) || isGreaterOrEqualThanModulo(num2, modulo)) {
            throw new IllegalArgumentException();
        }
        return ModularMath.difference(num1, num2, modulo);
    }

    @Override
    public int division(int num1, int num2, int modulo) {
        if (isLessThanZero(num1) || isLessThanZero(num2)){
            throw new ArithmeticException("Numbers must be greater or equal than zero.");
        }
        if (isGreaterOrEqualThanModulo(num1, modulo) || isGreaterOrEqualThanModulo(num2, modulo)) {
            throw new IllegalArgumentException();
        }
        return ModularMath.division(num1, num2, modulo);
    }

    private boolean isGreaterOrEqualThanModulo(int number, int modulo) {
        return number >= modulo;
    }

    private boolean isLessThanZero(int number){
        return number < 0;
    }
}
