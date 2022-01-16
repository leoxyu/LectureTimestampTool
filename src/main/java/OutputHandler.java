import org.bytedeco.opencv.presets.opencv_core;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import exception class
import java.util.ArrayList;

// takes int[] of timestamps and outputs into text file stored in dir /OutputFolder
public class OutputHandler {


    public static boolean writeFile(ArrayList<String> arraylist) {
        System.out.println("Writing file...");
        try {
            FileWriter myWriter = new FileWriter("timestamps.txt");
            myWriter.write("=-=-=TIMESTAMPS=-=-=\n");
            // this should add the int to txt file
            for (int counter = 0; counter < arraylist.size(); counter++) {
                myWriter.write(arraylist.get(counter) + System.lineSeparator());
            }

            myWriter.close();
            System.out.println("Done.");
            return true;
        } catch (IOException e) {
            System.out.println("There was an error writing the timestamp text file.");
            e.printStackTrace();
            return false;
        }

    }

}