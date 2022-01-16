import org.bytedeco.opencv.presets.opencv_core;

import java.io.File;  // Import the File class
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import exception class
import java.util.ArrayList;

// takes int[] of timestamps and outputs into text file stored in dir /OutputFolder
public class OutputHandler {


    public static boolean writeFile(ArrayList<String> arraylist) {
        try {
            FileWriter myWriter = new FileWriter("Timestamps.txt");
            //myWriter.write("       _    \n");
            //myWriter.write("     c -.   █░░ █ █▀ ▀█▀   █▀█ █▀▀   ▀█▀ █ █▀▄▀█ █▀▀ █▀ ▀█▀ ▄▀█ █▀▄▀█ █▀█ █▀\n");
            //myWriter.write("\\_   / \\    █▄▄ █ ▄█ ░█░   █▄█ █▀░   ░█░ █ █░▀░█ ██▄ ▄█ ░█░ █▀█ █░▀░█ █▀▀ ▄█\n");
            //myWriter.write("  \\_| ||    \uD835\uDE50\uD835\uDE48\uD835\uDE3C\uD835\uDE44\uD835\uDE4D / \uD835\uDE50\uD835\uDE63\uD835\uDE5E\uD835\uDE69\uD835\uDE5A\uD835\uDE59 \uD835\uDE48\uD835\uDE64\uD835\uDE63\uD835\uDE60\uD835\uDE5A\uD835\uDE6E\uD835\uDE68 \uD835\uDE3C\uD835\uDE5C\uD835\uDE56\uD835\uDE5E\uD835\uDE63\uD835\uDE68\uD835\uDE69 \uD835\uDE44\uD835\uDE63\uD835\uDE5B\uD835\uDE5E\uD835\uDE63\uD835\uDE5E\uD835\uDE69\uD835\uDE5A \uD835\uDE4D\uD835\uDE5A\uD835\uDE58\uD835\uDE6A\uD835\uDE67\uD835\uDE68\uD835\uDE5E\uD835\uDE64\uD835\uDE63    \n");
            // this should add the int to txt file
            for (int counter = 0; counter < arraylist.size(); counter++) {
                myWriter.write(arraylist.get(counter) + System.lineSeparator());
            }

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }

    }

}