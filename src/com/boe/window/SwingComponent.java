package com.boe.window;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class SwingComponent {
	
	JFrame jf = new JFrame("BOE CIM TEST");
	
	//定义一个40列的单行文本域
	JTextField name = new JTextField(40);
	//定义一个按钮
	JButton ok = new JButton("确认");
	public void init() {
		initFont();
		setWindow2Center(jf);
		JPanel bottom = new JPanel();
		
		bottom.add(name);
		bottom.add(ok);
		jf.add(bottom, BorderLayout.SOUTH);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.pack();
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingComponent().init();
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
//		frame.setPreferredSize(new Dimension(512,450));           
		frame.setPreferredSize(new Dimension(512,screenSize.height-100));             
		int frameWidth = frame.getPreferredSize().width;
//		int frameHeight = frame.getPreferredSize().height;
		int frameHeight = screenSize.height;
		frame.setSize(frameWidth, frameHeight);
		frame.setLocation((screenSize.width - frameWidth) / 2,(screenSize.height - frameHeight) / 2);
	}
}
