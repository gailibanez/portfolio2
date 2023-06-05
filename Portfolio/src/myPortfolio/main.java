package myPortfolio;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
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
		lblNewLabel.setIcon(new ImageIcon(main.class.getResource("/img/1.jpg")));
		lblNewLabel.setBounds(10, 0, 1920, 1080);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnAboutMe = new JButton("");
		btnAboutMe.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			AboutMe1 ab1 = new AboutMe1();
			ab1.main(null);
			}
	});
		
		btnAboutMe.setBounds(898, 564, 391, 76);
		frame.getContentPane().add(btnAboutMe);
		btnAboutMe.setOpaque(false);
		
		JButton btnMyWorks = new JButton("New button");
		btnMyWorks.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			MyWorks1 mw1 = new MyWorks1();
			mw1.main(null);
			}
	});
		btnMyWorks.setBounds(920, 689, 369, 86);
		frame.getContentPane().add(btnMyWorks);
		btnMyWorks.setOpaque(false);

		
		JButton btnSkills = new JButton("New button");
		btnSkills.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			Skills sk = new Skills();
			sk.main(null);
			}
	});
		btnSkills.setBounds(1361, 550, 296, 76);
		frame.getContentPane().add(btnSkills);
		btnSkills.setOpaque(false);

		
		JButton btnExperiences = new JButton("New button");
		btnExperiences.addActionListener(new ActionListener() {
			@SuppressWarnings("static-access")
			public void actionPerformed(ActionEvent e) {
			Experiences exp = new Experiences();
			exp.main(null);
			}
	});
		btnExperiences.setBounds(1361, 706, 461, 69);
		frame.getContentPane().add(btnExperiences);
		btnExperiences.setOpaque(false);

	}
}
