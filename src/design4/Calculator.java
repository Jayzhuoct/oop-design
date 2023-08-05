package design4;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	int num1,num2;//输入数据
	char oper;//操作符
	boolean isNum;//代表数字标志位
	
	JTextField dispArea = new JTextField("0");
	JPanel buttonArea = new JPanel();
	JButton[] buttons = new JButton[16];

	public Calculator() {
		setSize(300, 300);
		setTitle("计算器");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//居中窗口
		setResizable(false);
		Container pane = this.getContentPane();
		pane.setLayout(new BorderLayout());//分五类窗口
		dispArea.setFont(new Font("宋体", Font.PLAIN, 24));
		dispArea.setEditable(false);//设置选项不可用
		dispArea.setPreferredSize(new Dimension(this.getWidth(), 50));//设置按钮不可用
		dispArea.setHorizontalAlignment(JTextField.RIGHT);
		dispArea.setFocusable(true);
		pane.add(dispArea, BorderLayout.NORTH);
		pane.add(buttonArea, BorderLayout.CENTER);
		buttonArea.setLayout(new GridLayout(4, 4, 8, 8));//设置布局格式
		String[] txts = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "←", "=", "/" };
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(txts[i]);
			buttons[i].setFont(new Font("宋体", Font.BOLD, 18));
			buttonArea.add(buttons[i]);
		}
		
		buttons[0].addActionListener(new MyNumLis());//数字监听器注册
		buttons[1].addActionListener(new MyNumLis());
		buttons[2].addActionListener(new MyNumLis());
		buttons[4].addActionListener(new MyNumLis());
		buttons[5].addActionListener(new MyNumLis());
		buttons[6].addActionListener(new MyNumLis());
		buttons[8].addActionListener(new MyNumLis());
		buttons[9].addActionListener(new MyNumLis());
		buttons[10].addActionListener(new MyNumLis());
		buttons[12].addActionListener(new MyNumLis());
	
		
//符号监听器注册
		buttons[14].addActionListener(new MyEqual());//=
		buttons[13].addActionListener(new MyBack());// ←
		buttons[3].addActionListener(new  MyOperator());//+
		buttons[7].addActionListener(new  MyOperator());//-
		buttons[11].addActionListener(new MyOperator());//*
		buttons[15].addActionListener(new MyOperator());// /
	}

//数字
	class MyNumLis implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			String t=e.getActionCommand();
			String s=dispArea.getText();
			if(isNum==false)
				dispArea.setText(t);
			else 
				dispArea.setText(s+t);
			isNum=true;
		}
	}

//等于
	class MyEqual implements ActionListener{
		public void actionPerformed(ActionEvent e){
			double result=0;
			isNum=false;
			num2=Integer.parseInt(dispArea.getText());
			switch(oper){
				case '+':result=num1+num2;break;
				case '-':result=num1-num2;break;
				case '*':result=num1*num2;break;
				case '/':result=num1/num2;break;
			}
			dispArea.setText(result+"");
		}
	}

//运算符
	class MyOperator implements ActionListener{
		public void actionPerformed(ActionEvent e){
			num1=Integer.parseInt(dispArea.getText());
			oper=e.getActionCommand().charAt(0);
			isNum=false;
		}
	}

//退格
	class MyBack implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {			
			String sc = dispArea.getText();
			if (sc == "") {
			}else {
				sc = sc.substring(0, sc.length()-1);
			}
			dispArea.setText(sc);
	}
}
	
	
	public static void main(String[] args) {
		new Calculator();
	}
}
