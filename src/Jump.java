import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class  Jump extends ImageIcon{
	int del=0; 
	int delcnt=7;
	int x=600,y=0,sizeX=45,sizeY=50;
	int Score=0;
	int stepX =38;
	int stepY = 10;
	int margin = 65 ;
	int initX,initY;
	boolean soundmusicOn=true;
	int CenX =this.x+this.sizeX/2;
	int CenY =this.y+this.sizeY/2;

	ImageIcon Coin = new ImageIcon("src/Jelly/Coin.png"); 

	Jelly jelly= new Jelly();
	Jelly jelly1 = new Jelly();
	Jelly jelly2= new Jelly();
	Jelly jelly3=  new Jelly();

	Jelly jelly4 = new Jelly();
	Jelly jelly5= new Jelly();
	Jelly jelly6=  new Jelly();
	Jelly jelly7= new Jelly();
	
	Jelly jelly8=  new Jelly();
	Jelly jelly9= new Jelly();
	Jelly jelly10=  new Jelly();
	ArrayList<Jelly> jellyJump;

	public void resetcnt(){
		for(Jelly s: jellyJump){
			s.cnt2=false;
		}
	}

	public Jump(String img, int x, int y, int sizeX, int sizeY){
		super(img);

		this.x=x;
		this.y=y;
		this.initX=x;
		this.initY=y;
		this.sizeX=sizeX;
		this.sizeY=sizeY;

		this.CenX =this.x+this.sizeX/2;
		this.CenY =this.y+this.sizeY/2;	

		jellyJump=new ArrayList<Jelly>();
		jellyJump.add(jelly);
		jellyJump.add(jelly1);
		jellyJump.add(jelly2);
		jellyJump.add(jelly3);
		jellyJump.add(jelly4);
		jellyJump.add(jelly5);
		jellyJump.add(jelly6);
		jellyJump.add(jelly7);
		jellyJump.add(jelly8);
		jellyJump.add(jelly9);
		Jellyreset();

	}

	public boolean drawjump(Graphics2D g2d, int CollidX, int CollidY){ 
		g2d.drawImage(this.getImage(),x, y, sizeX,sizeY, null);
		
		for(Jelly s: jellyJump){
			if(s.collide(CollidX, CollidY))
				if(s.cnt2){
					Score+=100;
					s.cnt2=false;
				}
			s.Draw(g2d);
		}
		return this.collide(CollidX, CollidY);
	}

	public void reset() {
		x = initX; y= initY;

		Jellyreset();	
	}

	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;

		CenX =x+sizeX/2;

		Jellyreset();
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;

		CenY =y+sizeY/2;
	}

	public void go(int x){
		this.x-=x;
		this.CenX =this.x+sizeX/2;
		this.CenY =y+sizeY/2;	

		for(Jelly s: jellyJump){
			s.go(x);


		}

	}

	public int getScore(){
		return Score;
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
	public void Jellyreset(){
		for(Jelly s: jellyJump){
			s.reset();
		}
		jellyJump.get(0).setX(x-3*stepX);
		jellyJump.get(1).setX(x-2*stepX);
		jellyJump.get(1).setY(y-26);
		jellyJump.get(2).setX(x-stepX);
		jellyJump.get(2).setY(y-52);
		jellyJump.get(3).setX(x);
		jellyJump.get(3).setY(y-78);
		jellyJump.get(4).setX(x+stepX);
		jellyJump.get(4).setY(y-52);
		jellyJump.get(5).setX(x+2*stepX);
		jellyJump.get(5).setY(y-26);
		jellyJump.get(6).setX(x+3*stepX);
		jellyJump.get(6).setY(y);
		jellyJump.get(7).setX(x+4*stepX);
		jellyJump.get(8).setX(x+5*stepX);
		jellyJump.get(9).setX(x+6*stepX);

	}
	public void setMusicGo(){
		for(Jelly s: jellyJump)
			s.soundmusicOn=true;
	}
	public void setMusicStop(){
		for(Jelly s: jellyJump)
			s.soundmusicOn=false;
	}
}





