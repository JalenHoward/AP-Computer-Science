// Shows a simple graphics box
import java.awt.*;
import javax.swing.*;

public class Classwork extends JPanel 
{
	public void paintComponent (Graphics g)
	{
		super.paintComponent(g); //Call JPanel's paintComponent method
		
		g.setColor(Color.PINK); //sets the color red
		g.drawRect(20, 40, 300, 90); // creates a red rectangle (300 by 90) in the upper left corner of the window at x = 20 and y = 40
		
		g.setColor(Color.WHITE); // sets the color blue
		g.drawString("Jalen Howard", 130, 95); //creates a string of blue text starting at x = 130 and y = 95
	}
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame ("Classwork 1-1"); //sets the window name to be "Graphics Demo"
		window.setBounds(300, 300, 200, 150); //sets the windows location and size
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Classwork panel = new Classwork ();
		panel.setBackground(Color.BLACK); //sets the background color of the window
		
		Container c = window.getContentPane();
		c.add(panel);
		
		
		window.setExtendedState(JFrame.MAXIMIZED_BOTH); //starts the window in a maximized state, but not true fullscreen
		window.setVisible(true); //sets the window's visibility
	}
	}
