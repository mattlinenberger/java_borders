import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import static javax.swing.BorderFactory.*;

public class BorderFun extends JFrame
{

   public static void main(String[]args)
   {
      new BorderFun();

   }

   public BorderFun()
   {
      super("Border Fun");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel label = new JLabel("Street Address");
      //JLabel label2 = new JLabel("Phone Number");
      //JLabel label3 = new JLabel("Zip Code");
      //JLabel label4 = new JLabel("Name");
      this.setLayout(new FlowLayout());
      this.add(label);
      //this.add(label2);
      //this.add(label3);
      //this.add(label4);
      label.setFont(new Font("Dialog", Font.PLAIN,22));
      //label2.setFont(new Font("Dialog", Font.PLAIN,22));
      //label3.setFont(new Font("Dialog",Font.PLAIN,22));
      //label4.setFont(new Font("Dialog",Font.PLAIN,22));
      //Border bevel =  createBevelBorder(BevelBorder.RAISED);
     // Border border3 = createBevelBorder(BevelBorder.LOWERED);
      //Border border4 = createEtchedBorder(EtchedBorder.RAISED);
      //Border border2 = createEtchedBorder(EtchedBorder.LOWERED);
      //Border border5 = createLineBorder(Color.BLUE,5, true);
      //Border border5 = createMatteBorder(1,5,15,5, Color.RED);
      //Border empty10 = createEmptyBorder(10,10,10,10);
      //Border outsideBorder = createMatteBorder(1,5,15,5, Color.RED);
      //Border border = createCompoundBorder(outsideBorder,empty10);
      Border lBdr = createLineBorder(Color.BLUE,1);
      Border cBdr = createCompoundBorder(lBdr, createEmptyBorder(30,60,30,60));
      Border border = createTitledBorder(cBdr,"Street Address",
      TitledBorder.CENTER, TitledBorder.BELOW_BOTTOM);
      label.setBorder(border);
      
      // label2.setBorder(border2);
      // label3.setBorder(border3);
      //label4.setBorder(border4);
      //label3.setBorder(bevel3);
      //size and display window
      this.setSize(350,150);
      this.setVisible(true);
   }
}