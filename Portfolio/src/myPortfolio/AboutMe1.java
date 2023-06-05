package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AboutMe1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe1 window = new AboutMe1();
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
	public AboutMe1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(AboutMe1.class.getResource("/img/2.jpg")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			main mn = new main();
			mn.main(null);
			}
	});
		btnBack.setBounds(1303, 925, 372, 56);
		frame.getContentPane().add(btnBack);
		btnBack.setOpaque(false);
		
		JButton btnNext = new JButton("New butto");
		btnNext.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			AboutMe2 ab2 = new AboutMe2();
			ab2.main(null);
			}
	});
		btnNext.setBounds(1725, 925, 89, 56);
		frame.getContentPane().add(btnNext);
		btnNext.setOpaque(false);

	}

}
