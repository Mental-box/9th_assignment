package works;

import java.awt.Graphics;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

class Panel2 extends JPanel {
	  BufferedImage img = null;	
	  int img_x = 100, img_y = 100;
	  public Panel2() {
		try{
			img = ImageIO.read(new File("car.gif"));
		}catch (IOException e){
			System.out.println("no image");
			System.exit(1);
		}
		addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e){
				int keycode = e.getKeyCode();
				switch (keycode){
				case KeyEvent.VK_UP:	img_y -= 10;break;
				case KeyEvent.VK_DOWN:	img_y += 10;break;
				case KeyEvent.VK_LEFT:	img_x -= 10;break;
				case KeyEvent.VK_RIGHT:	img_x += 10;break;
				}
				repaint();}
			public void keyReleased(KeyEvent arg0){}
			public void keyTyped(KeyEvent arg0){}
			});
		this.requestFocus(); 	// 이 컴퍼넌트에 입력받도록 함
		setFocusable(true);	// 특정 값을 입력하면 이 컴퍼넌트가 focus됨
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, img_x, img_y, null); 
		}
	}


public class CarGameTest extends JFrame{
	public CarGameTest(){
		setSize(300,300);
		setTitle("Car");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Panel2());
		setVisible(true);
	}
	public static void main(String args[]){
		CarGameTest s = new CarGameTest();
	}
}
