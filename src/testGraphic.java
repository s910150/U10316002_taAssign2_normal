import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class testGraphic extends JFrame{
	 public static void main(String[] args) {
	JFrame frame = new JFrame();

	JPanel panel = new Rectangle();
	JPanel panel2 = new Square();
	JPanel panel3 = new Circle();
	
	frame.add(panel);
	frame.add(panel2);
	frame.add(panel3);
	frame.setLayout(new GridLayout(3,1));
    frame.setTitle("U10316002_GeoCalculate");
    frame.setSize(400, 400);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
	 }
}
