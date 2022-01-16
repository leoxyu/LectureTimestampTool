import javafx.stage.FileChooser;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<BufferedImage> imageArray = new ArrayList();
    static ArrayList<String> timestampArray = new ArrayList();

    // shouldn't write code here until other classes are complete
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the name of the video. (with file extension)");
        String path = scanner.nextLine();

        String input = "./././InputFolder/" + path;
        String output = "././././temp.mp4";

        double videoLength = VideoCompressor.compress(input, output) / 1000000;
        if (videoLength == -1.0E-6) {
            System.exit(0);
        }


        VideoConverter videoConverter = new VideoConverter();
        if (videoConverter.inputVideo(output, imageArray)) {
            System.exit(0);
        }

        double secondsPerFrame = videoLength / imageArray.size();
        timestampArray = FrameCompare.timeStamp(imageArray, secondsPerFrame);
        OutputHandler.writeFile(timestampArray);
        System.out.println("Timestamps written to Timestamps.txt");

        new File(output).delete();
    }


}
