// This file is auto-generated by pico-ops.py
// from pico-ops.yaml -- best edit it there.
package pico;
import org.junit.*;
import org.junit.rules.Timeout;
import static pico.Assertions.assertStack;

/** Here are operators on strings and characters. There is not a distinct
value type for characters in PicoScript -- they are either integers
or strings of length 1. In PostScript, strings are explicitly allocated
and are mutable; in PicoScript they are immutable. Therefore we support
some different operations on them, that will not work in Ghostscript
(noted below).
 */
public class StringOperators {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    /** Return the number of characters in a string or symbol.
Fails on values of other types.
 */
    @Test
    public void test_length() {
        // auto-generated from pico-ops.yaml
        assertStack("(Hello) length", "5");
        assertStack("/flibbert length", "8");
        assertStack("() length", "0");
        assertStack("(With\\)\\(parens) length", "12");
        assertStack("(with\\nnew\\nlines\\n) length", "15");
    }

    /** Return $N$th character in string, as an integer (the ASCII/Unicode
value of that character. Indexing starts at zero.
 */
    @Test
    public void test_get() {
        // auto-generated from pico-ops.yaml
        assertStack("(ABCDE) 0 get", "65");
        assertStack("(zyxwv) 4 get", "118");
    }

    /** Concatenate two strings into a new string. This is *not* a built-in
operator in Postscript, but we're trying to make Picoscript strings
more convenient (and immutable).
 */
    @Test
    public void test_strcat() {
        // auto-generated from pico-ops.yaml
        assertStack("(Hello) (World) strcat", "HelloWorld");
        assertStack("(Hello) (!) strcat", "Hello!");
        assertStack("() (Yes) strcat", "Yes");
        assertStack("(Yu) (Gi) (Oh) strcat strcat", "YuGiOh");
    }

    /** Convert integers or Booleans to strings. This is also *not* a
built-in operator in Postscript.
 */
    @Test
    public void test_tostr() {
        // auto-generated from pico-ops.yaml
        assertStack("128 256 mul tostr", "32768");
        assertStack("128 256 mul tostr length", "5");
        assertStack("(Beacon) 11 12 add tostr strcat", "Beacon23");
    }

    /** Convert an integer to a Unicode character, represented as a string
of length 1. This is *not* a built-in operator in Postscript.
 */
    @Test
    public void test_tochar() {
        // auto-generated from pico-ops.yaml
        assertStack("65 tochar", "A");
        assertStack("97 tochar", "a");
        assertStack("8364 tochar", "€");
        assertStack("76 67 tochar exch tochar strcat", "CL");
    }
}
