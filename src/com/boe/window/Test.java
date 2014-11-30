package com.boe.window;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Test extends javax.swing.JFrame {
	private static Test frame;
	private JTree jTree;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenuItem jMenuItem_help;
	private javax.swing.JMenuItem jMenuItem_admin;
	public CardLayout c;
	private javax.swing.JMenuItem jMenuItem_exit;
	public JPanel panel2;
	public JScrollPane spPage;

	private Test() {
		initComponents();
	}

	private void initComponents() {
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenuItem_help = new javax.swing.JMenuItem();
		jMenuItem_admin = new javax.swing.JMenuItem();
		c = new CardLayout();
		panel2 = new JPanel();
		spPage = new JScrollPane();
		jMenuItem_exit = new javax.swing.JMenuItem();
		jMenu1.setText("工具");
		jMenu1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenu1ActionPerformed(evt);
			}
		});
		jMenuItem_admin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_N,
				java.awt.event.InputEvent.CTRL_MASK));
		jMenuItem_admin.setText("登陆");
		jMenu1.add(jMenuItem_admin);
		jMenuItem_exit.setText("退出");
		jMenuItem_exit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem_exitActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem_exit);
		jMenuBar1.add(jMenu1);
		jMenu2.setText("帮助");

		jMenuItem_help.setAccelerator(javax.swing.KeyStroke.getKeyStroke(
				java.awt.event.KeyEvent.VK_F1, 0));
		jMenuItem_help.setText("使用说明");
		jMenuItem_help.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem_helpActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem_help);
		jMenuBar1.add(jMenu2);

		DefaultMutableTreeNode root = new DefaultMutableTreeNode("功能列表");
		DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("文件同步配置信息");
		DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("文件信息");
		DefaultMutableTreeNode child3 = new DefaultMutableTreeNode("文件同步日志信息");
		DefaultMutableTreeNode child1sel = new DefaultMutableTreeNode("查询配置信息");
		DefaultMutableTreeNode child1ins = new DefaultMutableTreeNode("添加商户");
		DefaultMutableTreeNode child1upd = new DefaultMutableTreeNode("修改配置信息");
		DefaultMutableTreeNode child1del = new DefaultMutableTreeNode("删除商户");
		DefaultMutableTreeNode child2sel = new DefaultMutableTreeNode("查询文件信息");
		DefaultMutableTreeNode child3sel = new DefaultMutableTreeNode("查询同步信息");
		root.add(child1);
		root.add(child2);
		root.add(child3);
		child1.add(child1sel);
		child1.add(child1ins);
		child1.add(child1upd);
		child1.add(child1del);
		child2.add(child2sel);
		child3.add(child3sel);

		DefaultTreeModel model = new DefaultTreeModel(root);
		jTree = new JTree(model);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		panel.setPreferredSize(new Dimension(700, 400));
		panel.add(new JScrollPane(jTree));
		final JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(10);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(150);
		getContentPane().add(splitPane, BorderLayout.CENTER);
		splitPane.setLeftComponent(panel);
		panel2.setLayout(c);
		splitPane.setRightComponent(panel2);
		final JPanel panPic = new JPanel();
		panPic.setName("panPic");
		panPic.setLayout(new BorderLayout());
		panel2.add(panPic, panPic.getName());
		/*
		 * ImageIcon img = new ImageIcon("src/IMG/1.png"); final JLabel label =
		 * new JLabel(img);
		 */
		final JLabel label = new JLabel();
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setHorizontalTextPosition(SwingConstants.CENTER);

		panPic.add(label, BorderLayout.CENTER);
		spPage.setName("Page");
		panel2.add(spPage, spPage.getName());

		SwingUtilities.updateComponentTreeUI(Test.this);

		setTitle("管理员配置界面");
		setJMenuBar(jMenuBar1);
		setContentPane(splitPane);
		setSize(1024, 730);
		
	}

	public static Test getFrame() {
		if (frame == null) {
			frame = new Test();
		}
		return frame;
	}

	private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void jMenuItem_helpActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "谢谢使用");
	}
  
	private void jMenuItem_exitActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				getFrame().setVisible(true);
			}
		});
	}

}
