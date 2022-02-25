import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Window{
    public void create(){
        JFrame frame = new JFrame();
        frame.setTitle("Kreisinterpolation Java");
        frame.setSize(800, 600);
        frame.setLocation(100, 100);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel titleLabel = new JLabel("Punkt auf Kreisbahn berechnen");
        frame.add(titleLabel);

        JButton helpButton = new JButton("Help");
        helpButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DescriptionWindow.open();
            }
        });

        frame.add(helpButton);

        frame.pack();
    }
}