import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame{
    private Container pane;
    private Container buttons;

    private JButton a, b, c;
    private JTextField t;

    public GUI(){
	this.setTitle("Temperture Converter");
	this.setSize(2,1);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());

	a = new JButton("Clear");
	b = new JButton("Celcius");
	c = new JButton("Farenheit");
	t = new JTextField(10);

    }

    public static void main(String[]args){
	GUI g = new GUI();
	g.setVisible(true);
    }
}
