package works;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class frameTest extends JFrame implements MouseListener, MouseMotionListener{
	public frameTest(){
		setTitle("Mouse Event");
		setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.addMouseListener(this); 
        panel.addMouseMotionListener(this); 
        add(panel);
        setVisible(true);
	}
	public void mousePressed(MouseEvent e){
        display("Mouse pressed (# of clicks: " + e.getClickCount() + ")", e);}
	
	public void mouseReleased(MouseEvent e){
        display("Mouse released (# of clicks: " + e.getClickCount() + ")", e);}

	public void mouseEntered(MouseEvent e){
        display("Mouse entered", e);}

	public void mouseExited(MouseEvent e){
        display("Mouse exited", e);}

	public void mouseClicked(MouseEvent e){
        display("Mouse clicked (# of clicks: " + e.getClickCount() + ")", e);}
	
	protected void display(String s, MouseEvent e){
		System.out.println(s+" X="+e.getX()+" Y="+e.getY());
	}
	public void mouseDragged(MouseEvent e){
		display("Mouse dragged", e);}
	
	public void mouseMoved(MouseEvent e) {
        display("Mouse moved", e);}
}

public class frame4 {
	public static void main(String args[]){
		frameTest f = new frameTest();
	}
}
