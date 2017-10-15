package works;

import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

class Rectangle {
	int x, y, w, h;
}
class panel6 extends JPanel implements MouseListener {
	Rectangle[] array = new Rectangle[100];
	int index = 0;
	public panel6() {
		this.addMouseListener(this);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Rectangle r : array)
			if (r != null)g.drawRect(r.x, r.y, r.w, r.h);
	}
	public void mousePressed(MouseEvent e) {
		if (index > 100)return;
		array[index] = new Rectangle();
		array[index].x = e.getX();
		array[index].y = e.getY();
		array[index].w = 50;
		array[index].h = 50;
		index++;
		repaint();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}


public class DrawSquare extends JFrame{
	public DrawSquare() {
		setSize(300, 300);
		setTitle("마우스로 사각형 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new panel6());
		setVisible(true);
	}
	public static void main(String[] args) {
		DrawSquare s = new DrawSquare();
	}
}

