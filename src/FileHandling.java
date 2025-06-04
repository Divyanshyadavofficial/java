import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandling {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.println("Enter some letters (press Enter to stop):");
            int letters = isr.read();
            while (letters != -1 && letters != '\n') {  // Stop at Enter
                System.out.println((char) letters);
                letters = isr.read();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
