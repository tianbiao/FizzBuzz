import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void should_get_output_after_run_application(){
        FizzBuzz.main(new String[]{});
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz 31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz 41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz 61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz 71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz 91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz ", outContent.toString());
    }

    @Test
    public void should_get_1_give_1(){
        assertEquals("1", FizzBuzz.getFizzBuzz(1));
    }

    @Test
    public void should_get_fizz_give_3_or_6(){
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(3));
        assertEquals("Fizz", FizzBuzz.getFizzBuzz(6));
    }

    @Test
    public void should_get_fizz_give_5_or_10(){
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(5));
        assertEquals("Buzz", FizzBuzz.getFizzBuzz(10));
    }

    @Test
    public void should_get_fizz_buzz_give_15_or_30(){
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzz.getFizzBuzz(30));
    }

}