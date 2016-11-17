
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void testFizzBuzzForDifferentInputs() {
      //setup:
        Library lib = new Library();
      //expect:
        assertEquals("1",lib.fizzBuzz(1));
        assertEquals("2",lib.fizzBuzz(2));
        assertEquals("Fizz",lib.fizzBuzz(3));
        assertEquals("4",lib.fizzBuzz(4));
        assertEquals("Buzz",lib.fizzBuzz(5));
        assertEquals("Fizz",lib.fizzBuzz(6));
        assertEquals("FizzBuzz",lib.fizzBuzz(15));
    }
}
