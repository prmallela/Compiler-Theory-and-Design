// This file is auto-generated by pico-ops.py
// from pico-ops.yaml -- best edit it there.
package pico;
import org.junit.*;
import org.junit.rules.Timeout;
import static pico.Assertions.assertStack;

/** These operators are purely for manipulating values on the stack,
so they work with values of any type.
 */
public class StackOperators {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(5);

    /** Discard top element. */
    @Test
    public void test_pop() {
        // auto-generated from pico-ops.yaml
        assertStack("52 54 pop", "52");
        assertStack("/a (b) pop", "a");
    }

    /** Exchange top two elements. */
    @Test
    public void test_exch() {
        // auto-generated from pico-ops.yaml
        assertStack("52 54 exch", "54", "52");
        assertStack("/a (b) exch", "b", "a");
    }

    /** Duplicate top element. */
    @Test
    public void test_dup() {
        // auto-generated from pico-ops.yaml
        assertStack("71 dup", "71", "71");
        assertStack("45 50 dup", "45", "50", "50");
    }

    /** Duplicate top $N$ elements, where $N$ is the integer
on the top of the stack (and not included in the result).
 */
    @Test
    public void test_copy() {
        // auto-generated from pico-ops.yaml
        assertStack("90 80 70 60 2 copy", "90", "80", "70", "60", "70", "60");
        assertStack("13 14 15 3 copy", "13", "14", "15", "13", "14", "15");
    }

    /** Duplicate an arbitrary element on the stack. Writing `0 index`
is equivalent to `dup`, but we can use positive integers to
dig deeper into the stack.
 */
    @Test
    public void test_index() {
        // auto-generated from pico-ops.yaml
        assertStack("13 14 15 0 index", "13", "14", "15", "15");
        assertStack("13 14 15 1 index", "13", "14", "15", "14");
        assertStack("13 14 15 2 index", "13", "14", "15", "13");
    }

    /** Discard all elements on the stack. */
    @Test
    public void test_clear() {
        // auto-generated from pico-ops.yaml
        assertStack("71 72 73 clear");
        assertStack("clear");
    }

    /** Push the current size of the stack (not including this result).
Also, it leaves all the elements on the stack.
 */
    @Test
    public void test_count() {
        // auto-generated from pico-ops.yaml
        assertStack("71 72 73 count", "71", "72", "73", "3");
        assertStack("99 count", "99", "1");
        assertStack("count", "0");
    }
}
