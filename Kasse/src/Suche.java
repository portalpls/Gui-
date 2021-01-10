import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Suche {

	private JFrame frame;
	private JTextField TextFieldSUCHE;

	public Suche() {
		initialize();
		System.out.print("HI from an other file");
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(400, 400, 800, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextFieldSUCHE = new JTextField();
		TextFieldSUCHE.setBounds(122, 100, 351, 47);
		frame.getContentPane().add(TextFieldSUCHE);
		TextFieldSUCHE.setColumns(10);
		
		JButton ButtonSUCHE = new JButton("SUCHEN");
		ButtonSUCHE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TextSuche = TextFieldSUCHE.getText();
				System.out.print(TextSuche);
			}
		});
		ButtonSUCHE.setBounds(482, 100, 110, 47);
		frame.getContentPane().add(ButtonSUCHE);
		frame.setVisible(true);
	}

}
