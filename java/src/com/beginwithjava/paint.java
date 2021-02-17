import javax.swing.JOptionPane;
public class paint{
    public static void main(String[] args){
        float length,width,height;
        int noofdoor, noofwindow;
        
        System.out.println("To find the number of gallon required to paint the wall");
        
        String l = JOptionPane.showInputDialog("enter the length : ");
        length = Integer.parseInt(l);
        String w = JOptionPane.showInputDialog("enter the width : ");
        width = Integer.parseInt(w);
        String h = JOptionPane.showInputDialog("enter the height : ");
        height = Integer.parseInt(h);
        String d = JOptionPane.showInputDialog("number of doors : ");
        noofdoor = Integer.parseInt(d);
        String win = JOptionPane.showInputDialog("number of windows : ");
        noofwindow = Integer.parseInt(win);
        
        float area = 2 * ((length * width) + (length * height) + (width * height));
        float floor = length * width;
        int doors = 20 * noofdoor;
        int windows = 15 * noofwindow;
        float totalarea = area - floor - doors - windows;
        
        float paint = (totalarea / 350);
        
        
        JOptionPane.showMessageDialog(null, "Total number of gallon required to paint the wall is : " + (int)paint);
}
}
