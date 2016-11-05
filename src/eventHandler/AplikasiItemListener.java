package eventHandler;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class AplikasiItemListener extends JFrame{
	Color c = new Color(243, 156, 18);
	JLabel judul = new JLabel("Pilihlah Kota Anda");
	JLabel Lkota = new JLabel("Kota");
	String kota []= {"Banda Aceh","Medan","Padang","Palembang"};
	JComboBox cbkota = new JComboBox(kota);
	
	JLabel Lpropinsi  = new JLabel("Propinsi");
	JTextField txpropinsi = new JTextField();
	String propinsi []= {"Aceh","Sumatera Utara","Sumatera Barat","Sumatera Selatan"};
	
	
	JLabel judul2 = new JLabel("Pilih Jenis Kelamin");
	JRadioButton pria = new JRadioButton("Pria");
	JRadioButton wanita = new JRadioButton("Wanita");
	JRadioButton kosong = new JRadioButton("???");
	ButtonGroup grup = new ButtonGroup();
	
	JLabel orang = new JLabel(new ImageIcon("gambar"));
	JLabel gambar = new JLabel(new ImageIcon("gambar"));
	
	public AplikasiItemListener() {
		setTitle("Aplikasi Item Listener");
		setLocation(300,100);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(judul);
		judul.setBounds(10,10, 150, 20);
		getContentPane().add(Lkota);
		Lkota.setBounds(10, 55, 80, 20);
		getContentPane().add(cbkota);
		cbkota.setBounds(100, 55, 120, 20);
		getContentPane().add(Lpropinsi);
		Lpropinsi.setBounds(10, 85, 80, 20);
		getContentPane().add(txpropinsi);
		txpropinsi.setBounds(100, 85, 120, 20);
		txpropinsi.setEnabled(false);
		getContentPane().add(orang);
		orang.setBounds(250, 10, 128, 128);
		getContentPane().add(judul2);
		judul2.setBounds(10, 115, 200, 20);
		getContentPane().add(wanita);
		wanita.setBounds(100, 135, 80, 20);
		wanita.setOpaque(false);
		getContentPane().add(pria);
		pria.setBounds(20, 135, 80, 20);
		pria.setOpaque(false);
		getContentPane().add(kosong);
		kosong.setBounds(180, 135, 80, 20);
		kosong.setOpaque(false);
		
		grup.add(pria);
		grup.add(wanita);
		grup.add(kosong);
		
		getContentPane().add(gambar);
		gambar.setBounds(0, 0, 400, 200);
		setVisible(true);
	
	}
	void aksiReaksi(){
		cbkota.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				int x = cbkota.getSelectedIndex();
				String z = propinsi[x];
				txpropinsi.setText(z);
				
			}
		});
		
		pria.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource()==pria){
					if(e.getStateChange()==ItemEvent.SELECTED){
						orang.setIcon(new ImageIcon("images/male.png"));
					}
				}
				
			}
		});
		
		wanita.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource()==wanita){
					if(e.getStateChange()==ItemEvent.SELECTED){
						orang.setIcon(new ImageIcon("images/female.png"));
					}
				}
				
			}
		});
		
		kosong.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getSource()==kosong){
					if(e.getStateChange()==ItemEvent.SELECTED){
						orang.setIcon(new ImageIcon("images/kosong.png"));
					}
				}
				
			}
		});
	}
	public static void main(String[] args) {
		AplikasiItemListener al = new AplikasiItemListener();
		al.komVisual();
		al.aksiReaksi();
	}
}
