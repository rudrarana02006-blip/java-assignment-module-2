import java.util.Map;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, String> weakMap = new WeakHashMap<>();

        String key1 = new String("Key1");
        String key2 = new String("Key2");

        weakMap.put(key1, "Value1");
        weakMap.put(key2, "Value2");

        System.out.println("WeakHashMap before nullifying key1: " + weakMap);

        key1 = null;
        System.gc();
        Thread.sleep(100);

        System.out.println("WeakHashMap after nullifying key1 and running GC: " + weakMap);
    }
}
