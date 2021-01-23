import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.Label;
import java.awt.Color;
import javax.swing.SwingConstants;

public class cop_set extends JDialog {
    static boolean chang=Aplication.size;
    static JLabel tex;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			cop_set dialog = new cop_set();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public cop_set() {
		setTitle("Comparaison");
		setBackground(new Color(255, 255, 255));
		setIconImage(Toolkit.getDefaultToolkit().getImage(cop_set.class.getResource("/sync/icons/compare_small.png")));
		setBounds(100, 100, 811, 524);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 192, 203));
		contentPanel.setForeground(new Color(165, 42, 42));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblChoisirUneVariante = new JLabel("-----Choisir une variante----");
		lblChoisirUneVariante.setForeground(Color.WHITE);
		lblChoisirUneVariante.setFont(new Font("Courier New", Font.BOLD | Font.ITALIC, 18));
		lblChoisirUneVariante.setBounds(226, 10, 385, 39);
		contentPanel.add(lblChoisirUneVariante);
		
		final JLabel size = new JLabel("");
		size.setForeground(Color.BLACK);
		size.setIcon(new ImageIcon(cop_set.class.getResource("/sync/icons/AAimages.png")));
		size.setBounds(501, 10, 335, 327);
		contentPanel.add(size);
		
		final JLabel date = new JLabel("");
		date.setBackground(new Color(0, 0, 0));
		date.setIcon(new ImageIcon(cop_set.class.getResource("/sync/icons/calimages.png")));
		date.setBounds(45, 37, 504, 282);
		date.setEnabled(!chang);
		contentPanel.add(date);
		
		JButton btnNewButton = new JButton("Date du fichier");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setToolTipText("reconna\u00EEtre les fichiers identiques \u00E0 l'aide leur date");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!chang){
					size.setEnabled(true);
					date.setEnabled(false);
					tex.setText("Reconna�tre les fichiers identiques � l'aide de leur taille.");
				}
				else{
					size.setEnabled(false);
					date.setEnabled(true);
					tex.setText("Reconna�tre les fichiers identiques � l'aide de leur date.");
	
				}
				chang=!chang;
			}
		});
		btnNewButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		btnNewButton.setBounds(38, 312, 265, 54);
		contentPanel.add(btnNewButton);
		
		JButton btnTailleDuFichier = new JButton("Taille du fichier");
		btnTailleDuFichier.setForeground(new Color(0, 0, 0));
		btnTailleDuFichier.setBackground(Color.WHITE);
		btnTailleDuFichier.setToolTipText("reconna\u00EEtre les fichiers identiques \u00E0 l'aide leur taille");
		btnTailleDuFichier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!chang){
					size.setEnabled(true);
					date.setEnabled(false);
					tex.setText("Reconna�tre les fichiers identiques � l'aide de leur taille.");
				}
				else{
					size.setEnabled(false);
					date.setEnabled(true);
					tex.setText("Reconna�tre les fichiers identiques � l'aide de leur date.");
				}
				chang=!chang;
			}
		});
		btnTailleDuFichier.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 17));
		btnTailleDuFichier.setBounds(469, 312, 244, 54);
		contentPanel.add(btnTailleDuFichier);
		
	   tex = new JLabel("**Reconna\u00EEtre les fichiers identiques \u00E0 l'aide de leur taille et de leur date* *");
	   tex.setIcon(new ImageIcon(cop_set.class.getResource("/sync/icons/File.png")));
		tex.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		tex.setBounds(91, 381, 644, 76);
		contentPanel.add(tex);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(255, 192, 203));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setVerticalAlignment(SwingConstants.TOP);
				okButton.setForeground(new Color(0, 0, 0));
				okButton.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 12));
				okButton.setBackground(Color.WHITE);
				okButton.setIcon(new ImageIcon(cop_set.class.getResource("/sync/icons/fast-forward333.png")));
				okButton.setToolTipText("confirmer votre variante");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Aplication.size=size.isEnabled();
					
						dispose();
					}
				});
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Trebuchet MS", Font.ITALIC, 14));
				cancelButton.setBackground(Color.WHITE);
				cancelButton.setIcon(new ImageIcon(cop_set.class.getResource("/sync/icons/exit2.png")));
				cancelButton.setToolTipText("annuler");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
