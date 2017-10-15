package works;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;

class MyButton2 extends JButton{
	static int count =0;
	int i;
	public MyButton2(String s){
		super(s);
		i=count++;
	}
}
public class puzzle2 extends JFrame implements ActionListener{
	MyButton[] buttons;
	MyButton reset;
	JTextField t;
	JPanel p;
	public puzzle2(){
		super("puzzle");
		t = new JTextField(20);
		add(t,BorderLayout.NORTH);
		p = new JPanel();
		p.setLayout(new GridLayout(0,3,2,2));
		buttons=new MyButton[9];
		for(int i=0;i<8;i++)buttons[i]=new MyButton(""+(i+1));
		buttons[8]=new MyButton(" ");
		for(int i=0;i<9;i++)p.add(buttons[i]);
		for(int i=0;i<9;i++)buttons[i].addActionListener(this);
		
		add(p,BorderLayout.CENTER);
		reset=new MyButton("reset");
		reset.addActionListener(e->{
			t.setText("");
			for(int i=0;i<8;i++)buttons[i].setText(""+(i+1));
			buttons[8].setText(" ");
		});
		reset.setBackground(Color.red);
		reset.setForeground(Color.YELLOW);
		add(reset,BorderLayout.SOUTH);
		
		pack();
		//reset.addActionListener(this);
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		String actionCommand = e.getActionCommand();
		t.setText(t.getText()+actionCommand);
		
		MyButton b = (MyButton)e.getSource();
		if(b.getText().equals(" ")==true)return;
		if(b.i==0){
			if(buttons[1].getText().equals(" "))
			{buttons[1].setText(b.getText()); b.setText(" ");}
			if(buttons[3].getText().equals(" "))
			{buttons[3].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==1){
			if(buttons[0].getText().equals(" "))
			{buttons[0].setText(b.getText()); b.setText(" ");}
			if(buttons[2].getText().equals(" "))
			{buttons[2].setText(b.getText()); b.setText(" ");}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==2){
			if(buttons[1].getText().equals(" ")){
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" "))
			{buttons[5].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==3){
			if(buttons[0].getText().equals(" ")){
				buttons[0].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(b.getText()); b.setText(" ");}
			if(buttons[6].getText().equals(" "))
			{buttons[6].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==4){
			if(buttons[1].getText().equals(" ")){
				buttons[1].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[3].getText().equals(" "))
			{buttons[3].setText(b.getText()); b.setText(" ");}
			if(buttons[5].getText().equals(" "))
			{buttons[5].setText(b.getText()); b.setText(" ");}
			if(buttons[7].getText().equals(" "))
			{buttons[7].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==5){
			if(buttons[2].getText().equals(" ")){
				buttons[2].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(b.getText()); b.setText(" ");}
			if(buttons[8].getText().equals(" "))
			{buttons[8].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==6){
			if(buttons[7].getText().equals(" "))
			{buttons[7].setText(b.getText()); b.setText(" ");}
			if(buttons[3].getText().equals(" "))
			{buttons[3].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==7){
			if(buttons[6].getText().equals(" "))
			{buttons[6].setText(b.getText()); b.setText(" ");}
			if(buttons[8].getText().equals(" "))
			{buttons[8].setText(b.getText()); b.setText(" ");}
			if(buttons[4].getText().equals(" "))
			{buttons[4].setText(b.getText()); b.setText(" ");}
		}
		if(b.i==8){
			if(buttons[7].getText().equals(" ")){
				buttons[7].setText(b.getText());
				b.setText(" ");
			}
			if(buttons[5].getText().equals(" "))
			{buttons[5].setText(b.getText()); b.setText(" ");}
		}
	}
	public static void main(String args[]){
		new puzzle2();
	}
}

