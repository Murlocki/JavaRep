import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShowImageFrame {
    private final BufferedImage im;
    public ShowImageFrame(String path){
        try {
            im = ImageIO.read( new File(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public JLabel printImage(){
        ImageIcon imageIcon = new ImageIcon(this.im);
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        JLabel ma = new JLabel(imageIcon);
        ma.setPreferredSize(new Dimension(500,500));
        return ma;
    }
}
