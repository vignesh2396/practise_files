package com.zetcode;

import javax.swing.*;
import java.awt.*;

public class Donut extends JFrame {
    public Donut(){
        initUI();
    }

    private void initUI() {

        add(new Board()); //This is the entry point of the game. Here we have the main method.
        setSize(500,500); //Here we put the Board to the center of the JFrame container.
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//This line sets the size of the window.

        //This will close the application when we click on the close button.
        setLocationRelativeTo(null); //Passing null to the setLocationRelativeTo() method centers the window on the screen.
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Donut ex = new Donut();
            ex.setVisible(true);
        });
    }
}
