package works;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

class frame2 extends JFrame{
	private JButton b1;
	private JButton b2;
	private JPanel p;
	MyListener2 l = new MyListener2();
	
	public frame2(){
		this.setSize(300,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이번트 예제");
		p = new JPanel();
		b1=new JButton("노란색");
		b1.addActionListener(l);
		p.add(b1);
		b2=new JButton("핑크색");
		b2.addActionListener(l);
		p.add(b2);
		this.add(p);
		this.setVisible(true);
	}
	private class MyListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
               if (e.getSource() == b1) {
                      p.setBackground(Color.YELLOW);
               } else if (e.getSource() == b2) {
                      p.setBackground(Color.PINK);
               }
        }

  }
}

public class ChangeBackground {
	public static void main(String args[]){
		frame2 t = new frame2();
	}
}
