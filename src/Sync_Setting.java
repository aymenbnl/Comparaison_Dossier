import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;

public class Sync_Setting extends JDialog {

	private final JPanel contentPanel = new JPanel();
    private final JButton right;
    private final JButton left;
    private final JButton c_right;
    private final JButton s_right;
    private final JButton c_left;
    private final JButton s_left;
    boolean v_right=false;
    boolean v_left=true;
    boolean modif=false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Sync_Setting dialog = new Sync_Setting();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Sync_Setting() {
		setTitle("Synchronisation");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DELL\\eclipse-workspace\\Comparaison-Dossier\\src\\sync\\icons\\104952_mac-gadgets-on-a-desk-wallpapers-free-desktop-backgrounds-and_800x600_h.png"));
		setBounds(100, 100, 569, 428);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("Button.background"));
		panel.setBounds(0, 0, 555, 354);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblDirectionOfSynchronization = new JLabel("synchronisation :");
		lblDirectionOfSynchronization.setForeground(Color.WHITE);
		lblDirectionOfSynchronization.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/arrows22.png")));
		lblDirectionOfSynchronization.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblDirectionOfSynchronization.setBounds(177, 11, 278, 34);
		panel.add(lblDirectionOfSynchronization);
		
	    left = new JButton("");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modif=true;
				v_right=!(v_right);
				right.setEnabled(!(v_right));
				s_right.setEnabled(!(v_right));
				c_right.setEnabled(!(v_right));
			}
		});
		left.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/fast-forward333.png")));
		left.setBounds(80, 86, 47, 46);
		panel.add(left);
		
		right = new JButton("");
		
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modif=true;
				left.setEnabled(!(v_left));
				s_left.setEnabled(!(v_left));
				c_left.setEnabled(!(v_left));
				v_left=!(v_left);
				
			}
		});
		right.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/arrows333333.png")));
		right.setBounds(444, 86, 47, 46);
		panel.add(right);
		
		JLabel lblLeftToRight = new JLabel("gauche \u00E0 droite");
		lblLeftToRight.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblLeftToRight.setBounds(137, 98, 109, 24);
		panel.add(lblLeftToRight);
		
		JLabel lblRightToLeft = new JLabel("droite \u00E0 gauche");
		lblRightToLeft.setFont(new Font("Tahoma", Font.ITALIC, 13));
		lblRightToLeft.setBounds(338, 98, 96, 24);
		panel.add(lblRightToLeft);
		
		JLabel label = new JLabel("Cat\u00E9gorie :");
		label.setBackground(Color.WHITE);
		label.setForeground(Color.BLACK);
		label.setFont(new Font("MS Gothic", Font.BOLD, 16));
		label.setBounds(20, 143, 134, 25);
		panel.add(label);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Sens de la synchronisation:");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("MS Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(20, 61, 278, 14);
		panel.add(lblNewLabel_1);
		button_2.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/cat_right_only.png")));
		button_2.setToolTipText("Cet \u00E9l\u00E9ment existe seulement a gauche");
		button_2.setBounds(80, 179, 47, 46);
		panel.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_3.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/clock.png")));
		button_3.setToolTipText("different last modified");
		button_3.setBounds(267, 179, 47, 48);
		panel.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/cat_left_only.png")));
		button_4.setToolTipText("Cet \u00E9l\u00E9ment existe seulement a droite");
		button_4.setBounds(444, 181, 47, 48);
		panel.add(button_4);
		
		JLabel lblAction = new JLabel("Action :");
		lblAction.setForeground(Color.BLACK);
		lblAction.setFont(new Font("MS Gothic", Font.BOLD, 16));
		lblAction.setBounds(22, 241, 72, 25);
		panel.add(lblAction);
		
	    c_left = new JButton("");
	    c_left.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
		c_left.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/so_create_right.png")));
		c_left.setBounds(92, 277, 47, 46);
		panel.add(c_left);
		
		 s_left = new JButton("");
		 s_left.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 	}
		 });
		s_left.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/so_delete_right.png")));
		s_left.setBounds(32, 277, 50, 46);
		panel.add(s_left);
		
	    s_right = new JButton("");
	    s_right.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
		s_right.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/so_delete_left.png")));
		s_right.setBounds(421, 277, 50, 46);
		panel.add(s_right);
		
		c_right = new JButton("");
		c_right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		c_right.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/so_create_left.png")));
		c_right.setBounds(481, 277, 50, 46);
		panel.add(c_right);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Sync_Setting.class.getResource("/sync/icons/1.png")));
		lblNewLabel.setBounds(-103, -144, 668, 506);
		panel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(2, 353, 553, 56);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			{
				{
					JButton cancelButton = new JButton("Cancel");
					cancelButton.setFont(new Font("Roboto Slab SemiBold", Font.BOLD | Font.ITALIC, 12));
					cancelButton.setBackground(Color.RED);
					cancelButton.setToolTipText("annuler");
					cancelButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
					JButton okButton = new JButton("OK");
					okButton.setFont(new Font("Roboto Slab SemiBold", Font.BOLD | Font.ITALIC, 12));
					okButton.setBackground(Color.GREEN);
					okButton.setToolTipText("confirmer votre param\u00E9tres");
					okButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							DefaultTableModel model4;
							model4=(DefaultTableModel) Aplication.tab3.getModel();
						if(modif){	
							if(!(v_right)){
								Aplication.sup_droit.setEnabled(true);
								Aplication.droit_gauche.setEnabled(true);
								Aplication.sup_gauche.setEnabled(false);
								Aplication.gauche_droit.setEnabled(false);
								
							}
							else{
								Aplication.sup_gauche.setEnabled(true);
								Aplication.gauche_droit.setEnabled(true);
								Aplication.sup_droit.setEnabled(false);
								Aplication.droit_gauche.setEnabled(false);
							}
						}
						if(Aplication.gauche_droit.isEnabled()){
							for (int i=0;i<Aplication.tab3.getRowCount();i++){
								if(Aplication.tab3.getValueAt(i, 1).toString().equals("file:/C:/Users/DOC/workspace/Project/bin/sync/icons/so_update_right_small.png")){
									Aplication.tab3.setValueAt(Boolean.TRUE, i, 0);
								}
								else{
									Aplication.tab3.setValueAt(Boolean.FALSE, i, 0);
									Aplication.tab3.setValueAt(Boolean.FALSE, i, 2);
								}
							}
						}
						else{
							for (int i=0;i<Aplication.tab3.getRowCount();i++){
								if(Aplication.tab3.getValueAt(i, 1).toString().equals("file:/C:/Users/DOC/workspace/Project/bin/sync/icons/so_update_right_small.png")){
									Aplication.tab3.setValueAt(Boolean.FALSE, i, 0);
									Aplication.tab3.setValueAt(Boolean.FALSE, i, 2);
								}
								else{
									Aplication.tab3.setValueAt(Boolean.TRUE, i, 0);
								}
							}
						}
						dispose();
						
						}
					});
					okButton.setActionCommand("OK");
					buttonPane.add(okButton);
					getRootPane().setDefaultButton(okButton);
					cancelButton.setActionCommand("Cancel");
					buttonPane.add(cancelButton);
				}
			}
		}
	}
}