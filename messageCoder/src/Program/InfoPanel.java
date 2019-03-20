package Program;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

public class InfoPanel extends JPanel {


	public InfoPanel() {
		setLayout(null);
		
		//Creating String for main information
		String Text;
		
		//String with information
		Text = 	//Global information about program
				"Program : messageCoder\n"
				+ "Version : 1.0\n"
				+ "About program:\n"
				+ "Main purpose of this program is to give opportunity to encrypt messages with "
				+ "randomly selected sequences of encryption methods to protect information "
				+ "and to decrypt messages encrypted by this program .\n\n"
				//Information about start or home page
				+ "Main Page :\n"
				+ "After starting program on you screen will appear Main Page. "
				+ "On main page you may see such components : Info Button , Field for inputing messages , "
				+ "Field for receiving results , Code Button , Decode Button and Check Button . "
				+ "The purpose and possibilities of using these components are described below.\n\n"
				//Component "Info Button"
				+ "Info Button :\nBy cliking this button on your screen will appear page with information about program , "
				+ "which you read write now .\n\n"
				//Component "Field for inputing messages"
				+ "Field for inputing messages :\n"
				+ "On the left side of the main page user could observe Field for inputing messages. "
				+ "This Field has beed designed for receiving messages "
				+ "which you want to use in opportunities that out program offers.\n\n"
				//Component "Field for receiving results"
				+ "Field for receiving results:\n"
				+ "On the right side of the main page user could observe Field for receiving results. "
				+ "Purpose of this element is to represent results of encrypting or decrypting inputed messages, "
				+ "also this field program could you if user require check result by using Check Button.\n\n"
				//Component "Code Button"
				+ "Code Button :\n"
				+ "Left among three buttons on the bottom part of main page is Code Button. "
				+ "After pushing this button program perfoms encrypting protocol which will randomly select "
				+ "sequnce of encrypting methods for inputed message which user placed in Filed for inputing messages . The result of it"
				+ "will appear in Filed for receiving results. Also as an input for this process could be already encrypted message for "
				+ "performing additional encryption and increasing protection level of information.\n\n"
				//Component "Decode Button"
				+ "Decode Button :\n"
				+ "Midle among three buttons on the bottom part of main page."
				+ " This button will perfom decrypting protocol for already encrypted messages inputed using Filed for inputing messages and"
				+ "showing initial message inside Field for receiving results. This protocol will work propeply only "
				+ "for already encrypted messages.\n\n"
				//Component "Check Button"
				+ "Check Button :\n"
				+ "Midle among three buttons on the bottom part of main page. "
				+ "As a result of using this button user will receive"
				+ "the result of checking is the message in Field for inputing messages is a decrypted version of message in "
				+ "Field for receiving message.\n\n"
				//Importnant information
				+ "Important information :\n"
				+ "Not all elements(letters,symbols) are could be "
				+ "encrypted using this program . Mainly this program is oriented for English letters .\n\n"
				//Contact
				+ "Contact :\n"
				+ "In case of any problem or bugs plese , contact with me .\n\n"
				//Thanks
				+ "Thanks\n"
				+ "Thank you for using this program";
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 464, 358);
		add(scrollPane);
		
		JTextPane textPane = new JTextPane();
		textPane.setText(Text);
		textPane.setEditable(false);
		scrollPane.setViewportView(textPane);

	}
}
