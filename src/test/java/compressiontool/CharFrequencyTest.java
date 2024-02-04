package compressiontool;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CharFrequencyTest {

    @Test
    void testCharFrequency() {
        String filePath = "src/test/resources/test.txt";
        FrequencyTable table = new FrequencyTable(filePath);
        Assertions.assertEquals(333, table.getCount('X'));
        Assertions.assertEquals(223000, table.getCount('t'));
        Assertions.assertTrue(table.getTotalChars() > 0);
    }
}
