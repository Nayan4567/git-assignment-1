import java.io.*;


public class FileIOExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("example.txt"); 
            BufferedReader reader = new BufferedReader(file);
            String line;
            
            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close(); // Close file
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
