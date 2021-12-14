package co.com.criptology.modular.arithmetic.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModularMathTest {

    @Test
    public void ZeroPlusZeroModuloTenIsZero() {
        Assertions.assertEquals(0, ModularMath.sum(0, 0, 10));
    }

    @Test
    public void TwoPlusThreeModuloTenIsFive() {
        Assertions.assertEquals(5, ModularMath.sum(2, 3, 10));
    }

    @Test
    public void FivePlusEightModuloTenIsThree() {
        Assertions.assertEquals(3, ModularMath.sum(5, 8, 10));
    }

    @Test
    public void TenPlusTwentyModuloTwelveIsSix() {
        Assertions.assertEquals(6, ModularMath.sum(10, 20, 12));
    }

    @Test
    public void TwoTimesThreeModuloTenIsSix() {
        Assertions.assertEquals(6, ModularMath.product(2, 3, 10));
    }

    @Test
    public void FiveTimesEightModuloTenIsZero() {
        Assertions.assertEquals(0, ModularMath.product(5, 8, 10));
    }

    @Test
    public void FourTimesSevenModuloTwelveIsFour() {
        Assertions.assertEquals(4, ModularMath.product(4, 7, 12));
    }

    @Test
    public void FourMinusThreeModuloTenIsOne() {
        Assertions.assertEquals(1, ModularMath.difference(4, 3, 10));
    }

    @Test
    public void EightMinusTwoModuloTenIsSix() {
        Assertions.assertEquals(6, ModularMath.difference(8, 2, 10));
    }

    @Test
    public void OneMinusNineModuloTenIsTwo() {
        Assertions.assertEquals(2, ModularMath.difference(1, 9, 10));
    }

    @Test
    public void FiveMinusEightModuloTenIsSeven() {
        Assertions.assertEquals(7, ModularMath.difference(5, 8, 10));
    }

    @Test
    public void TwoMinusTenModuloTwelveIsFour() {
        Assertions.assertEquals(4, ModularMath.difference(2, 10, 12));
    }

    @Test
    public void TwoDividedByFourModuloTenIsThree(){
        Assertions.assertEquals(3, ModularMath.division(2,4,10));
    }

    @Test
    public void AnyNumberDividedByZeroReturnError(){
        Assertions.assertThrows(Exception.class, () -> ModularMath.division(5,0,10));
    }

    @Test
    public void EightDividedByFourModuloTwelveIsFive(){
        Assertions.assertEquals(5, ModularMath.division(8,4,12));
    }
}
