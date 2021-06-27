import at.engelmaier.swlcm.rot13.controllers.Rot13Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    public static void test_given_WeStartedAServer_when_WeProvideAnImputString_Then_TheCorrectConversionIsExpected(){
        //arrange
        String expected = "nfqs";

        //act
        String actuall = Rot13Controller.getRot13StringFromSourceString("asdf");
        //assert
        Assertions.assertEquals(expected, actuall);
    }
}
