package eventHandler;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class AplikasiChangeListener extends JFrame{
	JPanel pane = new JPanel();
	JScrollPane scrollPane = new JScrollPane();
	
	JTextArea area = new JTextArea();
	JSlider slide = new JSlider(1,150);
	
	JLabel lfontmax = new JLabel("Maximize / Minimize Font");
	JLabel ltulis = new JLabel("Tulis text disini");
	
	JLabel lwall = new JLabel (new ImageIcon("images/hope.jpg"));
	JLabel licon = new JLabel (new ImageIcon("images/edit.png"));
	
	AplikasiChangeListener(){
		setTitle("Font Size");
		setResizable(false);
		setLocation(100,100);
		setSize(564,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		setContentPane(pane);
		pane.setLayout(null);
		
		pane.add(ltulis);
		ltulis.setBounds(101,10,114,15);
		ltulis.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		ltulis.setForeground(new Color(0,0,0));
		
		pane.add(scrollPane);
		scrollPane.setBounds(12,40,309,120);
		scrollPane.setViewportView(area);
		area.setFont(new Font("Comic Sans MS",Font.BOLD,12));
		area.setWrapStyleWord(true);
		area.setLineWrap(true);
		
		pane.add(slide);
		slide.setBounds(76,180,200,40);
		slide.setValue(15);
		
		pane.add(lfontmax);
		lfontmax.setBounds(86,240,190,15);
		lfontmax.setFont(new Font("Comic Sans MS",Font.BOLD,14));
		lfontmax.setForeground(new Color(0,0,0));
		
		pane.add(licon);
		licon.setBounds(388,45,128,120);
		
		pane.add(lwall);
		lwall.setBounds(0,0,568,348);
		
		setVisible(true);
	}
	
	void AksiReaksi(){
		slide.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ce){
				area.setFont(new Font("Comic Sans MS",Font.BOLD,slide.getValue()));
			}
		});
	}
	
	public static void main(String args[]){
    	AplikasiChangeListener ACL = new AplikasiChangeListener();
    	ACL.KomponenVisual();
    	ACL.AksiReaksi();
    }
}