import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class Circle extends JPanel{

	private JTextField jtfRadius = new JTextField(5);
	private JTextField jtfArea = new JTextField(5);
	private JTextField jtfPerimeter = new JTextField(5);
	
	private JButton jbtCompute = new JButton("Compute");
	private JButton jbtClean = new JButton("Clean");
	
	
	public Circle() {
	
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,4,1,1));
		
		panel.add(new JLabel("Circle:"));
		panel.add(new JLabel(""));
		

		panel.add(new JLabel("Radius:"));
		panel.add(jtfRadius);

		panel.add(new JLabel("Area:"));
		panel.add(jtfArea);
		
		panel.add(new JLabel("Perimeter:"));
		panel.add(jtfPerimeter);
		
		panel.add(jbtCompute);
		panel.add(jbtClean);
	
		
		add(panel);
		
		jbtCompute.addActionListener(new ButtonListener1());
		jbtClean.addActionListener(new ButtonListener2());
	
	}


	//compute
	private class ButtonListener1 implements ActionListener{
		
		@Override 
		public void actionPerformed(ActionEvent e){
			
			double Perimeter = Integer.parseInt(jtfRadius.getText())*2*3.14;
			double Area = Integer.parseInt(jtfRadius.getText())*Integer.parseInt(jtfRadius.getText())*3.14;
			
			jtfPerimeter.setText(String.format("%f",Perimeter));
			jtfArea.setText(String.format("%f",Area));
		}
		
		
	}
	
	//clean
	private class ButtonListener2 implements ActionListener{
		
		@Override 
		public void actionPerformed(ActionEvent e){
			
			jtfArea.setText("");
			jtfRadius.setText("");
			jtfPerimeter.setText("");
		}
		
		
	}
	
}
