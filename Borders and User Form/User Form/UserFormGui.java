import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import static javax.swing.Box.*;
import static javax.swing.BorderFactory.*;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class UserFormGui extends JFrame implements ActionListener {

	public static void main(String[] args) {

		new UserFormGui();

	}

	// declare labels and text fields as "global"
	private JLabel firstLbl, lastLbl, addLbl, add2Lbl, cityLbl, stateLbl, zipLbl, phoneLbl, emailLbl, dobLbl;
	private JTextField firstTxt, lastTxt, add1Txt, add2Txt, cityTxt, stateTxt, zipTxt, phoneTxt, emailTxt, dobTxt;
	private Font font = new Font("Courier New", Font.BOLD, 18);
	private Font font2 = new Font("Ariel", Font.PLAIN, 12);
  

	// declare input validation patterns
	private Pattern wordPtn, addPtn, statePtn, zipPtn, phonePtn, emailPtn, dobPtn;

	public JLabel makeLbl(String text) {
		JLabel temp = new JLabel(text, SwingConstants.RIGHT);
		temp.setFont(font2);
		temp.setForeground(new Color(150, 150, 150));
		this.add(temp);
		return temp;

	}

	public JTextField makeTxt() {
		JTextField temp = new JTextField(10);

		temp.setFont(font);
		this.add(temp);
		temp.addActionListener((ActionListener) this);
		return temp;

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == firstTxt) {
			if (wordPtn.matcher(firstTxt.getText()).matches()) {
				firstTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Incorrect first name input");
				firstTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == lastTxt) {
			if (wordPtn.matcher(lastTxt.getText()).matches()) {
				lastTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Incorrect last name input");
				lastTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == add1Txt) {
			if (addPtn.matcher(add1Txt.getText()).matches()) {
				add1Txt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad addres");
				add1Txt.setForeground(Color.RED);
			}

		} else if (e.getSource() == add2Txt) {
			if (addPtn.matcher(add2Txt.getText()).matches()) {
				add2Txt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad addres");
				add2Txt.setForeground(Color.RED);
			}

		} else if (e.getSource() == cityTxt) {

			if (wordPtn.matcher(cityTxt.getText()).matches()) {
				cityTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad City");
				cityTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == stateTxt) {

			if (!statePtn.matcher(stateTxt.getText()).matches()) {
				stateTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad State");
				stateTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == zipTxt) {
			if (zipPtn.matcher(zipTxt.getText()).matches()) {
				zipTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad Zip");
				zipTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == phoneTxt) {
			if (phonePtn.matcher(phoneTxt.getText()).matches()) {
				phoneTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad Phone Number");
				phoneTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == emailTxt) {
			if (emailPtn.matcher(emailTxt.getText()).matches()) {
				emailTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad Email");
				emailTxt.setForeground(Color.RED);
			}

		} else if (e.getSource() == dobTxt) {
			if (dobPtn.matcher(dobTxt.getText()).matches()) {
				dobTxt.setForeground(Color.GREEN);
			} else {
				showMessageDialog(this, "Bad DoB");
				dobTxt.setForeground(Color.RED);
			}
		} else/* should never happen */;

	}

	public UserFormGui() {
		super("Address Book");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		// create labels
		firstLbl = makeLbl("First Name");
		firstTxt = makeTxt();
		lastLbl = makeLbl("Last Name");
		lastTxt = makeTxt();
		addLbl = makeLbl("Address");
		add1Txt = makeTxt();
		add2Lbl = makeLbl("Address 2");
		add2Txt = makeTxt();
		cityLbl = makeLbl("City");
		cityTxt = makeTxt();
		stateLbl = makeLbl("State");
		stateTxt = makeTxt();
		zipLbl = makeLbl("Zip");
		zipTxt = makeTxt();
		phoneLbl = makeLbl("Phone");
		phoneTxt = makeTxt();
		emailLbl = makeLbl("Email");
		emailTxt = makeTxt();
		dobLbl = makeLbl("DOB");
		dobTxt = makeTxt();

		Border textFieldBorder = createEtchedBorder(EtchedBorder.LOWERED);

		Border lBdr = createLineBorder(new Color(150, 150, 150), 1);
		Border cBdr = createCompoundBorder(lBdr, createEmptyBorder(30, 10, 30, 10));
		Border border = createTitledBorder(cBdr, "First and Last name", TitledBorder.CENTER, TitledBorder.LEFT, font2,
				new Color(150, 150, 150));
		Border border2 = createTitledBorder(cBdr, "Phone,Email,DOB", TitledBorder.CENTER, TitledBorder.LEFT, font2,
				new Color(150, 150, 150));
		Border border3 = createTitledBorder(cBdr, "Street Address,City,State,Zip", TitledBorder.CENTER,
				TitledBorder.LEFT, font2, new Color(150, 150, 150));
		Box hBox = createHorizontalBox();
		Box vBox = createVerticalBox();
		Box vBox2 = createVerticalBox();
		Box verticalBox = createVerticalBox();
		Box bigBox = createVerticalBox();

		this.add(vBox);
		vBox.setBorder(border);
		vBox.add(firstLbl);
		vBox.add(firstTxt);
		firstTxt.setBorder(textFieldBorder);
		vBox.add(lastLbl);
		vBox.add(lastTxt);
		lastTxt.setBorder(textFieldBorder);

		hBox.setAlignmentX(LEFT_ALIGNMENT);
		hBox.add(cityLbl);
		hBox.add(cityTxt);
		cityTxt.setBorder(textFieldBorder);
		hBox.add(stateLbl);
		hBox.add(stateTxt);
		stateTxt.setBorder(textFieldBorder);
		hBox.add(zipLbl);
		hBox.add(zipTxt);
		zipTxt.setBorder(textFieldBorder);

		this.add(vBox2);
		// vBox2.add(createHorizontalStrut(300));
		vBox2.setBorder(border2);

		vBox2.add(phoneLbl);
		vBox2.add(phoneTxt);
		phoneTxt.setBorder(textFieldBorder);
		vBox2.add(emailLbl);
		vBox2.add(emailTxt);
		emailTxt.setBorder(textFieldBorder);
		vBox2.add(dobLbl);
		vBox2.add(dobTxt);
		dobTxt.setBorder(textFieldBorder);

		verticalBox.setBorder(border3);
		verticalBox.add(addLbl);
		verticalBox.add(add1Txt);
		add1Txt.setBorder(textFieldBorder);
		verticalBox.add(add2Lbl);
		verticalBox.add(add2Txt);
		add2Txt.setBorder(textFieldBorder);
		verticalBox.add(createVerticalStrut(10));
		verticalBox.add(hBox);

		this.add(bigBox);
		bigBox.add(createVerticalStrut(10));
		bigBox.setBorder(createLineBorder(Color.BLACK, 2));
		bigBox.add(vBox);
		bigBox.add(createVerticalStrut(10));
		bigBox.add(verticalBox);
		bigBox.add(createVerticalStrut(10));
		bigBox.add(vBox2);
		bigBox.add(createVerticalStrut(10));

		// Create pattern
		statePtn = Pattern.compile("^[A-Z][A-Z]$");
		zipPtn = Pattern.compile("^\\d{5}(?:-[0-9]{4})?$");
		wordPtn = Pattern.compile("^[A-Z][a-z]+$");
		emailPtn = Pattern.compile("^[\\w\\.]+@[A-Za-z0-9\\.]+\\.[a-z]+$");
		phonePtn = Pattern.compile("((\\d){3}\\-)((\\d){3}\\-)((\\d){4})");
		addPtn = Pattern.compile("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+[a-zA-Z]+)");
		// (\\((\\d){3}\\))\\s|
		dobPtn = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
		this.setSize(550, 670);
		this.setVisible(true);

	}

}
