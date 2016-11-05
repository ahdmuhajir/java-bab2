package eventHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiKeyListener extends JFrame{
	JLabel Ldata1 = new JLabel("Masukkan Data Pertama");
	JLabel Ldata2 = new JLabel("Masukkan Data Kedua");
	JLabel Ldata3 = new JLabel("Hasil");
	
	JTextField data1 = new JTextField(20);
	JTextField data2 = new JTextField(20);
	JTextField data3 = new JTextField(20);
	
	JButton exit = new JButton("Exit");
	JButton tambah = new JButton("+");
	ImageIcon gambar= new ImageIcon("images/power-offw.png");
	Color c = new Color(243, 156, 18);
	
	public AplikasiKeyListener() {
		setTitle("Aplikasi Key Listener");
		setLocation(200, 100);
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		
		getContentPane().add(Ldata1);
		Ldata1.setBounds(10, 10, 150, 20);
		
		getContentPane().add(data1);
		data1.setBounds(160, 10, 80, 20);
		data1.setHorizontalAlignment(SwingConstants.CENTER);
		
		getContentPane().add(Ldata2);
		Ldata2.setBounds(10, 40, 150, 20);
		
		getContentPane().add(data2);
		data2.setBounds(160, 40, 80, 20);
		data2.setHorizontalAlignment(SwingConstants.CENTER);
		
		getContentPane().add(tambah);
		tambah.setBounds(260, 10, 100, 80);
		
		getContentPane().add(Ldata3);
		Ldata3.setBounds(10, 70, 50, 20);
		
		getContentPane().add(data3);
		data3.setBounds(160, 70, 80, 20);
		data3.setHorizontalAlignment(SwingConstants.CENTER);
		
		getContentPane().add(exit);
		exit.setBounds(370, 10, 100, 80);
		exit.setIcon(new ImageIcon("images/power-offm.png"));
		exit.setRolloverIcon(gambar);
		setVisible(true);
	}
	
	void aksiReaksi(){
		data1.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					data2.requestFocus();
				}
			}
			
		});
		data1.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent e) {
				String nomor = data1.getText();
				if(nomor.length()>5){
					getToolkit().beep();
					e.consume();
					JOptionPane.showConfirmDialog(null, "Angka Yang anda Input terlalu Panjang","Pesan",JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		
		data1.addKeyListener(new KeyAdapter() {

			public void keyReleased(KeyEvent key) {
				char karakter = key.getKeyChar();
				if(!((karakter>='0')&&(karakter<='9')|| (karakter==KeyEvent.VK_BACK_SPACE))){
					JOptionPane.showMessageDialog(null, "Karakter Yang Di input Harus Angka","Pesan",JOptionPane.WARNING_MESSAGE,new ImageIcon("images/close.png"));
					
				}
			}
		});
		
		data2.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					tambah.requestFocus();
				}
			}
		});
		tambah.addKeyListener(new KeyAdapter() {
		
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ENTER){
					int x = Integer.parseInt(data1.getText());
					int y = Integer.parseInt(data2.getText());
					String z = String.valueOf(x+y);
					data3.setText(z);
				}
			}
		});
		exit.addKeyListener(new KeyAdapter() {
					
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==e.VK_ESCAPE){
					System.exit(0);
				}
				
			}
		});
	}
		public static void main(String[] args) {
			AplikasiKeyListener akl = new AplikasiKeyListener();
			akl.komVisual();
			akl.aksiReaksi();
		}
	
}
