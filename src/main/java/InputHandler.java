import org.bytedeco.javacv.*;
import org.bytedeco.opencv.opencv_core.Buffer;
import org.bytedeco.opencv.opencv_core.IplImage;
import sun.plugin.javascript.navig.FrameArray;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

// read the video files inside the /InputFolder directory
// input into an array of videos
public class InputHandler {

    public static ArrayList<BufferedImage> imageArray = new ArrayList<BufferedImage>();

    public static void main(String[] args) throws IOException {

        Scanner pathScan = new Scanner(System.in);




        //System.out.println("Please Enter The Full Video Path:");
        //String vidPath = pathScan.nextLine();
        //C://Users//ayyan//IdeaProjects//LectureTimestampTool//InputVideos//Intro.mp4


        FFmpegFrameGrabber inputVid = new FFmpegFrameGrabber("C://Users//ayyan//IdeaProjects//LectureTimestampTool//InputVideos//output.mp4");

        inputVid.start();

        Java2DFrameConverter converter2 = new Java2DFrameConverter();

        double currentProgress = 0;

        int counter = 0;

        //convert frames to images in array
        //number added to i sets how many frames to skip
        for (int i = 0; i < inputVid.getLengthInVideoFrames(); i+=5) {


            currentProgress = (double) i / inputVid.getLengthInVideoFrames() * 100;


            System.out.println("Percent Complete: " + String.format("%.2f", currentProgress) + "%");

                inputVid.setVideoFrameNumber(i); //keep this line, idk why but it avoids null conflicts
              BufferedImage f = converter2.convert(inputVid.grabKeyFrame());

              //ImageIO.write(f, "png", new File("C://Users//ayyan//IdeaProjects//LectureTimestampTool//OutputImages//img-" + counter + ".png"));
                imageArray.add(f);
                  counter++;
        }

        inputVid.stop();


    }


}
