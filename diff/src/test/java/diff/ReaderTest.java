package diff;

import static org.junit.Assert.assertTrue;

import difflib.Delta;
import difflib.DiffUtils;
import difflib.Patch;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Test to Reader class.
 *
 * User: Oleg_Kariakin
 * Date: 11/27/15
 */
public class ReaderTest {

    private static final String ORIGINAL_FILE = "original.txt";
    private static final String REVISED_FILE = "revised.txt";

    private Reader readerUt;

    @Before
    public void setUp() throws Exception {
        readerUt = new Reader();
    }

    @Test
    public void testFileToLines() throws Exception {
        //given
        List<String> original = readerUt.fileToLines(ORIGINAL_FILE);
        List<String> revised  = readerUt.fileToLines(REVISED_FILE);

        //when
        Patch patch = DiffUtils.diff(original, revised);

        //expect
        for (Delta delta: patch.getDeltas()) {
            System.out.println(delta);
        }
        //TODO temporary solution, rewrite to normal tests
        assertTrue(true);
    }

}
