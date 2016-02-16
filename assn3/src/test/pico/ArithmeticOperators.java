// This file is auto-generated by pico-ops.py
// from pico-ops.yaml -- best edit it there.
package pico;
import org.junit.*;
import org.junit.rules.Timeout;
import static pico.Assertions.assertStack;

/** These are the usual arithmetic operators on integers. The full Postscript
language also supports conversion to floating-point numbers, which is why
we distinguish `idiv` for integer division. PicoScript does not support
floating-point.
 */
public class ArithmeticOperators {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    /** Add two integers. */
    @Test
    public void test_add() {
        // auto-generated from pico-ops.yaml
        assertStack("3 4 add", "7");
        assertStack("3 -9 add", "-6");
    }

    /** Integer division -- result is an integer. */
    @Test
    public void test_idiv() {
        // auto-generated from pico-ops.yaml
        assertStack("60 4 idiv", "15");
        assertStack("60 3 idiv", "20");
        assertStack("60 7 idiv", "8");
    }

    /** Multiply two integers */
    @Test
    public void test_mul() {
        // auto-generated from pico-ops.yaml
        assertStack("3 4 mul", "12");
        assertStack("3 -4 mul", "-12");
        assertStack("-3 -4 mul", "12");
    }

    /** Subtract two integers. Be careful about the ordering, because
subtraction is not commutative.
 */
    @Test
    public void test_sub() {
        // auto-generated from pico-ops.yaml
        assertStack("9 2 sub", "7");
        assertStack("2 9 sub", "-7");
    }

    /** Remainder after dividing -- like the `%` operator in C/C++/Java. */
    @Test
    public void test_mod() {
        // auto-generated from pico-ops.yaml
        assertStack("8 3 mod", "2");
        assertStack("60 7 mod", "4");
    }
}
