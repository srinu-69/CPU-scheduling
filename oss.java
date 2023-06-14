package Philosoper;

import java.awt.Color;
import java.sql.*;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
public class oss extends JFrame {
	private JPanel contentPane;

	private JButton btnNewButton;
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oss frame = new oss();
					frame.setTitle("OS SIMULATOR");
					frame.setVisible(true);
					frame.getContentPane().setBackground(new Color(1, 33, 63));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
public oss() {
	setIconImage(Toolkit.getDefaultToolkit()
			.getImage("C:\\Users\\abhih\\eclipse-workspace\\project\\src\\Stedium_Management\\stadium.png"));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(300, 100, 1000, 450);
	setResizable(false);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	contentPane.setLayout(null);

	JLabel lbluser = new JLabel("OS SIMULATOR");
	lbluser.setFont(new Font("Times New Roman", Font.BOLD, 46));
	lbluser.setForeground(Color.orange);
	lbluser.setBounds(320, 42, 400, 93);
	contentPane.add(lbluser);

	btnNewButton = new JButton("BANKERS");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(150, 200, 150, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			dispose();
			Home us = new Home();
			us.setVisible(true);
		}
	});
	contentPane.add(btnNewButton);
	
	btnNewButton = new JButton("SCHEDULING");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(400, 200, 200, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					dispose();
					new GUI();
		}
	});
	contentPane.add(btnNewButton);
	
	btnNewButton = new JButton("DINING");
	btnNewButton.setFont(new Font("Bahnschrift SemiLight", Font.PLAIN, 22));
	btnNewButton.setForeground(Color.red);
	btnNewButton.setBounds(700, 200, 150, 50);
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
					dispose();
					new Philosopher(1);
		}
	});
	contentPane.add(btnNewButton);
}}
