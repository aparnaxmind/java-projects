import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
 Calculator objCalcUnderTest;

    @BeforeEach
    public void setUp() {
//Arrange
        objCalcUnderTest = new Calculator();
    }
    @Test
    @DisplayName("simple addition should work")
    void testAdd(){
//Assert
        assertEquals(9,Calculator.add(4,5));
    }
    @Test
    @DisplayName("simple subtraction should work")
    void testsubtract(){
//Assert
        assertEquals(1,Calculator.subtract(5,4));
    }
    @Test
    @DisplayName("simple multiplication should work")
    void testmultiply(){
//Assert
        assertEquals(20,Calculator.multiply(4,5));
    }
    @Test
    @DisplayName("simple division should work")
    void testdivision(){
//Assert
        assertEquals(1.25,Calculator.divide(5,4));
    }

    }



