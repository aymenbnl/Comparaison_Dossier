import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.GridLayout;
import java.awt.CardLayout;

public class Help extends JDialog {
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Help dialog = new Help();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Help() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/sync/icons/about.png")));
		setTitle("About");
		setBounds(100, 100, 583, 422);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 228, 225));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Choisir des r\u00E9pertoires");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblNewLabel.setBounds(20, 43, 226, 25);
		contentPanel.add(lblNewLabel);
		
		JLabel lblcompareThem = new JLabel("Comparer");
		lblcompareThem.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblcompareThem.setBounds(87, 154, 85, 35);
		contentPanel.add(lblcompareThem);
		
		JLabel lblSelectSynchronizationSettings = new JLabel("Param\u00E9tres");
		lblSelectSynchronizationSettings.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblSelectSynchronizationSettings.setBounds(87, 222, 101, 39);
		contentPanel.add(lblSelectSynchronizationSettings);
		
		JLabel lblPressSynchronizeTo = new JLabel("Synchroniser");
		lblPressSynchronizeTo.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lblPressSynchronizeTo.setBounds(87, 305, 109, 35);
		contentPanel.add(lblPressSynchronizeTo);
		
		JLabel lblBasicUsage = new JLabel("");
		lblBasicUsage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBasicUsage.setBounds(10, 11, 85, 14);
		contentPanel.add(lblBasicUsage);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(276, 222, 47, 48);
		contentPanel.add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel label_2 = new JLabel("");
		panel_2.add(label_2, "name_5296505302700");
		label_2.setBackground(Color.GRAY);
		label_2.setIcon(new ImageIcon(Help.class.getResource("/sync/icons/set_syn.png")));
		
		JLabel label = new JLabel("");
		label.setBounds(10, 79, 531, 64);
		contentPanel.add(label);
		label.setBackground(Color.WHITE);
		label.setIcon(new ImageIcon(Help.class.getResource("/sync/icons/selectionner.png")));
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(206, 154, 182, 35);
		contentPanel.add(label_1);
		label_1.setBackground(Color.PINK);
		label_1.setIcon(new ImageIcon(Help.class.getResource("/sync/icons/comp2.png")));
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(206, 305, 182, 35);
		contentPanel.add(label_3);
		label_3.setBackground(Color.PINK);
		label_3.setIcon(new ImageIcon(Help.class.getResource("/sync/icons/syn2.png")));
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 228, 225));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setForeground(Color.BLACK);
				okButton.setBackground(Color.PINK);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	
	public void printLines(int nbLines){
		for (int i = 0; i < nbLines; i++) {
			System.out.println("add lines to the code ");
		}
		return ;
	}
}
	
