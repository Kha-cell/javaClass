import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertTimeToWordsTest {

    @Test
    public void testConvertTimeToWords() {
        assertEquals("zero o'clock", ConvertTimeToWords.convertTimeToWords(0, 0));
    }

}