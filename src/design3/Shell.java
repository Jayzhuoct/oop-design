package design3;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 炮弹类
 *
 */
public class Shell extends GameObject {	
		double degree;
		public Shell() {
			x = 200;
			y = 200;
			width = 10;
			height = 10;
			speed = 5;
			degree = Math.random() * Math.PI * 2;
		}

		public void draw(Graphics g) {
			Color c = g.getColor();
			g.setColor(Color.pink);
			g.fillOval((int) x, (int) y, width, height);
			// 炮弹沿着任意角度去飞
			if (x<0||x>Constant.GAME_WITDH) {
				degree=Math.PI-degree;
			}
			if (y<0||y>Constant.GAME_HIGHT) {
				degree=Math.PI-degree;
			}
			x += speed * Math.cos(degree);
			y += speed * Math.sin(degree);
			g.setColor(c);
		}		
	}


