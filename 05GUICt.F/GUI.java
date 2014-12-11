import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener{
    private Container pane;
    private Container buttons;
    private Container enterHere;
    private Container message;

    private JButton a, b, c;
    private JTextField t;
    private JLabel l;

    public GUI(){
	this.setTitle("Temperture Converter");
	this.setSize(300,200);
	this.setLocation(300,300);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(3,1));

	a = new JButton("Clear");
	b = new JButton("Celcius");
	c = new JButton("Farenheit");
	t = new JTextField(20);
	l = new JLabel("YOU MUST CLEAR TO CONVERT AGAIN", null, JLabel.CENTER);

        b.setActionCommand("toCelcius");
	b.addActionListener(this);
	c.setActionCommand("toFarenheit");
	c.addActionListener(this);
	a.setActionCommand("toClear");
	a.addActionListener(this);

	buttons = new Container();
	buttons.setLayout(new FlowLayout());
	buttons.add(a);
	buttons.add(b);
	buttons.add(c);

	enterHere = new Container();
	enterHere.setLayout(new FlowLayout());
	enterHere.add(t);

	message = new Container();
	message.setLayout(new FlowLayout());
	message.add(l);

	pane.add(message);
	pane.add(enterHere);
	pane.add(buttons);
    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	String s = t.getText();
	double degree;

	if(action.equals("toCelcius")){
	    degree = Integer.parseInt(s);
	    degree = (degree - 32) * 5 / 9;
	    s = "" + degree;
	    t.setText(s + " C");
	}
	if(action.equals("toFarenheit")){
	    degree = Integer.parseInt(s);
	    degree = degree * 9 / 5 + 32;
	    s = "" + degree;
	    t.setText(s + " F");
	}
	if(action.equals("toClear")){
	    t.setText("");
	}
    }

    public static void main(String[]args){
	GUI g = new GUI();
	g.setVisible(true);
    }
}
