package section3;

import javax.swing.JOptionPane;

public class Gibbyforprez {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Click Ok To Proceed With The Survey");
String name = JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null, "You entered " + name);
JOptionPane.showMessageDialog(null, "Great Name!");
}
}