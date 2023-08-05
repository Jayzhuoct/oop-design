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
	int num1,num2;//��������
	char oper;//������
	boolean isNum;//�������ֱ�־λ
	
	JTextField dispArea = new JTextField("0");
	JPanel buttonArea = new JPanel();
	JButton[] buttons = new JButton[16];

	public Calculator() {
		setSize(300, 300);
		setTitle("������");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//���д���
		setResizable(false);
		Container pane = this.getContentPane();
		pane.setLayout(new BorderLayout());//�����ര��
		dispArea.setFont(new Font("����", Font.PLAIN, 24));
		dispArea.setEditable(false);//����ѡ�����
		dispArea.setPreferredSize(new Dimension(this.getWidth(), 50));//���ð�ť������
		dispArea.setHorizontalAlignment(JTextField.RIGHT);
		dispArea.setFocusable(true);
		pane.add(dispArea, BorderLayout.NORTH);
		pane.add(buttonArea, BorderLayout.CENTER);
		buttonArea.setLayout(new GridLayout(4, 4, 8, 8));//���ò��ָ�ʽ
		String[] txts = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "��", "=", "/" };
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(txts[i]);
			buttons[i].setFont(new Font("����", Font.BOLD, 18));
			buttonArea.add(buttons[i]);
		}
		
		buttons[0].addActionListener(new MyNumLis());//���ּ�����ע��
		buttons[1].addActionListener(new MyNumLis());
		buttons[2].addActionListener(new MyNumLis());
		buttons[4].addActionListener(new MyNumLis());
		buttons[5].addActionListener(new MyNumLis());
		buttons[6].addActionListener(new MyNumLis());
		buttons[8].addActionListener(new MyNumLis());
		buttons[9].addActionListener(new MyNumLis());
		buttons[10].addActionListener(new MyNumLis());
		buttons[12].addActionListener(new MyNumLis());
	
		
//���ż�����ע��
		buttons[14].addActionListener(new MyEqual());//=
		buttons[13].addActionListener(new MyBack());// ��
		buttons[3].addActionListener(new  MyOperator());//+
		buttons[7].addActionListener(new  MyOperator());//-
		buttons[11].addActionListener(new MyOperator());//*
		buttons[15].addActionListener(new MyOperator());// /
	}

//����
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

//����
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

//�����
	class MyOperator implements ActionListener{
		public void actionPerformed(ActionEvent e){
			num1=Integer.parseInt(dispArea.getText());
			oper=e.getActionCommand().charAt(0);
			isNum=false;
		}
	}

//�˸�
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
