import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Main {

    public static ArrayList<BufferedImage> imageArray = new ArrayList();
    static ArrayList<String> timestampArray = new ArrayList();

    // shouldn't write code here until other classes are complete
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Please enter the pathname of the video.");
//        String path = scanner.nextLine();

        String input = "C://Users//Leo//Downloads//CS313Lecture.mp4";
        String output = "C://Users//Leo//Downloads//output.mp4";

        double videoLength = VideoCompressor.compress(input, output)/1000000;

        VideoConverter videoConverter = new VideoConverter();
        videoConverter.inputVideo(output, imageArray);

        double secondsPerFrame = videoLength/imageArray.size();
        timestampArray = FrameCompare.timeStamp(imageArray, secondsPerFrame);
        OutputHandler.writeFile(timestampArray);


        //call input handler
        System.out.println("main class ends");
        // write your code here
    }
}
