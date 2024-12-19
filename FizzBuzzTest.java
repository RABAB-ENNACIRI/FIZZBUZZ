package exercice3.TDD;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    // FizzBuzz.de(1)  -> "1"
    // FizzBuzz.de(3)  -> "Fizz"


    
    // FizzBuzz.de(5)  -> "Buzz"
    // FizzBuzz.de(15) -> "FizzBuzz"

    @Test
    public void testpour1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1",fizzBuzz.de(1) );
    }

}
