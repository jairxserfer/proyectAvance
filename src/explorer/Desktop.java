package explorer;

import javax.swing.*;

public class Desktop {
    private JButton startButton;
    private JComboBox optionsB;
    private JPanel desktop;
    private JButton fileExplorerButton;
    private JButton youtubeButton;
    private JButton calcButton;
    private JPanel jPanel;
    private JPanel space;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop");
        frame.setContentPane(new Desktop().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
