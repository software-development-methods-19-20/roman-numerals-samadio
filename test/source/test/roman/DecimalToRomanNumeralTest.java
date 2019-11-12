package test.roman;

import dssc.roman.RomanNumeral;
import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToRomanNumeralTest {

    @Test
    void zeroIsEmpty() {
        RomanNumeral romanNumeral= new RomanNumeral(0);
        assertEquals("",romanNumeral.toString());
    }
}
