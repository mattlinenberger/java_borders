import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;

public class UserForm extends JFrame implements ActionListener
{

   public static void main(String[]args)
   {
   
   new UserForm();
   
   }
   
   //Declare labels and textfields as "Global"
   private JLabel firstlbl,lastlbl, addresslbl, citylbl, statelbl, ziplbl, phonelbl, emaillbl;
   private JTextField firstTxt,lastTxt, addressTxt, cityTxt, stateTxt, zipTxt, phoneTxt, emailTxt;
   private Font font = new Font("Dialog", Font.PLAIN, 18);
   //Declare gridLayout
   private GridLayout grid = new GridLayout(8,2);
   
   
   
   public JLabel makeLbl(String text) 
   {
      JLabel temp = new JLabel(text, SwingConstants.RIGHT);
      temp.setFont(font);
      this.add(temp);
      return temp;
   }
   
     public JTextField makeTxt() 
   {
      
      JTextField temp = new JTextField(10);
      temp.setFont(font);
      this.add(temp);
      return temp;
   }
   
   
   public void actionPerformed(ActionEvent e)
   {
   
   }
   
   
   public UserForm()
   {
      super("Address Book");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout( grid );
      //Create labels
      firstlbl = makeLbl("First Name"); firsttxt = makeTxt();
      lastlbl = makeLbl("Last Name");  lasttxt = makeTxt();
      addresslbl = makeLbl("Address"); addresstxt = makeTxt();
      citylbl = makeLbl("City"); citytxt = makeTxt();
      statelbl = makeLbl("State");  statetxt = makeTxt();
      ziplbl = makeLbl("Zip Code"); ziptxt = makeTxt();
      phonelbl = makeLbl("Phone Number"); phonetxt = makeTxt();
      emaillbl = makeLbl("Email");  emailtxt = makeTxt();
      //configure window
   
      this.setSize(300,500);
      this.setVisible(true);
      
         
   
   }


}


