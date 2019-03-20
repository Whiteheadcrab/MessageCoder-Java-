package Program;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class CoderPanel extends JPanel {

	//Creating components for visual representing of program
	//for giving access of encryption/decryption
	//for users
	public CoderPanel() {
		setLayout(null);
		
		//Import Controller
		CoderController controller = new CoderController();
		
		//Creating Labels
		JLabel LabelforInput = new JLabel("Message for code/decode");
		LabelforInput.setBounds(10, 42, 182, 14);
		add(LabelforInput);
		
		JLabel LabelforOutput = new JLabel("Result of coding/decoding");
		LabelforOutput.setHorizontalAlignment(SwingConstants.RIGHT);
		LabelforOutput.setBounds(249, 42, 182, 14);
		add(LabelforOutput);
		
		//Creating textArea for input/output 
		//+scrolles for these textAreas
		JScrollPane scrollPaneforInput = new JScrollPane();
		scrollPaneforInput.setBounds(10, 67, 182, 153);
		add(scrollPaneforInput);
		
		JTextArea textAreaforInput = new JTextArea();
		textAreaforInput.setWrapStyleWord(true);
		scrollPaneforInput.setViewportView(textAreaforInput);
		
		JScrollPane scrollPaneforOutput = new JScrollPane();
		scrollPaneforOutput.setBounds(249, 67, 182, 153);
		add(scrollPaneforOutput);
		
		JTextArea textAreaforOutput = new JTextArea();
		textAreaforOutput.setWrapStyleWord(true);
		scrollPaneforOutput.setViewportView(textAreaforOutput);

		//Creating buttons for receiving access to encryption/decryption protocols 
		JButton ButtonforCoding = new JButton("Code");
		ButtonforCoding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Message = textAreaforInput.getText();
				Message = controller.EncryptionProtocol(Message);
				textAreaforOutput.setText(Message);
			}
		});
		ButtonforCoding.setBounds(10, 231, 89, 23);
		add(ButtonforCoding);
		
		JButton ButtonforDecoding = new JButton("Decode");
		ButtonforDecoding.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Message = textAreaforInput.getText();
				Message = controller.DecryptionProtocol(Message);
				textAreaforOutput.setText(Message);
			}
		});
		ButtonforDecoding.setBounds(181, 231, 89, 23);
		add(ButtonforDecoding);
		
		JButton ButtonforCheckingResult = new JButton("Check");
		ButtonforCheckingResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String InitialMessage = textAreaforInput.getText();
				String ResultMessage = textAreaforOutput.getText();
				String Result = controller.CheckProtocol(ResultMessage, InitialMessage);
				JOptionPane.showMessageDialog(null, Result);
			}
		});
		ButtonforCheckingResult.setBounds(342, 231, 89, 23);
		add(ButtonforCheckingResult);
		
		//Creating info button for giving access to information about this program
		JButton ButtonforInfo = new JButton("Info");
		ButtonforInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InfoFrame info = new InfoFrame();
				info.setVisible(true);
			}
		});
		ButtonforInfo.setBounds(10, 11, 89, 23);
		add(ButtonforInfo);
		
		
	}
}
