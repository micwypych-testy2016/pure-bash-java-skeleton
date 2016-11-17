
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {
    @Test
    public void fizzBuzzGiven1ExpectedString1() {
      //setup:
        Library lib = new Library();
      //expect:
        assertEquals("1",lib.fizzBuzz(1));
    }

    @Test
    public void fizzBuzzGiven3ExpectedStringFizz() {
      //setup:
        Library lib = new Library();
      //expected:
        assertEquals("Fizz",lib.fizzBuzz(3));
    }     
      
    @Test
    public void fizzBuzzGiven5ExpectedStringBuzz() {
      //setup:
        Library lib = new Library();
      //expected:
         assertEquals("Buzz",lib.fizzBuzz(5));
    }

    @Test
    public void fizzBuzzGiven15ExpectedStringFizzBuzz() {
      //setup:
        Library lib = new Library();
      //expected:
         assertEquals("FizzBuzz",lib.fizzBuzz(15));
    }

    @Test
    public void fizzBuzzGivenMinus1ExpectedStringEmpty() {
      //setup:
        Library lib = new Library();
      //expected:
         assertEquals("",lib.fizzBuzz(-1));
    }
}
