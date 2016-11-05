package eventHandler;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Desktop;
import java.net.URI;

class AplikasiMouseListenerJlabel extends JFrame{
	JLabel ljudul = new JLabel ("Aplikasi Mouse Listener dengan JLabel");
	JLabel lauthor = new JLabel ("Author : Ahd Muhajir S.Kom");
	
	JLabel lfb = new JLabel (new ImageIcon ("images/facebook.png"));
	JLabel lfbc = new JLabel ("<html> <a href=\"\"> Ahd Muhajir</a> </html>");
	
	JLabel cal = new JLabel (new ImageIcon("images/calculator.png"));
	JLabel lcal = new JLabel ("<html> <a href=\"\"> Class Kalkulator</a> </html>");
	
	JLabel twit = new JLabel (new ImageIcon("images/twitter.png"));
	
	JLabel lbackground = new JLabel (new ImageIcon("images/wall.png"));
	JLabel licon = new JLabel (new ImageIcon("images/male.png"));
	
	AplikasiMouseListenerJlabel(){
		setTitle("Aplikasi Event Label");
		setSize(526,300);
		setLocation(100,100);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void KomponenVisual(){
		getContentPane().setLayout(null);
		
		getContentPane().add(ljudul);
		ljudul.setFont(new Font ("Footlight MT",Font.PLAIN,18));
		ljudul.setHorizontalAlignment(SwingConstants.CENTER);
		ljudul.setBounds(10,10,500,31);
		ljudul.setForeground(Color.RED);
		
		getContentPane().add(lauthor);
		lauthor.setBounds(200,56,180,15);
		lauthor.setFont(new Font ("Century",Font.PLAIN,12));
		lauthor.setForeground(Color.BLACK);
		
		getContentPane().add(twit);
		twit.setBounds(12,93,120,120);
		twit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		twit.setToolTipText("www.twitter.com");
		
		getContentPane().add(lfb);
		lfb.setBounds(110,93,70,64);
		
		getContentPane().add(lfbc);
		lfbc.setBounds(180,130,190,20);
		lfbc.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lfbc.setToolTipText("www.Facebook.com");
		
		getContentPane().add(cal);
		cal.setBounds(110,180,64,64);
		
		getContentPane().add(lcal);
		lcal.setBounds(180,200,322,20);
		lcal.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lcal.setToolTipText("Kelas Kalkulator");
		
		getContentPane().add(licon);
		licon.setBounds(374,50,134,128);
		
		getContentPane().add(lbackground);
		lbackground.setBounds(0,0,520,350);
		
		setVisible(true);
	}
	
	void AksiReaksi(){
		
		lfbc.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				try{
					Desktop.getDesktop().browse(new URI("http://facebook.com/ahdmuhajir"));
				}
				catch(Exception ex)	{
					System.out.println(ex);
				}
			}
		});
		
		lcal.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent me)	{
				AplikasiKeyListener AAL = new AplikasiKeyListener();
				AAL.komVisual();
				AAL.aksiReaksi(); 
			}
		});
		
		twit.addMouseListener(new MouseAdapter(){
			public void mouseEntered(MouseEvent e){
				twit.setIcon(new ImageIcon("images/twitter-square.png"));
			}
			public void mouseExited(MouseEvent e){
				twit.setIcon(new ImageIcon("images/twitter.png"));
			}
			public void mouseClicked(MouseEvent e){
				try	{
					Desktop.getDesktop().browse(new URI("http://www.twitter.com"));
				}
				catch(Exception ex){
					System.out.println(ex);
				}
			}
		});
	}
	
	public static void main(String args[]){
    	AplikasiMouseListenerJlabel AML = new AplikasiMouseListenerJlabel();
    	AML.KomponenVisual();
    	AML.AksiReaksi();
    }
}