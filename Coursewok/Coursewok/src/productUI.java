import java.awt.EventQueue;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;

public class productUI {

	private JFrame frame;
	private JTextField Lname;
	private JTextField LstockLevel;
	private JTextField Lprice;
	private JTable table;

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					productUI window = new productUI();
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
	public productUI() {
		initialize();
	}



	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 175, 175));
		frame.setBounds(100, 100, 550, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Tprice = new JLabel("Price");
		Tprice.setBounds(23, 298, 85, 30);
		frame.getContentPane().add(Tprice);
		
		JLabel Tname = new JLabel("Name ");
		Tname.setBounds(23, 226, 85, 30);
		frame.getContentPane().add(Tname);
		
		JLabel TstockLevel = new JLabel("Stock Level");
		TstockLevel.setBounds(23, 262, 85, 30);
		frame.getContentPane().add(TstockLevel);
		
		Lname = new JTextField();
		Lname.setBounds(87, 231, 86, 20);
		frame.getContentPane().add(Lname);
		Lname.setColumns(10);
		
		LstockLevel = new JTextField();
		LstockLevel.setBounds(87, 267, 86, 20);
		frame.getContentPane().add(LstockLevel);
		LstockLevel.setColumns(10);
		
		Lprice = new JTextField();
		Lprice.setBounds(87, 303, 86, 20);
		frame.getContentPane().add(Lprice);
		Lprice.setColumns(10);
		
		JButton BreStart = new JButton("Restart");
		BreStart.setBounds(413, 265, 100, 35);
		frame.getContentPane().add(BreStart);
		
		JButton Bsell = new JButton("Sell");
		Bsell.setBounds(314, 265, 100, 35);
		frame.getContentPane().add(Bsell);
		
		JButton BreStock = new JButton("Re-stock");
		BreStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		BreStock.setBounds(314, 229, 100, 35);
		frame.getContentPane().add(BreStock);
		
		JButton BsetPrice = new JButton("Set price");
		BsetPrice.setBounds(413, 229, 100, 35);
		frame.getContentPane().add(BsetPrice);
		
		JLabel IDL = new JLabel("u1827843. All rights reserveed");
		IDL.setBounds(359, 311, 154, 22);
		frame.getContentPane().add(IDL);
		
		table = new JTable();
		table.setBounds(21, 11, 492, 209);
		frame.getContentPane().add(table);
		
		JButton Badd = new JButton("Add product");
		Badd.setBounds(20, 327, 153, 23);
		frame.getContentPane().add(Badd);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
	}
}
