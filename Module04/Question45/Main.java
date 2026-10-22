import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> productPrices = new TreeMap<>();
        productPrices.put("Laptop", 1200.0);
        productPrices.put("Keyboard", 75.5);
        productPrices.put("Mouse", 25.0);
        productPrices.put("Monitor", 300.0);
        productPrices.put("Headphones", 80.0);

        System.out.println("Product Catalog sorted by name (TreeMap):");
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            System.out.println(entry.getKey() + " : $" + entry.getValue());
        }
    }
}
