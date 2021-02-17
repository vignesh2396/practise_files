import javax.swing.JOptionPane;
import java.util.Scanner;
class iojava{
public static void main(String args[]){
    /*String s;
	s=JOptionPane.showInputDialog("enter your name");
	JOptionPane.showMessageDialog(null,s);*/
	
	String r;
	float radius;
	double circumference;
	double area;
	
	/*Scanner input = new Scanner(System.in);
	System.out.print("enter a value");	
	radius = input.nextFloat();*/
	
	r = JOptionPane.showInputDialog("enter a value");
	radius = Float.parseFloat(r);
	circumference = 2 * Math.PI * radius;
	area = 2 * radius * radius;
	JOptionPane.showMessageDialog(null,"circumference is : "+ circumference);
	JOptionPane.showMessageDialog(null,"area is : "+ area);
}
}
