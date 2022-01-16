import org.bytedeco.javacv.*;

// takes video and reduces resolution to (?)
// the function should take in video and return video
public class VideoCompressor {


    public static double compress(String input, String output) {
        System.out.println("Compressing video...");
        double videoLength = 0;
        //String input = "C://Users//Leo//Downloads//CS313Lecture.mp4";
        //String output = "C://Users//Leo//Downloads//output.mp4";

        try {
            FFmpegFrameGrabber grabber = new FFmpegFrameGrabber(input);
            grabber.start();

            videoLength = grabber.getLengthInTime();
            double width = grabber.getImageWidth();
            double height = grabber.getImageHeight();
            double ratio = height / width;

            Frame grabbedImage = grabber.grab();
            grabber.setFrameRate(grabber.getFrameRate());
            FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(output, 100, (int) (ratio * 100));
            // You can change these parameters for your needs
            recorder.setVideoCodec(grabber.getVideoCodec());
            recorder.setFormat(grabber.getFormat());
            recorder.setAudioChannels(grabber.getAudioChannels());
            recorder.setAudioCodec(grabber.getAudioCodec());
            recorder.setAudioBitrate(1);
            recorder.setFrameRate(grabber.getFrameRate());
            recorder.setVideoBitrate(grabber.getVideoBitrate());

            recorder.start();

            while ((grabbedImage = grabber.grab()) != null) {
                //System.out.println(grabber.getTimestamp());

                // grab 1 out of every 30 frames
                for (int i = 0; i < 29; i++) {
                    grabber.grab();
                }
                if (grabber.getTimestamp() > (grabber.getLengthInTime())) {
                    break;
                }
                // here you can draw or add some image to video frame
                recorder.record(grabbedImage);
            }
            recorder.stop();
            grabber.stop();
            System.out.println("Done.");
            return videoLength;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("There was an error compressing the video.");
            return -1.0;
        }
    }
}

