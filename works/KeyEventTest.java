package works;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class KeyEventTest extends JFrame implements KeyListener{
	private JPanel p;
	private JTextField f;
	private JTextArea area;
	public KeyEventTest() {
		p = new JPanel(new GridLayout(0,2));
		p.add(new JLabel("문자를 입력하세요: "));
		f=new JTextField(10);
		p.add(f);
		area = new JTextArea(3,30);
		add(p,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		f.addKeyListener(this);
		setTitle("KeyEvent Test");
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String args[]){
		new KeyEventTest();
	}
	public void keyTyped(KeyEvent e){
		display(e,"Key Typed");
	}
	public void keyPressed(KeyEvent e){
		display(e,"Key Pressed");
	}
	public void keyReleased(KeyEvent e){
		display(e,"Key Released");
	}
	protected void display(KeyEvent e,String s){
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		String modifiers = "Alt: "+e.isAltDown()+"Ctrl: "+e.isControlDown()
							+"Shift: "+e.isShiftDown();
		area.append(" "+ s+"문자 " + c + "코드: "+keyCode+") "+modifiers+"\n");
	}
}
