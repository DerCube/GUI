import javax.swing.*;
import java.awt.*;
//GUI-Programmierung mit Swing
public class GUIbauen extends JFrame {
    Container c;
    JButton but1;
    JLabel lab1;
    JPanel pan1;
    public ImageIcon rick;

    public GUIbauen(){

        super("Wer das liest hat einen Kleinen Pullerman"); //Tietel des Fensters
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); //Damit sich fenster schließen
        this.setSize(500,500);

        c = this.getContentPane();

        c.setPreferredSize(this.getSize());
        int y;
        int x;
        c.setLocation(x=(int)(Math.random()*100),y=(int)(Math.random()*100));

        this.setVisible(true);

        setLayout(new FlowLayout());

        pan1 =new JPanel();
        but1 =new JButton("Knopper");
        lab1 =new JLabel("0");

        c.add(pan1);
        pan1.add(but1);
        pan1.add(lab1);

    }//end of Constructor

    public static void main(String[] args) {

        int x = 1000000000;
        for (int i = 0; i < x; i++) {

            GUIbauen gb = new GUIbauen();
            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
            gb.setLocation((int)mouseX-250+(int)(Math.random()*50),(int)mouseY-250+(int)(Math.random()*50));
        }
    }

}//end of all
