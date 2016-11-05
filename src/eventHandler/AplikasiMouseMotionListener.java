package eventHandler;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AplikasiMouseMotionListener extends JFrame{
	TextField tf = new TextField();
	Color c = new Color(243, 156, 18);
	
	public AplikasiMouseMotionListener() {
		setTitle("Apliaksi Mouse Motion Listener");
		setLocation(200, 100);
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	void komVisual(){
		getContentPane().setLayout(null);
		getContentPane().setBackground(c);
		getContentPane().add(tf);
		tf.setBounds(10, 10, 250, 20);
		setVisible(true);
	}
	void aksiReaksi(){
		addMouseMotionListener(new MouseAdapter() {

			public void mouseDragged(MouseEvent e) {
				String msg = "Mouse ditahan pada posisi -->"+e.getX()+", "+e.getY();
				tf.setText(msg);
				tf.setForeground(Color.RED);
			}
			
		});
		addMouseMotionListener(new MouseAdapter() {

			public void mouseMoved(MouseEvent e) {
				String msg = "Mouse berada pada posisi -->"+e.getX()+", "+e.getY();
				tf.setText(msg);
				tf.setForeground(Color.BLUE);
			}
			
		});
	}
	public static void main(String[] args) {
		AplikasiMouseMotionListener aml =new AplikasiMouseMotionListener();
		aml.komVisual();
		aml.aksiReaksi();
	}
}
