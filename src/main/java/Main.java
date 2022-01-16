import javafx.stage.FileChooser;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<BufferedImage> imageArray = new ArrayList();
    static ArrayList<String> timestampArray = new ArrayList();

    // shouldn't write code here until other classes are complete
    public static void main(String[] args) {

        JFileChooser j = new JFileChooser("./././InputFolder/");
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        j.showSaveDialog(null);
        // Open the save dialog

        File file = j.getSelectedFile();
        String fileName = file.getName();

        //System.out.println(fileName);

        String input = "./././InputFolder/" + fileName;
        String output = "././././temp.mp4";

        double videoLength = VideoCompressor.compress(input, output) / 1000000;
        if (videoLength == -1.0E-6) {
            System.exit(0);
        }

        VideoConverter videoConverter = new VideoConverter();
        if (!videoConverter.inputVideo(output, imageArray)) {
            System.exit(0);
        }

        double secondsPerFrame = videoLength / imageArray.size();
        timestampArray = FrameCompare.timeStamp(imageArray, secondsPerFrame);
        OutputHandler.writeFile(timestampArray);
        System.out.println("Timestamps written to timestamps.txt");

        //try to open file
        try {
            File timestamps = new File("././././timestamps.txt");
            Desktop desktop = Desktop.getDesktop();
            if(timestamps.exists()){
                desktop.open(timestamps);
            }
        }catch (Exception e){
            System.out.println("Could not automatically open timestamps.txt");
        }

        if(new File(output).delete()){

        }else{

        }
    }


}
