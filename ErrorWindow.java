import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ErrorWindow {
    public static void showError(String title, String error){
        JFrame frame = new JFrame();
        frame.setTitle(title);
        frame.setSize(400, 300);
        frame.setLocation(200, 200);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        JLabel errJLabel = new JLabel(error);
        frame.add(errJLabel);

        JButton helpButton = new JButton("Hilfe");
        helpButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                DescriptionWindow.open();
            }
        });
        frame.add(helpButton);
    }
}