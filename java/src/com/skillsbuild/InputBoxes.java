import javax.swing.JOptionPane;
public class InputBoxes{
    public static void main(String[] args){
/*   
        String first_name;
        first_name = JOptionPane.showInputDialog("First name","enter your first name");
        
        String last_name;
        last_name = JOptionPane.showInputDialog("last name", "enter your last name");
        
        String full_name;
        full_name = "your name is " + first_name + " " + last_name;

        //different ways of representing the output message.
        JOptionPane.showMessageDialog(null,full_name,"Name",JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,full_name,"Name",JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null,full_name,"Name",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,full_name,"Name",JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null,full_name,"Name",JOptionPane.WARNING_MESSAGE);
*/

//to print the area of the rectangle

        String length,breadth;
        
        length = JOptionPane.showInputDialog("length : ");
        breadth = JOptionPane.showInputDialog("breadth : ");
/*        
        int area;
        area = Integer.parseInt(length) * Integer.parseInt(breadth); // to convert the String value to integer value. */
        
        float area;
        area = Float.parseFloat(length) * Float.parseFloat(breadth); // to convert the String value to float value.
        
        JOptionPane.showMessageDialog(null, "area = " + area,"area of a rectangle",JOptionPane.PLAIN_MESSAGE);
        
        System.out.println("area is " + area);
   
// 
        System.exit(0);
        
    }
}