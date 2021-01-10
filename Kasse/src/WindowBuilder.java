import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Component;
import javax.swing.JMenuItem;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowBuilder {

	private JFrame frame;
	private JTextField textFieldAddByNumber;
	String state;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilder window = new WindowBuilder();
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
	public WindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		Image logo = Toolkit.getDefaultToolkit().getImage("logo.png");
		frame.setIconImage(logo);
		frame.setBounds(400, 400, 800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaptionBorder);
		panel.setForeground(SystemColor.info);
		panel.setBounds(420, 309, 337, 425);
		frame.getContentPane().add(panel);
		//Button1
		JButton button1 = new JButton("1");
		button1.setHorizontalTextPosition(SwingConstants.CENTER);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"1");
			}
		});
		panel.setLayout(new GridLayout(4, 3, 10, 10));
		button1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button1.setBackground(SystemColor.inactiveCaption);
		panel.add(button1);
		//Button2
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"2");
			}
		});
		button2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button2.setBackground(SystemColor.inactiveCaption);
		panel.add(button2);
		//Button3
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"3");
			}
		});
		button3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button3.setBackground(SystemColor.inactiveCaption);
		panel.add(button3);
		//Button4
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"4");
			}
		});
		button4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button4.setBackground(SystemColor.inactiveCaption);
		panel.add(button4);
		//Button5
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"5");
			}
		});
		button5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button5.setBackground(SystemColor.inactiveCaption);
		panel.add(button5);
		//Button6
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"6");
			}
		});
		button6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button6.setBackground(SystemColor.inactiveCaption);
		panel.add(button6);
		//Button7
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"7");
			}
		});
		button7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button7.setBackground(SystemColor.inactiveCaption);
		panel.add(button7);
		//Button8
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"8");
			}
		});
		button8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button8.setBackground(SystemColor.inactiveCaption);
		panel.add(button8);
		//Button9
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"9");
			}
		});
		button9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button9.setBackground(SystemColor.inactiveCaption);
		panel.add(button9);
		//Buttonsave
		JButton buttonsave = new JButton("Hinzuf\u00FCg.");
		buttonsave.setIconTextGap(0);
		buttonsave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {							//fürs Backend <3
			}
		});
		buttonsave.setForeground(new Color(0, 0, 0));
		buttonsave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonsave.setBackground(new Color(204, 255, 153));
		panel.add(buttonsave);
		//Button0
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				state = textFieldAddByNumber.getText();
				textFieldAddByNumber.setText(state+"0");
			}
		});
		button0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button0.setBackground(SystemColor.inactiveCaption);
		panel.add(button0);
		//Buttondelete
		JButton buttondelete = new JButton("L\u00F6schen");
		buttondelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAddByNumber.setText("");
			}
		});
		buttondelete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		buttondelete.setBackground(new Color(255, 102, 102));
		panel.add(buttondelete);
		
		textFieldAddByNumber = new JTextField();
		textFieldAddByNumber.setBounds(420, 179, 337, 56);
		frame.getContentPane().add(textFieldAddByNumber);
		textFieldAddByNumber.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 280, 406);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(2,3);
		scrollPane.setViewportView(table);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenuItem MenuItemSUCHEN = new JMenuItem("SUCHEN");
		MenuItemSUCHEN.setHorizontalTextPosition(SwingConstants.RIGHT);
		MenuItemSUCHEN.setHorizontalAlignment(SwingConstants.RIGHT);
		MenuItemSUCHEN.setBounds(new Rectangle(0, 0, 0, 0));
		MenuItemSUCHEN.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            Suche Suchfenster = new Suche();
		            System.out.print("moi");											//geht auch für MenuItemSUCHEN
		    }
		});
		menuBar.add(MenuItemSUCHEN);
		
		JMenuItem menuItemChef = new JMenuItem("Chef");
		menuItemChef.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            Chef Cheffenster = new Chef();
		            System.out.print("HI");
		    }
		});
		            
		menuBar.add(menuItemChef);
		
	}
}
