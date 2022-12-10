package edu.pitt.menumanager;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class MenuManagerGUI {

	private JFrame frame;
	private JFrame secondary;
	private JPanel left;
	private JPanel right;
	private JPanel topLeft;
	private JPanel botLeft;
	private JPanel rightBtns;
	private JPanel detailPanel;
	private JPanel detailLeft;
	private JPanel detailRight;
	private JLabel lblCustom;
	private JLabel lblGenerate;
	private JLabel lblCreated;
	private JLabel lblEntree;
	private JLabel lblSide;
	private JLabel lblSalad;
	private JLabel lblDessert;
	private JLabel lblDetailEntree;
	private JLabel lblDetailSide;
	private JLabel lblDetailSalad;
	private JLabel lblDetailDessert;
	private JLabel lblCalories;
	private JLabel lblPrice;
	private JTextArea entreeInfo;
	private JTextArea sideInfo;
	private JTextArea saladInfo;
	private JTextArea dessertInfo;
	private JTextArea calories;
	private JTextArea price;
	private JSplitPane splitVert;
	private JSplitPane splitLeft;
	private JSplitPane splitDetail;
	private JComboBox<Entree> cboEntree;
	private JComboBox<Side> cboSide;
	private JComboBox<Salad> cboSalad;
	private JComboBox<Dessert> cboDessert;
	private DefaultListModel<Menu> lstCreatedDemo;
	private JList<Menu> lstCreated;
	private JButton btnCustom;
	private JButton btnRandom;
	private JButton btnMin;
	private JButton btnMax;
	private JButton btnDetail;
	private JButton btnDelete;
	private JButton btnSave;
	private MenuManager dishManager;

	public MenuManagerGUI() {

		initialize();

	}

	public void initialize() {

		dishManager = new MenuManager("src/edu/pitt/menumanager/data/dishes.txt");

		// Primary frame
		frame = new JFrame("Menu Manager");
		frame.setBounds(350, 150, 750, 600);
		frame.setResizable(false);

		// Detail frame
		secondary = new JFrame();
		secondary.setVisible(false);
		secondary.setResizable(false);
		secondary.setBounds(350, 150, 750, 600);

		// Making titles and info elements
		detailPanel = new JPanel();
		detailLeft = new JPanel();
		detailLeft.setPreferredSize(new Dimension(360, 560));
		detailRight = new JPanel();
		detailRight.setPreferredSize(new Dimension(360, 560));
		detailLeft.setLayout(new BoxLayout(detailLeft, BoxLayout.PAGE_AXIS));
		detailRight.setLayout(new BoxLayout(detailRight, BoxLayout.PAGE_AXIS));
		
		// Labels
		lblDetailEntree = new JLabel("Entree");
		lblDetailSide = new JLabel("Side");
		lblDetailSalad = new JLabel("Salad");
		lblDetailDessert = new JLabel("Dessert");
		lblCalories = new JLabel("Total Calories");
		lblPrice = new JLabel("Total Price");
		
		// Dish info
		entreeInfo = new JTextArea();
		entreeInfo.setBorder((BorderFactory.createLineBorder(Color.black)));
		entreeInfo.setPreferredSize(new Dimension(100, 100));
		entreeInfo.setEditable(false);
		sideInfo = new JTextArea();
		sideInfo.setBorder((BorderFactory.createLineBorder(Color.black)));
		sideInfo.setPreferredSize(new Dimension(100, 100));
		sideInfo.setEditable(false);
		saladInfo = new JTextArea();
		saladInfo.setBorder((BorderFactory.createLineBorder(Color.black)));
		saladInfo.setPreferredSize(new Dimension(100, 100));
		saladInfo.setEditable(false);
		dessertInfo = new JTextArea();
		dessertInfo.setBorder((BorderFactory.createLineBorder(Color.black)));
		dessertInfo.setPreferredSize(new Dimension(100, 100));
		dessertInfo.setEditable(false);
		calories = new JTextArea();
		calories.setBorder((BorderFactory.createLineBorder(Color.black)));
		calories.setPreferredSize(new Dimension(10, 100));
		price = new JTextArea();
		price.setBorder((BorderFactory.createLineBorder(Color.black)));
		price.setPreferredSize(new Dimension(10, 100));

		// Make splitPane and add all to secondary - set spacing
		splitDetail = new JSplitPane(SwingConstants.VERTICAL, detailLeft, detailRight);
		splitDetail.setDividerLocation(100);
		splitDetail.setEnabled(false);
		detailLeft.add(lblDetailEntree);
		detailLeft.add(Box.createVerticalStrut(78));
		detailLeft.add(lblDetailSide);
		detailLeft.add(Box.createVerticalStrut(79));
		detailLeft.add(lblDetailSalad);
		detailLeft.add(Box.createVerticalStrut(79));
		detailLeft.add(lblDetailDessert);
		detailLeft.add(Box.createVerticalStrut(79));
		detailLeft.add(lblCalories);
		detailLeft.add(Box.createVerticalStrut(78));
		detailLeft.add(lblPrice);
		detailRight.add(entreeInfo);
		detailRight.add(sideInfo);
		detailRight.add(saladInfo);
		detailRight.add(dessertInfo);
		detailRight.add(calories);
		detailRight.add(price);
		detailPanel.add(splitDetail);
		secondary.add(detailPanel);

		// Create left sections
		left = new JPanel();
		left.setPreferredSize(new Dimension(300, 600));
		topLeft = new JPanel();
		topLeft.setLayout(new BoxLayout(topLeft, SwingConstants.VERTICAL));
		topLeft.setPreferredSize(new Dimension(375, 300));
		topLeft.setBorder(BorderFactory.createLineBorder(Color.black));
		botLeft = new JPanel();
		botLeft.setLayout(new BoxLayout(botLeft, SwingConstants.VERTICAL));
		botLeft.setPreferredSize(new Dimension(375, 250));
		botLeft.setBorder(BorderFactory.createLineBorder(Color.black));

		// topLeft label
		lblCustom = new JLabel("Build your own Menu");
		lblCustom.setAlignmentX(Component.CENTER_ALIGNMENT);
		topLeft.add(lblCustom);

		// botLeft label
		lblGenerate = new JLabel("Or generate a Menu");
		lblGenerate.setAlignmentX(Component.CENTER_ALIGNMENT);
		botLeft.add(lblGenerate);
		topLeft.add(Box.createVerticalGlue());

		// entree cbo and label
		lblEntree = new JLabel("Entree:");
		cboEntree = new JComboBox(dishManager.getEntrees().toArray());
		lblEntree.setAlignmentX(Component.CENTER_ALIGNMENT);
		topLeft.add(lblEntree);
		topLeft.add(cboEntree);
		
		// side cbo and label
		lblSide = new JLabel("Side:");
		cboSide= new JComboBox(dishManager.getSides().toArray());
		lblSide.setAlignmentX(Component.CENTER_ALIGNMENT);
		topLeft.add(lblSide);
		topLeft.add(cboSide);

		// salad cbo and label
		lblSalad = new JLabel("Salad:");
		cboSalad = new JComboBox(dishManager.getSalads().toArray());
		lblSalad.setAlignmentX(Component.CENTER_ALIGNMENT);
		topLeft.add(lblSalad);
		topLeft.add(cboSalad);

		// dessert cbo and label
		lblDessert = new JLabel("Dessert:");
		cboDessert = new JComboBox(dishManager.getDesserts().toArray());
		lblDessert.setAlignmentX(Component.CENTER_ALIGNMENT);
		topLeft.add(lblDessert);
		topLeft.add(cboDessert);

		// topLeft create custom button
		btnCustom = new JButton("Create Menu with these dishes");
		btnCustom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu custom = new Menu(JOptionPane.showInputDialog("What would you like this menu to be named?"), (Entree) cboEntree.getSelectedItem(), (Side) cboSide.getSelectedItem(), (Salad) cboSalad.getSelectedItem(), (Dessert) cboDessert.getSelectedItem());
				lstCreatedDemo.addElement(custom);
			}
		});
		btnCustom.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnCustom.add(Box.createVerticalStrut(25));
		btnCustom.add(Box.createVerticalGlue());
		btnCustom.setFont(new Font("Arial", Font.PLAIN, 20));
		topLeft.add(btnCustom);

		// botLeft buttons
		btnRandom = new JButton("Generate a Random Menu");
		btnRandom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu random = dishManager.randomMenu(JOptionPane.showInputDialog("What would you like this menu to be named?"));
				if(random.getName().equals("") == false)
					lstCreatedDemo.addElement(random);
			}
		});
		btnRandom.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnRandom.add(Box.createVerticalStrut(25));
		btnRandom.add(Box.createVerticalGlue());
		btnRandom.setFont(new Font("Arial", Font.PLAIN, 20));
		botLeft.add(btnRandom);

		btnMin = new JButton("Generate a Minimum Calories Menu");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu min = dishManager.minCaloriesMenu(JOptionPane.showInputDialog("What would you like this menu to be named?"));
				if(min.getName().equals("") == false)
					lstCreatedDemo.addElement(min);
			}
		});
		btnMin.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnMin.add(Box.createVerticalStrut(25));
		btnMin.add(Box.createVerticalGlue());
		btnMin.setFont(new Font("Arial", Font.PLAIN, 20));
		botLeft.add(btnMin);

		btnMax = new JButton("Generate a Maximum Calories Menu");
		btnMax.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu max = dishManager.maxCaloriesMenu(JOptionPane.showInputDialog("What would you like this menu to be named?"));
				if(max.getName().equals("") == false)
					lstCreatedDemo.addElement(max);
			}
		});
		btnMax.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnMax.add(Box.createVerticalStrut(25));
		btnMax.add(Box.createVerticalGlue());
		btnMax.setFont(new Font("Arial", Font.PLAIN, 20));
		botLeft.add(btnMax);

		// Create right panel of primary window
		right = new JPanel();
		right.setBorder(BorderFactory.createLineBorder(Color.black));

		//right label
		lblCreated =  new JLabel("Created Menus:");
		right.add(lblCreated);

		// Created menu list to display creted menus
		lstCreatedDemo = new DefaultListModel();
		lstCreated = new JList(lstCreatedDemo);
		lstCreated.setFont(new Font("Arial", Font.PLAIN, 20));
		lstCreated.setBorder((BorderFactory.createLineBorder(Color.black)));
		lstCreated.setPreferredSize(new Dimension(350, 475));
		right.add(lstCreated);

		// Create right buttons
		rightBtns = new JPanel();
		rightBtns.setLayout(new FlowLayout());
		btnDetail = new JButton("Details");
		btnDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondary.setTitle(((Menu)lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex())).getName());
				secondary.setVisible(true);
				double totalPrice = (lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getEntree().getPrice()) + (lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getSide().getPrice()) + (lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getSalad().getPrice()) + (lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getDessert().getPrice());
				Entree tempEntree = lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getEntree();
				Side tempSide = lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getSide();
				Salad tempSalad = lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getSalad();
				Dessert tempDessert = lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).getDessert();
				entreeInfo.setText(""  + tempEntree.getName() + "\n" + tempEntree.getDescription() + "\nCalories: " + tempEntree.getCalories() + "\nPrice: " + tempEntree.getPrice());
				sideInfo.setText(""  + tempSide.getName() + "\n" + tempSide.getDescription() + "\nCalories: " + tempSide.getCalories() + "\nPrice: " + tempSide.getPrice());
				saladInfo.setText(""  + tempSalad.getName() + "\n" + tempSalad.getDescription() + "\nCalories: " + tempSalad.getCalories() + "\nPrice: " + tempSalad.getPrice());
				dessertInfo.setText(""  + tempDessert.getName() + "\n" + tempDessert.getDescription() + "\nCalories: " + tempDessert.getCalories() + "\nPrice: " + tempDessert.getPrice());
				calories.setText("" + lstCreatedDemo.getElementAt(lstCreated.getSelectedIndex()).totalCalories());
				price.setText("" + totalPrice);
			}
		});
		btnDetail.setPreferredSize(new Dimension(115, 50));
		btnDetail.setFont(new Font("Arial", Font.PLAIN, 20));
		rightBtns.add(btnDetail);
		btnDelete = new JButton("Delete all");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lstCreatedDemo.removeAllElements();
			}
		});
		btnDelete.setPreferredSize(new Dimension(115, 50));
		btnDelete.setFont(new Font("Arial", Font.PLAIN, 20));
		rightBtns.add(btnDelete);
		btnSave = new JButton("Save to file");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Menu> createdMenus = new ArrayList<>();
				for(int i=0; i<lstCreated.getModel().getSize(); i++) {
					createdMenus.add((Menu)lstCreatedDemo.getElementAt(i));
				}
				FileManager.writeMenus("src/edu/pitt/menumanager/data/menus.txt", createdMenus);
			}
		});
		btnSave.setPreferredSize(new Dimension(115, 50));
		btnSave.setFont(new Font("Arial", Font.PLAIN, 20));
		rightBtns.add(btnSave);
		right.add(rightBtns);


		// Add left sections to left panel
		left.add(topLeft);
		left.add(botLeft);

		// Create splitPanes for between topLeft, botLeft, and right
		splitVert = new JSplitPane(SwingConstants.VERTICAL, left, right);
		splitVert.setEnabled(false);
		splitLeft = new JSplitPane(SwingConstants.HORIZONTAL, topLeft, botLeft);
		splitLeft.setEnabled(false);
		splitVert.setDividerLocation(375);
		splitLeft.setDividerLocation(300);

		left.add(splitLeft);
		frame.add(splitVert);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		MenuManagerGUI window = new MenuManagerGUI();
		window.frame.setVisible(true);
	}

}
