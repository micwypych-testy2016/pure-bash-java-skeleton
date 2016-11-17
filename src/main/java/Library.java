
public class Library {
    public String fizzBuzz(int i) {
        String str = "";
        if ( i % 3 == 0 ) {
            str += "Fizz";
        }
        if ( i % 5 == 0 ) {
            str += "Buzz";
        }
        if ( i % 3 != 0 && i % 5 != 0 ) {
            str = Integer.toString(i);
        }
        return str;
    }
}
