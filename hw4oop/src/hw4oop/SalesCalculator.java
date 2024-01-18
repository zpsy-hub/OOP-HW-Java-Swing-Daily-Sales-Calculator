package hw4oop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class SalesCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_PhoneItemName;
	private JTextField textField_PhonePrice;
	private JTextField textField__PhoneQuantity;
	private JTextField textField_PhoneTotalSales;
	private JTextField textField_RepairItemName;
	private JTextField textField_RepairPrice;
	private JTextField textField_2;
	private JTextField textField_TotalRepairSales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalesCalculator frame = new SalesCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SalesCalculator() {
		setTitle("Daily Sales Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Phone Sales GUI components
		JPanel PhoneSales = new JPanel();
		PhoneSales.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		PhoneSales.setBounds(10, 10, 254, 282);
		contentPane.add(PhoneSales);
		PhoneSales.setLayout(null);
		
		JLabel lblNewLabel_HeaderPhoneSales = new JLabel("Phone Sales");
		lblNewLabel_HeaderPhoneSales.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_HeaderPhoneSales.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_HeaderPhoneSales.setBounds(0, 10, 254, 22);
		PhoneSales.add(lblNewLabel_HeaderPhoneSales);
		
		JLabel lblNewLabel_PhoneItemName = new JLabel("Item Name:");
		lblNewLabel_PhoneItemName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_PhoneItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_PhoneItemName.setBounds(25, 58, 75, 13);
		PhoneSales.add(lblNewLabel_PhoneItemName);
		
		JLabel lblNewLabel_PhonePrice = new JLabel("Price:");
		lblNewLabel_PhonePrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_PhonePrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_PhonePrice.setBounds(25, 94, 75, 13);
		PhoneSales.add(lblNewLabel_PhonePrice);
		
		JLabel lblNewLabel__PhoneQuantity = new JLabel("Quantity:");
		lblNewLabel__PhoneQuantity.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel__PhoneQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel__PhoneQuantity.setBounds(25, 128, 75, 22);
		PhoneSales.add(lblNewLabel__PhoneQuantity);
		
		textField_PhoneItemName = new JTextField();
		textField_PhoneItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_PhoneItemName.setBounds(110, 55, 119, 19);
		PhoneSales.add(textField_PhoneItemName);
		textField_PhoneItemName.setColumns(10);
		
		JLabel lblNewLabel_PhoneTotalSales = new JLabel("Phones Total Sales:");
		lblNewLabel_PhoneTotalSales.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_PhoneTotalSales.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_PhoneTotalSales.setBounds(23, 213, 204, 13);
		PhoneSales.add(lblNewLabel_PhoneTotalSales);
		
		textField_PhonePrice = new JTextField();
		textField_PhonePrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_PhonePrice.setColumns(10);
		textField_PhonePrice.setBounds(110, 91, 119, 19);
		PhoneSales.add(textField_PhonePrice);
		
		textField__PhoneQuantity = new JTextField();
		textField__PhoneQuantity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField__PhoneQuantity.setColumns(10);
		textField__PhoneQuantity.setBounds(110, 130, 119, 19);
		PhoneSales.add(textField__PhoneQuantity);
		
		textField_PhoneTotalSales = new JTextField();
		textField_PhoneTotalSales.setEditable(false);
		textField_PhoneTotalSales.setHorizontalAlignment(SwingConstants.CENTER);
		textField_PhoneTotalSales.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_PhoneTotalSales.setColumns(10);
		textField_PhoneTotalSales.setBounds(57, 236, 137, 25);
		PhoneSales.add(textField_PhoneTotalSales);
		
		JButton btnNewButton_CalculatePhoneSales = new JButton("Calculate Phone Sales");
		btnNewButton_CalculatePhoneSales.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_CalculatePhoneSales.setBounds(25, 170, 194, 22);
		PhoneSales.add(btnNewButton_CalculatePhoneSales);
		
		btnNewButton_CalculatePhoneSales.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String itemName = textField_PhoneItemName.getText();
		            double price = Double.parseDouble(textField_PhonePrice.getText());
		            int quantitySold = Integer.parseInt(textField__PhoneQuantity.getText());

		            // Create Phone instance
		            Phone phone = new Phone(itemName, price, quantitySold);

		            // Calculate and display total sales with Philippine Peso sign
		            double phoneTotalSales = phone.calculateTotalSales();
		            textField_PhoneTotalSales.setText("₱" + String.format("%.2f", phoneTotalSales));
		        } catch (NumberFormatException ex) {
		            // Handle the case where input is not a valid number
		            textField_PhoneTotalSales.setText("Invalid Input");
		        }
		    }
		});

		
		//Repair Services GUI components
		JPanel RepairServices = new JPanel();
		RepairServices.setBorder(new LineBorder(new Color(192, 192, 192), 1, true));
		RepairServices.setBounds(274, 10, 254, 282);
		contentPane.add(RepairServices);
		RepairServices.setLayout(null);
		
		JLabel lblNewLabel_HeaderRepairServices = new JLabel("Repair Services");
		lblNewLabel_HeaderRepairServices.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_HeaderRepairServices.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_HeaderRepairServices.setBounds(0, 10, 254, 22);
		RepairServices.add(lblNewLabel_HeaderRepairServices);
		
		JLabel lblNewLabel_RepairItemName = new JLabel("Service Name:");
		lblNewLabel_RepairItemName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_RepairItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_RepairItemName.setBounds(10, 58, 100, 13);
		RepairServices.add(lblNewLabel_RepairItemName);
		
		textField_RepairItemName = new JTextField();
		textField_RepairItemName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_RepairItemName.setColumns(10);
		textField_RepairItemName.setBounds(120, 55, 119, 19);
		RepairServices.add(textField_RepairItemName);
		
		JLabel lblNewLabel_RepairPrice = new JLabel("Price Per Hour:");
		lblNewLabel_RepairPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_RepairPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_RepairPrice.setBounds(10, 94, 100, 13);
		RepairServices.add(lblNewLabel_RepairPrice);
		
		textField_RepairPrice = new JTextField();
		textField_RepairPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_RepairPrice.setColumns(10);
		textField_RepairPrice.setBounds(120, 91, 119, 19);
		RepairServices.add(textField_RepairPrice);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(120, 130, 119, 19);
		RepairServices.add(textField_2);
		
		JLabel lblNewLabel__PhoneQuantity_1 = new JLabel("Number of Hrs:");
		lblNewLabel__PhoneQuantity_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel__PhoneQuantity_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel__PhoneQuantity_1.setBounds(10, 128, 100, 22);
		RepairServices.add(lblNewLabel__PhoneQuantity_1);
		
		JLabel lblNewLabel_TotalRepairSales = new JLabel("Repair Total Sales:");
		lblNewLabel_TotalRepairSales.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_TotalRepairSales.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_TotalRepairSales.setBounds(23, 213, 204, 13);
		RepairServices.add(lblNewLabel_TotalRepairSales);
		
		textField_TotalRepairSales = new JTextField();
		textField_TotalRepairSales.setHorizontalAlignment(SwingConstants.CENTER);
		textField_TotalRepairSales.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField_TotalRepairSales.setEditable(false);
		textField_TotalRepairSales.setColumns(10);
		textField_TotalRepairSales.setBounds(57, 236, 137, 25);
		RepairServices.add(textField_TotalRepairSales);
		
		JButton btnNewButton_CalculateRepairSales = new JButton("Calculate Repair Sales");
		btnNewButton_CalculateRepairSales.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_CalculateRepairSales.setBounds(25, 170, 194, 22);
		RepairServices.add(btnNewButton_CalculateRepairSales);
		
		btnNewButton_CalculateRepairSales.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            String itemName = textField_RepairItemName.getText();
		            double pricePerHour = Double.parseDouble(textField_RepairPrice.getText());
		            int numberOfHours = Integer.parseInt(textField_2.getText());

		            // Create RepairService instance
		            RepairService repairService = new RepairService(itemName, pricePerHour, numberOfHours);

		            // Calculate and display total sales with Philippine Peso sign
		            double repairServiceTotalSales = repairService.calculateTotalSales();
		            textField_TotalRepairSales.setText("₱" + String.format("%.2f", repairServiceTotalSales));
		        } catch (NumberFormatException ex) {
		            // Handle the case where input is not a valid number
		            textField_TotalRepairSales.setText("Invalid Input");
		        }
		    }
		});

		
	}
}
