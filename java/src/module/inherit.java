package module;

import javax.swing.*;
import java.awt.*;
class inherit extends Frame{
    inherit(){
        Button b = new Button("click me");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);

    }
public static void main(String args[]){
    inherit f = new inherit();
}

}
