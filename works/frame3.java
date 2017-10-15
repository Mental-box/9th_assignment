package works;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.*;

class panel3 extends JPanel implements ActionListener{
	boolean flag=false;
	private int light_num = 0;
	public panel3(){
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if(light_num==0){
			g.setColor(Color.RED);
			g.fillOval(100,100,100,100);
		}else if(light_num==1){
			g.setColor(Color.GREEN);
			g.fillOval(100,200,100,100);
		}else{
			g.setColor(Color.YELLOW);
			g.fillOval(100,300,100,100);
		}
	}
	public void actionPerformed(ActionEvent arg0){
		if(++light_num>=3)light_num=0;
		repaint();
	}
}

public class frame3 extends JFrame{
	public frame3(){
		add(new panel3());
		setSize(300,500);
		setVisible(true);
	}
	public static void main(String args[]){
		new frame3();
	}
}
