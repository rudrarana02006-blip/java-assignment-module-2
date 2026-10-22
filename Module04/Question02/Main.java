class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> student = new Pair<>("Rudra", 100);
        System.out.println("Key: " + student.getKey() + ", Value: " + student.getValue());

        student.setKey("Rudra Rana");
        student.setValue(98);
        System.out.println("Updated Key: " + student.getKey() + ", Updated Value: " + student.getValue());
    }
}
