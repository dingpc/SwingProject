package com.boe.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class SwingComponent {
	
	public static int WINDOW_WIDTH = 512;
	
	JFrame jf = new JFrame("BOE CIM TEST");
	
	JPanel leftPanel = new JPanel();
	JPanel rightPanel = new JPanel();
	JScrollPane bottomPanel = new JScrollPane();
	
	JButton headButton = new JButton("headButton");
	JButton leftButton = new JButton("leftButton");
	JButton rightButton = new JButton("rightButton");
	JButton buttomButton = new JButton("buttomButton");
	
	JTextArea console = new JTextArea();
	public void init() {
//		initFont();
		setWindow2Center(jf);
		UIs.setUI();
		jf.setLayout(new BorderLayout(0, 5));
		jf.add(leftPanel, BorderLayout.WEST);
		jf.add(rightPanel, BorderLayout.EAST);
		jf.add(bottomPanel, BorderLayout.SOUTH);
		
		initLeftLayout();
		
		rightPanel.setBorder(new TitledBorder("Cell"));
		rightPanel.setPreferredSize(new Dimension(240, 300));
		rightPanel.add(rightButton);
		
		bottomPanel.setBorder(new TitledBorder("Console"));
		bottomPanel.setPreferredSize(new Dimension(WINDOW_WIDTH, 500));
		bottomPanel.setViewportView(console);
		
		console.setBackground(Color.LIGHT_GRAY);
		console.append("我的控制台\n");
		for(int i = 0; i < 100; i++) {
			console.append("我的控制台\n");
		}
		
		jf.setResizable(false);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingComponent().init();
	}
	
	
	private void initLeftLayout() {
		JButton formateButton = new JButton("格式化");
//		formateButton.setSize(40, 20);
		JButton importButton = new JButton("导入");
		JButton delButton = new JButton("删除数据");
		
		JLabel formateLabel = new JLabel("格式化D:/MESTools/MESInformation.xls成标准文件");
		JLabel importLabel = new JLabel("导入D:/MESTools/mesinformation.xls到数据库");
		JTextField delTextfield = new JTextField();
		
		leftPanel.setBorder(new TitledBorder("Array"));
		leftPanel.setPreferredSize(new Dimension(240, 300));
		
		leftPanel.setLayout(new GridLayout(3, 2));
		leftPanel.add(formateLabel);
		leftPanel.add(formateButton);
		leftPanel.add(importLabel);
		leftPanel.add(importButton);
		leftPanel.add(delTextfield);
		leftPanel.add(delButton);
	}
	
	private void println(String out) {
		console.append("\n" + out);
	}
	
	private void print(String out) {
		console.append(out);
	}
	
	private void clearConsole() {
		console.setText("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void initFont() {
		Font vFont = new Font("Dialog", Font.PLAIN, 13);
		UIManager.put("ToolTip.font", vFont);
		UIManager.put("Table.font", vFont);
		UIManager.put("TableHeader.font", vFont);
		UIManager.put("TextField.font", vFont);
		UIManager.put("ComboBox.font", vFont);
		UIManager.put("TextField.font", vFont);
		UIManager.put("PasswordField.font", vFont);
		UIManager.put("TextArea.font", vFont);
		UIManager.put("TextPane.font", vFont);
		UIManager.put("EditorPane.font", vFont);
		UIManager.put("FormattedTextField.font", vFont);
		UIManager.put("Button.font", vFont);
		UIManager.put("CheckBox.font", vFont);
		UIManager.put("RadioButton.font", vFont);
		UIManager.put("ToggleButton.font", vFont);
		UIManager.put("ProgressBar.font", vFont);
		UIManager.put("DesktopIcon.font", vFont);
		UIManager.put("TitledBorder.font", vFont);
		UIManager.put("Label.font", vFont);
		UIManager.put("List.font", vFont);
		UIManager.put("TabbedPane.font", vFont);
		UIManager.put("MenuBar.font", vFont);
		UIManager.put("Menu.font", vFont);
		UIManager.put("MenuItem.font", vFont);
		UIManager.put("PopupMenu.font", vFont);
		UIManager.put("CheckBoxMenuItem.font", vFont);
		UIManager.put("RadioButtonMenuItem.font", vFont);
		UIManager.put("Spinner.font", vFont);
		UIManager.put("Tree.font", vFont);
		UIManager.put("ToolBar.font", vFont);
		UIManager.put("OptionPane.messageFont", vFont);
		UIManager.put("OptionPane.buttonFont", vFont);
	}
	
	private void setWindow2Center(JFrame frame) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setPreferredSize(new Dimension(WINDOW_WIDTH,450));           
		frame.setPreferredSize(new Dimension(WINDOW_WIDTH,screenSize.height-100));             
		int frameWidth = frame.getPreferredSize().width;
//		int frameHeight = frame.getPreferredSize().height;
		int frameHeight = screenSize.height;
		frame.setSize(frameWidth, frameHeight);
		frame.setLocation((screenSize.width - frameWidth) / 2,(screenSize.height - frameHeight) / 2);
	}
	
}
