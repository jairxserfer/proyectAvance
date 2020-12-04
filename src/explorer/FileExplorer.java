package explorer;

import javax.swing.*;
import java.awt.*;

public class FileExplorer {
    private JLabel fileLabel;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JButton newFolderButton;
    private JButton newFileButton;
    private JButton renameButton;
    private JButton moveButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JLabel routeL;
    private JLabel route;
    private JButton startButton;
    private JButton fileExplorerButton;
    private JPanel jpanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("FileExplorer");
        frame.setContentPane(new FileExplorer().jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);
    }
}
