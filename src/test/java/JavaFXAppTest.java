import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }

    @Test
    void divideTest(){assertEquals(5, new JavaFXApp().computeDivide(10, 2));}

    @Test
    void multiplyTest(){assertEquals(16, new JavaFXApp().computeMultiply(4,4));}
}