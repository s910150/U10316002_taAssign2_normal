import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square extends JPanel{

	private JTextField jtfSideLength = new JTextField(5);
	private JTextField jtfArea = new JTextField(5);
	private JTextField jtfPerimeter = new JTextField(5);
	
	private JButton jbtCompute = new JButton("Compute");
	private JButton jbtClean = new JButton("Clean");
	
	public Square() {
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(3,4,1,1));

		panel.add(new JLabel("Square:"));
		panel.add(new JLabel(""));

		
		panel.add(new JLabel("Side length:"));
		panel.add(jtfSideLength);
		
		
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
				
				int Perimeter = Integer.parseInt(jtfSideLength.getText())*4;
				int Area = Integer.parseInt(jtfSideLength.getText())*Integer.parseInt(jtfSideLength.getText());
				
				jtfPerimeter.setText(String.format("%d",Perimeter));
				jtfArea.setText(String.format("%d",Area));
			}
			
			
		}
		
		//clean
		private class ButtonListener2 implements ActionListener{
			
			@Override 
			public void actionPerformed(ActionEvent e){
				
				jtfArea.setText("");
				jtfSideLength.setText("");
				jtfPerimeter.setText("");
			
			}
			
			
		}
	
}
