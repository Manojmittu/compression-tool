package compressiontool;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyTable {

    private final Map<Character, Long> freqMap;

    public FrequencyTable(String filePath) {
        this.freqMap = new HashMap<>();
        initTable(filePath);
    }

    private void initTable(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            while (line != null) {
                updateFreq(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error reading file " + e);
        }
    }

    private void updateFreq(String line) {
        int length = line.length();
        for (int i = 0; i < length; i++) {
            char ch = line.charAt(i);
            if (this.freqMap.containsKey(ch)) {
                this.freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                this.freqMap.put(ch, 1L);
            }
        }
    }

    public long getCount(Character ch) {
        return freqMap.get(ch);
    }

    public int getTotalChars() {
        return this.freqMap.size();
    }
}
