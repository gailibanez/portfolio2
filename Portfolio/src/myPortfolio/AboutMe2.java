package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AboutMe2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutMe2 window = new AboutMe2();
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
	public AboutMe2() {
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
		lblNewLabel.setIcon(new ImageIcon(AboutMe2.class.getResource("/img/3.jpg")));
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				AboutMe1 ab1 = new AboutMe1();
				ab1.main(null);
			}
	});
		btnBack.setBounds(1613, 925, 89, 72);
		frame.getContentPane().add(btnBack);
		btnBack.setOpaque(false);
		
		JButton btnNext = new JButton("New butto");
		btnNext.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
				AboutMe3 ab3 = new AboutMe3();
				ab3.main(null);
				}
	});
		btnNext.setBounds(1725, 925, 89, 56);
		frame.getContentPane().add(btnNext);
		btnNext.setOpaque(false);
	}

}
