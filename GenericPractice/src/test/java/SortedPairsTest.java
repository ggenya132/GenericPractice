import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Panda on 2/17/2017.
 */
public class SortedPairsTest {
    SortedPair<Integer> sortedPair;
    @Before
    public void setUp(){sortedPair = new SortedPair<>(3, 2);}

    @Test
    public void sortedPairConstructerTest() {
        int actual = sortedPair.getFirst();
        int expected = 2;
        assertEquals("I expect the order to be 1 then 2", expected, actual);
    }

}
