import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SomeClassTest {
    SomeClass objSomeClass;
    @BeforeEach
    public void setUp() {
//Arrange
        objSomeClass = new SomeClass();
    }
    @Test
    @DisplayName("simple multiplicaton with 2 should work")
    void testdoubleANumber(){
//Assert
        assertEquals(8,SomeClass.doubleANumber(4));
    }
    @Test
    @DisplayName("returnABoolean should work")
    void testreturnABoolean(){
//Assert

        assertTrue(SomeClass.returnABoolean("save"));
        assertFalse(SomeClass.returnABoolean("save the"));
    }
    @Test
    @DisplayName("voidFoo should work")
    void testvoidFoo(){
//Assert
        assertEquals(0,SomeClass.voidFoo("ok"));

    }

}
