import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling { 
    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is a file handling example in Java.\n");
            writer.write("This file contains multiple lines of text.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred during writing.");
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;

            System.out.println("\nReading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred during reading.");
            e.printStackTrace();
        }
    }
}
