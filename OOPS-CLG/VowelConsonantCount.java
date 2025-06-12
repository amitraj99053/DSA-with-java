import java.io.*;
/* 
Develop a multi-threaded Java program that reads data from a file and counts
the number of vowels and consonants in separate threads. Task:
a) Implement two threads—one for counting vowels                      */

// Thread to count vowels
class VowelThread extends Thread {
    String data;

    VowelThread(String data) {
        this.data = data;
    }

    public void run() {
        int vowels = 0;
        for (char ch : data.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                vowels++;
            }
        }
        System.out.println("Vowel Count: " + vowels);
    }
}

// Thread to count consonants
class ConsonantThread extends Thread {
    String data;

    ConsonantThread(String data) {
        this.data = data;
    }

    public void run() {
        int consonants = 0;
        for (char ch : data.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch) && "aeiou".indexOf(ch) == -1) {
                consonants++;
            }
        }
        System.out.println("Consonant Count: " + consonants);
    }
}

public class VowelConsonantCount {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        // Read file content
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found.");
            return;
        }

        // Create threads
        VowelThread vt = new VowelThread(content.toString());
        ConsonantThread ct = new ConsonantThread(content.toString());

        // Start threads
        vt.start();
        ct.start();
    }
}
