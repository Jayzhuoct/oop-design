package design3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JFrame;

public class MyGameFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Image planeImg=GameUtil.getImage("images/plane.png");
	Image bg=GameUtil.getImage("images/bg.jpg");
	Plane plane=new Plane(planeImg,250,250);
	Shell[] shells=new Shell[50];
	Explode bao;
	Date startTime=new Date();
	Date endTime;
	int period;	
	int planex = 250,planey = 250;
	@Override
	public void paint(Graphics g) {//自动被调用，g相当于一支画笔
		Color c=g.getColor();		
		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		for(int i=0;i<shells.length;i++) {
			shells[i].draw(g);
			//飞机和炮弹碰撞测试！！
			boolean peng=shells[i].getRect().intersects(plane.getRect());
			
			if (peng) {
				plane.live=false;
				if(bao ==  null) {
					bao = new Explode(plane.x, plane.y);					
					endTime = new Date();
					period=(int)((endTime.getTime()-startTime.getTime())/1000);
				}
				bao.draw(g);
			}
			if (!plane.live) {
				g.setColor(Color.red);
				g.setFont(new Font("宋体",Font.BOLD,18));
				g.drawString("游戏时间：" + period + "秒",300,400);
				g.setColor(c);
				 
			}		
		}
		
	}
	//帮助我们反复的画窗口
	class PaintThread extends Thread{
		@Override
		public void run() {
			while (true) {
				repaint();//重画
				try {
					Thread.sleep(40);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	/**
	 * 定义键盘监听内部类
	 */
	class KeyMonitor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
	}
	/**
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("第九组作品");
		this.setVisible(true);
		this.setSize(Constant.GAME_WITDH, Constant.GAME_HIGHT);
		this.setLocation(300, 300);		
		this.addWindowFocusListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new PaintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMonitor());//给窗口增加键盘的监听
		//初始化50个炮弹
		for(int i=0;i<shells.length;i++) {
			shells[i]=new Shell();
		}
		
	}

	public static void main(String[] args) {
		MyGameFrame f=new MyGameFrame();
		f.launchFrame();
		
	}
}
