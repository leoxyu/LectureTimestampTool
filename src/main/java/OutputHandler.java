import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import exception class

// takes int[] of timestamps and outputs into text file stored in dir /OutputFolder
public class OutputHandler {

    public class CreateFile {
        public void main(String[] args) {
            try {
                // to create file in new directory
                // File myObj = new File("C:\\Users\\MyName\\filename.txt");
                File myObj = new File("filename.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

    public class WriteToFile {
        public void main(String[] args) {
            try {
                FileWriter myWriter = new FileWriter("filename.txt");
                myWriter.write("output test");
                /*
                // this should add the int to txt file
                for (int counter = 0; counter < arrlist.size(); counter++) {
                    writer.write(arrlist.get(counter) + System.lineSeparator());
                }
                */
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

}