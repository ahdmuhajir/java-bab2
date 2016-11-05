package eventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;
public class AplikasiActionListenerJButton extends JFrame{
	JTextField data1 = new JTextField(20);
	JTextField data2 = new JTextField(20);
	JTextField data3 = new JTextField(20);
	Color c = new Color(243, 156, 18);
	
	JButton tambah =  new JButton("+");
	JButton exit = new JButton("Exit");
	ImageIcon gambar = new ImageIcon("images/close.png");
	
	public AplikasiActionListenerJButton() {
		setTitle("Event Mengunakan Klik Mouse");
		setLocation(200,100);
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void kompVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(data1);
		data1.setBounds(10, 10, 50, 30);
		getContentPane().add(data2);
		data2.setBounds(70, 10, 50, 30);
		getContentPane().add(tambah);
		tambah.setBounds(130, 10, 50, 30);
		getContentPane().add(data3);
		data3.setBounds(190, 10, 80, 30);
		getContentPane().add(exit);
		exit.setBounds(70, 50, 150, 50);
		exit.setIcon(new ImageIcon("images/close48.png"));
		exit.setRolloverIcon(gambar);
		setVisible(true);
	}
	void aksiReasi(){
		tambah.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(data1.getText());
				int y = Integer.parseInt(data2.getText());
				String z = String.valueOf(x+y);
				data3.setText(z);
				
			}
		});
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	public static void main(String[] args) {
		AplikasiActionListenerJButton anu = new AplikasiActionListenerJButton();
		anu.kompVisual();
		anu.aksiReasi();
	}

}
