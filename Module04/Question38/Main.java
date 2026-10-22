import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String text = "collections framework";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c != ' ') {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }
        }

        System.out.println("Character frequencies in '" + text + "':");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}
