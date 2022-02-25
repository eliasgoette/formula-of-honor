
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import javax.swing.*;

public class DescriptionWindow{
    public static void open(){
        JFrame frame = new JFrame();
        frame.setTitle("Kreisinterpolation Erklärung");
        frame.setSize(800, 600);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        BufferedImage descriptionImg;
        try {
            descriptionImg = ImageIO.read(new File("description.png"));
            JLabel descriptionImgLabel = new JLabel(new ImageIcon(descriptionImg));
            frame.add(descriptionImgLabel);
        } catch (IOException e) {
            e.printStackTrace();
        }
        


//        JLabel descriptionImg = new JLabel(new ImageIcon("description.jpg"));
//        descriptionImg.setBounds(100, 200, 300, 400);
//        frame.add(descriptionImg);
//        frame.pack();
    }
}