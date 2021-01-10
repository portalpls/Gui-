import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chef {

	private JFrame frame;
	private JTable table;
	private JTextField textField;


	/**
	 * Create the application.
	 */
	public Chef() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(72, 73, 347, 312);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(6,10);
		table.setSelectionBackground(Color.RED);
		table.setRowSelectionAllowed(true);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Integer p = table.getSelectedRow();
				String s = p.toString();
				textField.setText(s);
			}
		});
		btnNewButton.setBounds(527, 289, 163, 45);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(488, 365, 202, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		frame.setVisible(true);
	}
}
