import javax.swing.*;
import java.awt.*;

public class GUIbauen extends JFrame {
    Container c;
    JButton but1;
    JLabel lab1;
    JPanel pan1;

    public GUIbauen(){

        super("Wer das liest hat einen Kleinen Pullerman"); //Tietel des Fensters
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Damit sich fenster schließen
        this.setSize(500,500);

        c=this.getContentPane();
        c.setPreferredSize(this.getSize());
        this.setVisible(true);

        pan1 =new JPanel();
        but1 =new JButton("Knopper");
        lab1 =new JLabel("0");

        c.add(pan1);
        pan1.add(but1);
        pan1.add(lab1);

    }//end of Constructor

    public static void main(String[] args) {
        //for (int i = 0; i < 400; i++) {
            GUIbauen gb = new GUIbauen();
        //}
    }

}//end of all
