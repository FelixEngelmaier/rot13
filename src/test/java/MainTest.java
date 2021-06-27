import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public static void test_default(){
        //arrange
        int expected = 5;

        //act
        int actuall = Main.add(2,3);
        //assert
        Assertions.assertEquals(expected, actuall);
        }
}
