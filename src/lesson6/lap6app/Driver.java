package lesson6.lap6app;

import javax.swing.*;
import java.awt.*;

public class Driver {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new BookClub();
            frame.setTitle("Book Club");
            frame.setDefaultCloseOperation(3);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            frame.setLocation(
                    (toolkit.getScreenSize().width - frame.getSize().width) / 2,
                    (toolkit.getScreenSize().height - frame.getSize().height) / 3);
            frame.setVisible(true);
        });
    }
}

