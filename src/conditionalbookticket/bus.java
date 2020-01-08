package conditionalbookticket;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bus {

	private JFrame frame;
	private JTextField textField;
	protected Window second;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bus window = new bus();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bus() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER NO.OF BUS");
		lblNewLabel.setBounds(29, 98, 112, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(180, 95, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("NEXT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=Integer.parseInt(	textField.getText());
				for(int i=1;i<=n;i++)
				{
				bookingdetails second=new bookingdetails();
				setVisible(false);
				second.setVisible(true);
				}
				second.setVisible(false);
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(105, 156, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
