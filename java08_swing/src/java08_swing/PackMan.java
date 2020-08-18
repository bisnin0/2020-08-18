package java08_swing;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame {

	MyCanvas mc = new MyCanvas();
	MyAdapter ma = new MyAdapter();
	int x=170,y=150,w=220,h=200;
	Image img;
	int pw;
	int ph;
	int imgw;
	int imgh;
	int a=0, b=1;
	String k="";
	public PackMan() {
		add(mc);
		
		mc.repaint();
		
		
		
		
		
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		////////////////에버노트에서 vk 검색
		//https://diyall.tistory.com/595
		//http://hamster.school/ko/tutorial/java/keyboard.jsp
		//https://blog.naver.com/im186cm/221785150877
		//https://github.com/YangChoi/JavaREMIND/blob/master/pacman/PacMan.java
		mc.addKeyListener(ma);
//		System.out.println(k);
//		if(k=="W") {
			System.out.println(2);
			while(true) { //이걸 이벤트에넣고 이프문
				
				x-=10;
				w-=10;
				mc.repaint();
				
				if(a==0) {
					a++; b++;
				}else if(a==1) {
					a--; b--;
				}
				if(w==0) {
					x+=400; w+=400;
				}
				try {
					Thread.sleep(250);
				}catch(Exception e) {
					
				}
						
			}
//		}
	}
	
	public void test() {
while(true) { //이걸 이벤트에넣고 이프문
			
			x-=10;
			w-=10;
			mc.repaint();
			
			if(a==0) {
				a++; b++;
			}else if(a==1) {
				a--; b--;
			}

			if(w==0) {
				x+=400; w+=400;
			}
 
			try {
				Thread.sleep(250);
			}catch(Exception e) {
				
			}
					
		}
	}
	/////너무길어져서 나눠야함.
//	if(a==2) {
//	a++; b++;
//}else if(a==3) {
//	a--; b--;
//}else if(a==4) {
//	a++; b++;
//}else if(a==5) {
//	a--; b--;
//}else if(a==6) {
//	a++; b++;
//}
	class MyAdapter extends KeyAdapter{
		public void keyPressed(KeyEvent ke) {
			int key = ke.getKeyCode();
			k=ke.getKeyText(key);
			System.out.println(k);
//			
//			
			if("W".equals(ke.getKeyText(key))) {
				
				
			}
		}
	} 
	

	public class MyCanvas extends Canvas{
		MyCanvas(){
			img = Toolkit.getDefaultToolkit().getImage("img/packman.jpg");
		}
		
		public void paint(Graphics g) {
			pw = img.getWidth(this);
			ph = img.getHeight(this);
			imgw = pw/8;
			imgh = ph/10;
			
			g.drawImage(img, 1, 1, this);
		
			

//			g.drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer)
//			g.drawImage(img, 100, 10, 50, 50, imgw, imgh, imgw*2, imgh*8, this);//오른쪽으로돔
//			g.drawImage(img, 50, 50, 100, 100, imgw, imgh/3, imgw*2, imgh*10, this);//오른쪽으로돔
//			g.drawImage(img, 100, 100, 150, 150, imgw*2, imgh/3, imgw*3, imgh*10, this);
//			g.drawImage(img, 150, 150, 200, 200, imgw*3, imgh/3, imgw*4, imgh*10, this);
	
			///////기본 베이스
			g.drawImage(img, x, y, w, h, imgw*a, imgh/3, imgw*b, imgh*10, this);
//			g.drawImage(img, x, y, w, h, imgw, imgh/3, imgw*2, imgh*10, this);
			
		}
	}
	public static void main(String[] args) {
		new PackMan();
	}

}
