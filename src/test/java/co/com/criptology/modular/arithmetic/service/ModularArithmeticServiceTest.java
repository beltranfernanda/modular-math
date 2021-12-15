package co.com.criptology.modular.arithmetic.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModularArithmeticServiceTest {

    private IModularArithmeticService modArithmetic = new ModularArithmeticService();

    @Test
    public void summandsCannotBeGreaterThanModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.sum(15, 1, 10));
    }

    @Test
    public void summandsCannotBeEqualToModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.sum(1, 10, 10));
    }

    @Test
    public void summandsCannotBeLessThanZero(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.sum(-2, 5, 10));
    }

    @Test
    public void factorsInProductCannotBeGreaterThanModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.product(20, 4, 12));
    }

    @Test
    public void factorsInProductCannotBeEqualToModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.product(2, 12, 12));
    }

    @Test
    public void factorsInProductCannotBeLessThanZero(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.product(2, -8, 12));
    }

    @Test
    public void termsInSubtractionCannotBeGreaterThanModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.subtract(15, 2, 11));
    }

    @Test
    public void termsInSubtractionCannotBeEqualToModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.subtract(1, 11, 11));
    }

    @Test
    public void termsInSubtractionCannotLessThanZero(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.subtract(-1, 9, 11));
    }

    @Test
    public void termsInDivisionCannotBeGreaterThanModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.division(14,1,10));
    }

    @Test
    public void termsInDivisionCannotBeEqualToModulo(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.division(4,10,10));
    }

    @Test
    public void termsInDivisionCannotBeLessThanZero(){
        Assertions.assertThrows(Exception.class, () -> modArithmetic.division(4,-4,10));
    }
}
