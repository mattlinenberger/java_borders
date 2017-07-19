import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.Box.*;

public class FocusListeners
{
   JFrame win;
   JTextField txt1, txt2, txt3;
   Font font = new Font( "Courier New", Font.BOLD, 18 );
   
   public static void main( String [] args )
   {                         // call app constructor to
      new FocusListeners( ); // avoid percolation of 'static'
   }

   public FocusListeners( )  // app constructor
   {
      win = new JFrame( "Focus Listeners" );
      win.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      // build text fields
      // one
      txt1 = new JTextField( 15 );
      txt1.setText( "111" );
      txt1.setHorizontalAlignment( JTextField.CENTER );
      txt1.setFont( font );
      // two
      txt2 = new JTextField( 15 );
      txt2.setText( "222" );
      txt2.setHorizontalAlignment( JTextField.CENTER );
      txt2.setFont( font );      
      // three
      txt3 = new JTextField( 15 );
      txt3.setText( "333" );
      txt3.setHorizontalAlignment( JTextField.CENTER );
      txt3.setFont( font );
      // construct GUI
      // make a vertical box for the components
      Box box = createVerticalBox( );
      // add the text fields
      box.add( txt1 );
      box.add( createVerticalStrut( 20 ) );
      box.add( txt2 );
      box.add( createVerticalStrut( 20 ) );
      box.add( txt3 );
      // add to window
      win.setLayout( new FlowLayout( ) );
      win.add( box );
      // build and register focus handler
      MyFocusListener listener = new MyFocusListener( );
      txt1.addFocusListener( listener  );
      txt2.addFocusListener( listener );
      txt3.addFocusListener( listener );
      // set size and display
      win.setSize( 300, 300 );
      win.setVisible( true );
   }
  
   public class MyFocusListener implements FocusListener
   {
      // When a GUI component gets focus, a FocusEvent is
      // triggered that can be handled by morphing
      // the FocusListener's methods.
      // Since FocusListener is an interface, both of its
      // methods must be implemented.
      public void focusGained( FocusEvent e )
      {
         JTextField txt = (JTextField) e.getSource( );
         txt.selectAll( );
         txt.setBackground( Color.YELLOW );
      }
      public void focusLost( FocusEvent e )
      {
         JTextField txt = (JTextField) e.getSource( );
         txt.setBackground( Color.WHITE );
      }
   }
}
