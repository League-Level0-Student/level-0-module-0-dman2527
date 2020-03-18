package _06_everything_is_awesome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
public static void main(String[] args) {
	String thing = JOptionPane.showInputDialog("What is one thing you like?");
	JOptionPane.showMessageDialog(null,thing + " Is AWESOME!");
	
}
}
