import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Read");
        mutableList.add("Only");

        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);
        System.out.println("Unmodifiable list: " + unmodifiableList);

        try {
            unmodifiableList.add("Modify");
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught UnsupportedOperationException when trying to modify unmodifiable list: " + e);
        }
    }
}
