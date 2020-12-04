package explorer;

import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Desktop {
    private JButton startButton;
    private JComboBox optionsB;
    private JPanel desktop;
    private JButton fileExplorerButton;
    private JButton youtubeButton;
    private JButton calcButton;
    private JPanel jPanel;
    private JPanel jBotonesInicio;
    private JPanel jBarraHerramientas;
    private JPanel jBackground;


    ImageIcon iconobtn = new ImageIcon(new ImageIcon("src/images/youtube-app-icon-png-3.jpg").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

    public static void main(String[] args) {
        JFrame frame = new JFrame("Desktop");
        frame.setContentPane(new Desktop().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(800,600));
        frame.setVisible(true);


    }

    public Desktop(){
        botones();
    }

    public void botones(){
        youtubeButton.setIcon(iconobtn);
        youtubeButton.setIconTextGap(2);
        youtubeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        youtubeButton.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        youtubeButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        youtubeButton.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
    }



}
