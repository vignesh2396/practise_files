import com.skillsbuild.label_test;

import java.awt.*;

public class label extends Frame {
    Frame f;
    Label l;

    public void label_test() {
        f = new Frame("full stack web developer");
        l = new Label("hello java developer");
        String str = l.getText();
        l.setText("new value");
        l.setBounds(100, 200, 300, 400);
        f.add(l);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
    }

    public static void main(String[] args) {
        label_test obj1 = new label_test();
    }
}
