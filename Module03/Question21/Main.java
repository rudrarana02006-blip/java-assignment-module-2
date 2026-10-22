import java.io.File;

public class Main {
    public static void listFiles(String directoryPath) {
        try {
            File directory = new File(directoryPath);

            if (!directory.exists()) {
                System.out.println("Directory does not exist: " + directoryPath);
                return;
            }

            if (!directory.isDirectory()) {
                System.out.println("Specified path is not a directory: " + directoryPath);
                return;
            }

            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Contents of " + directory.getAbsolutePath() + ":");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println("[DIR]  " + file.getName());
                    } else {
                        System.out.println("[FILE] " + file.getName() + " (" + file.length() + " bytes)");
                    }
                }
            } else {
                System.out.println("Cannot read directory contents.");
            }
        } catch (SecurityException e) {
            System.out.println("Permission denied: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String path = (args.length > 0) ? args[0] : ".";
        listFiles(path);
    }
}
