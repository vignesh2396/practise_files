import java.applet.*;
import java.awt.*;

public class MyFirstApplet extends Applet {
    String str = null;
    TextField t1,t2;
    Image img1;
    AudioClip clip1;

    public void init() 
    {
 /*       //to insert text from html file
        str = getParameter("name");
        
        //to insert textbox
        t1 = new TextField(5);
        t2 = new TextField(5);
        add(t1);
        add(t2);
*/
        //to insert image
     //   img1 = getImage(getCodeBase(), "cover.png");

        clip1 = getAudioClip(getDocumentBase(),"audio.mp3");
    }

    public void paint(Graphics g) {
/*        g.drawString(str, 100, 100);
        
        int x=0;
        x=Integer.parseInt(t1.getText());
        t2.setText(String.valueOf(x*x));
*/
     //   g.drawImage(img1,100,100, this);

        clip1.play();
        clip1.stop();
        clip1.loop();
    }
}
/*
 * <applet code="MyFirstApplet.class" height=300 width=200></applet>
 */