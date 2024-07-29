package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tempratureConvertor {

	private JFrame frame;
	private JTextField textField;
	private JTextField resulttext;

	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tempratureConvertor window = new tempratureConvertor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tempratureConvertor() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 560, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TEMPERATURE CONVERTOR");
		lblNewLabel.setFont(new Font("Segoe UI Variable", Font.BOLD, 20));
		lblNewLabel.setBounds(100, 10, 288, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Degree = new JLabel("DEGREE");
		Degree.setFont(new Font("STXihei", Font.BOLD, 15));
		Degree.setBounds(60, 121, 105, 23);
		frame.getContentPane().add(Degree);
		
		textField = new JTextField();
		textField.setBounds(60, 154, 124, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("TYPE");
		lblNewLabel_1_1.setFont(new Font("STXihei", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(282, 121, 105, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		
		 String s1[] = {"Celsius", "Fahrenheit", "Kelvin"};
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setBounds(282, 154, 148, 32);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_2 = new JLabel("CONVERT  TO :");
		lblNewLabel_1_2.setFont(new Font("STXihei", Font.BOLD, 15));
		lblNewLabel_1_2.setBounds(108, 236, 124, 23);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		
		 String s2[] = {"Celsius", "Fahrenheit", "Kelvin"};
		JComboBox comboBox_1 = new JComboBox(s2);
		comboBox_1.setBounds(282, 225, 148, 32);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("RESULT");
		lblNewLabel_1_3.setFont(new Font("STXihei", Font.BOLD, 15));
		lblNewLabel_1_3.setBounds(82, 309, 62, 23);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		resulttext = new JTextField();
		resulttext.setEditable(false);
		resulttext.setColumns(10);
		resulttext.setBounds(162, 307, 96, 32);
		frame.getContentPane().add(resulttext);
		
		JButton btnNewButton = new JButton("CONVERT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String temp = (String) comboBox.getSelectedItem();
	            String tempConvert = (String) comboBox_1.getSelectedItem();
				
				


	            if(temp.equals("Celsius") && tempConvert.equals("Fahrenheit")){
	                    double c = Double.parseDouble(textField.getText());
	                    double f = (double) (c*1.8+32);
	                    resulttext.setText(String.valueOf(f));         
	            }
	            
	            
	            else if (temp.equals("Celsius") && tempConvert.equals("Kelvin")) {
                    double c = Double.parseDouble(textField.getText());
                    double k = (double) (c+273);
                    resulttext.setText(String.valueOf(k));
            }
				
	            else if (temp.equals("Celsius") && tempConvert.equals("Celsius")) {
                    double c = Double.parseDouble(textField.getText());
                    resulttext.setText(String.valueOf(c));
            }
				
				

	            if(temp.equals("Fahrenheit") && tempConvert.equals("Celsius")) {
	                double f = Double.parseDouble(textField.getText());
	                double c = (double)((f - 32)*5/9);
	                resulttext.setText(String.valueOf(c));
	            }
	            else if(temp.equals("Fahrenheit") && tempConvert.equals("Kelvin")) {
	                double f = Double.parseDouble(textField.getText());
	                double k = (double)((f - 32)*5/9 + 273.15);
	                resulttext.setText(String.valueOf(k));
	            }
	            else if(temp.equals("Fahrenheit") && tempConvert.equals("Fahrenheit")) {
	                double f = Double.parseDouble(textField.getText());
	                resulttext.setText(String.valueOf(f));
	            }
				

	            if(temp.equals("Kelvin") && tempConvert.equals("Fahrenheit")) {
	                double k = Double.parseDouble(textField.getText());
	                double f = (double) ((k*(9/5))-459.67);
	                resulttext.setText(String.valueOf(f));
	            }
	           else if (temp.equals("Kelvin") && tempConvert.equals("Kelvin")) {
	                double k = Double.parseDouble(textField.getText());
	                resulttext.setText(String.valueOf(k));
	            }
	           else if (temp.equals("Kelvin") && tempConvert.equals("Celcius")) {
	                double k = Double.parseDouble(textField.getText());
	                double c = (double) (k-273);
	                resulttext.setText(String.valueOf(c));
	                }
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		btnNewButton.setBounds(162, 380, 169, 37);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 14));
		btnNewButton_1.setBounds(369, 430, 105, 37);
		frame.getContentPane().add(btnNewButton_1);
	}
}
