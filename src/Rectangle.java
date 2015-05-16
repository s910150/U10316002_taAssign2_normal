import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class Rectangle extends JPanel{

	private JTextField jtfLength = new JTextField(5);
	private JTextField jtfWidth = new JTextField(5);
	private JTextField jtfArea = new JTextField(5);
	private JTextField jtfPerimeter = new JTextField(5);
	
	private JButton jbtCompute = new JButton("Compute");
	private JButton jbtClean = new JButton("Clean");
	
	
	public Rectangle() {
	
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,4,1,1));

		panel.add(new JLabel("Rectangle:"));
		panel.add(new JLabel(""));
				
		
		panel.add(new JLabel("Length:"));
		panel.add(jtfLength);
		
		panel.add(new JLabel("Area:"));
		panel.add(jtfArea);
		
		panel.add(new JLabel("Width:"));
		panel.add(jtfWidth);
		
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
			
			int Perimeter = (Integer.parseInt(jtfLength.getText())+Integer.parseInt(jtfWidth.getText()))*2;
			int Area = Integer.parseInt(jtfLength.getText())*Integer.parseInt(jtfWidth.getText());
			
			jtfPerimeter.setText(String.format("%d",Perimeter));
			jtfArea.setText(String.format("%d",Area));
		}
		
		
	}
	
	//clean
	private class ButtonListener2 implements ActionListener{
		
		@Override 
		public void actionPerformed(ActionEvent e){
			
			jtfArea.setText("");
			jtfLength.setText("");
			jtfPerimeter.setText("");
			jtfWidth.setText("");
		
		}
		
		
	}
	
}
