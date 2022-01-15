package main;

import java.awt.*;

public class PixelColor {
    int r;
    int g;
    int b;

    public PixelColor(int sRGB){
        Color c = new Color(sRGB);
        r = c.getRed();
        g = c.getGreen();
        b = c.getBlue();
    }

}
