import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class  Slide extends ImageIcon{
	int x=600,y=0,sizeX=30,sizeY=500;
	int JellyX=500, JellyY=260;

	int stepX =30;
	int stepY = 10;
	int margin = 40
			;
	int CenX =this.x+this.sizeX/2;
	int CenY =sizeY-20;
	boolean cnt;

	boolean soundmusicOn=true;
	ImageIcon Coin = new ImageIcon("src/Jelly/Coin.png");


	int Score=0;

	int ScoreCntStop=0;
	Jelly jelly= new Jelly(JellyX,JellyY);
	Jelly jelly1 =new Jelly(JellyX,JellyY);
	Jelly jelly2= new Jelly(JellyX,JellyY);
	Jelly jelly3= new Jelly(JellyX,JellyY);
	Jelly jelly4 = new Jelly(JellyX,JellyY);
	Jelly jelly5= new Jelly(JellyX,JellyY);
	Jelly jelly6= new Jelly(JellyX,JellyY);
	Jelly jelly7 = new Jelly(JellyX,JellyY);
	Jelly jelly8= new Jelly(JellyX,JellyY);
	Jelly jelly9= new Jelly(JellyX,JellyY);
	Jelly jelly10= new Jelly(JellyX,JellyY);

	ArrayList<Jelly> jellySlide;
	
	public Slide(String img, int x, int y, int sizeX, int sizeY){
		super(img);
		this.x=x;
		this.y=y;
		this.sizeX=sizeX;
		this.sizeY=sizeY;

		this.CenX =this.x+this.sizeX/2;
		CenY =this.sizeY-20;
		jellySlide=new ArrayList<Jelly>();

		jellySlide.add(jelly);
		jellySlide.add(jelly1);
		jellySlide.add(jelly2);
		jellySlide.add(jelly3);
		jellySlide.add(jelly4);
		jellySlide.add(jelly5);
		jellySlide.add(jelly6);
		jellySlide.add(jelly7);
		jellySlide.add(jelly8);
		jellySlide.add(jelly9);
		jellySlide.add(jelly10);
	}
	
	public boolean drawsldie(Graphics2D g2d, int CollidX, int CollidY){
		g2d.drawImage(this.getImage(),x, y, sizeX,sizeY, null);
		
		for(Jelly s: jellySlide){
			if(s.collide(CollidX, CollidY))
				if(s.cnt2){ 
					Score+=100;
					s.cnt2=false;
				}
			s.Draw(g2d);
		}

		return this.collide(CollidX, CollidY);

	}
	public int getScore(){
		return Score;
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
		CenX =this.x+sizeX/2;
		jellyReset();
		for(Jelly s: jellySlide)
			s.reset();
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;

		CenY =sizeY-20;

	}
	public void go(int x){ 
		
			this.x-=x;

			CenX =this.x+sizeX/2;
			CenY =sizeY-20;
		
		for(Jelly s: jellySlide){
			s.go(x);
		}

	}
	public void reset(){

		x=600;y=0;sizeX=30;sizeY=500;
		JellyX=500; JellyY=260;
		Score=0;
		jellyReset();
		for(Jelly s: jellySlide){
			s.reset();
		}

	}

	public boolean collide (int px, int py) {
		Point what = new Point(px,py);
		Point p = new Point(this.CenX, this.CenY);
		if (p.distance(what) <= margin) {
			return true;
		}
		else	
			return false;
	}
	public void jellyReset(){

		jellySlide.get(0).setX(x-5*stepX);
		jellySlide.get(1).setX(x-4*stepX);
		jellySlide.get(2).setX(x-3*stepX);
		jellySlide.get(3).setX(x-2*stepX);
		jellySlide.get(4).setX(x-stepX);
		jellySlide.get(5).setX(x);
		jellySlide.get(6).setX(x+stepX);
		jellySlide.get(7).setX(x+2*stepX);
		jellySlide.get(8).setX(x+3*stepX);
		jellySlide.get(9).setX(x+4*stepX);
		jellySlide.get(10).setX(x+5*stepX);
	}

	public void setMusicGo(){
		for(Jelly s: jellySlide)
			s.soundmusicOn=true;
	}
	public void setMusicStop(){
		for(Jelly s: jellySlide)
			s.soundmusicOn=false;
	}
}


