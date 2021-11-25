package homeWork8;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public void initWindow() {
        setSize(500,500);
        setLocation(650,250);
        int value = WindowConstants.EXIT_ON_CLOSE;
        setDefaultCloseOperation(value);

        GridLayout layout = new GridLayout(1, 2);
        JPanel panel = new JPanel(layout);

        JButton firstButton = new JButton("Выход");
        JButton secondButton = new JButton("Кнопка");
        //JButton thirdButton = new JButton("И так далее");
        panel.add(firstButton);
        panel.add(secondButton);
        //panel.add(thirdButton);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }
}
