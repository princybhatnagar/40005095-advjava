package com.assignment.calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Program extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame=new Frame("calculator");
		frame.setSize(300,300);
		//frame.setLayout(new BorderLayout());
	  
		/*
		 * Button exit=new Button("EXIT"); frame.add(exit,BorderLayout.NORTH);
		 */
		
		TextField tf=new TextField();
		Panel p3=new Panel();
		p3.add(tf,BorderLayout.NORTH);
		
		Button one=new Button("1");
		Button two=new Button("2");
		Button three=new Button("3");
		Button four=new Button("4");
		Button five=new Button("5");
		Button six=new Button("6");
		Button seven=new Button("7");
		Button eight=new Button("8");
		Button nine=new Button("9");
		Button zero=new Button("0");
		Button dot=new Button(".");
		Button oper=new Button("+/-");
		
		
		Button div=new Button("/");
		Button mul=new Button("*");
		Button add=new Button("+");
		Button sub=new Button("-");
		Button equal=new Button("=");
		
		Panel p2=new Panel();
		p2.setLayout(new GridLayout(3,3));
		p2.add(one);
		p2.add(two);
		p2.add(three);
		p2.add(four);
		p2.add(five);
		p2.add(six);
		p2.add(seven);
		p2.add(eight);
		p2.add(nine);
		
		Panel p1=new Panel();
		p1.setLayout(new GridLayout(5,1));
		p1.add(div);
		p1.add(mul);
		p1.add(add);
		p1.add(sub);
		p1.add(equal);
		
		frame.add(p1,BorderLayout.EAST);
		frame.add(p2,BorderLayout.WEST);
		frame.add(p3);
		frame.setVisible(true);

	}

}
