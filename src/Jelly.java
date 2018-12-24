import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.*;

public class Jelly extends ImageIcon {
	int x = 800;
	int y = 240;
	boolean cnt1 = true, cnt2 = false, cnt3 = false, cnt4 = false;
	int gomSizeX = 31;
	int gomSizeY = 28;
	int stepX = 30;
	int stepY = 10;

	int margin = 35;
	int initX, initY;

	int CenX = x + gomSizeX / 2;
	int CenY = y + gomSizeY / 2;

	SoundPlayer jelly = new SoundPlayer("jelly1.wav");

	boolean soundmusicOn = true;

	public Jelly() {

	}

	public Jelly(int x, int y) {

		this.initX = x;
		this.initY = y;
		this.x = x;
		this.y = y;
		CenX = x + gomSizeX / 2;
		CenY = y + gomSizeY / 2;
	}

	ImageIcon Gom = new ImageIcon("src/Jelly/Gom_Jelly2.png");

	ImageIcon resetGom = new ImageIcon("src/Jelly/Gom_Jelly2.png");

	ImageIcon Coin = new ImageIcon("src/Jelly/Coin.png");

	ImageIcon Effect = new ImageIcon("src/Jelly/Gom_jelly4.png");

	ImageIcon Effect2 = new ImageIcon("src/Jelly/afterGom.gif");

	public int getX() {
		return x;
	}

	public void setX(int x) {

		this.x = x;
		CenX = x + gomSizeX / 2;

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		CenY = y + gomSizeY / 2;
	}

	// g2d.drawImage(Gom.getImage(), 200, 250, 36, 35,null);//0.7 gomSizeX, gomSizeY

	public boolean collide(int px, int py) {

		Point what = new Point(px, py);
		Point p = new Point(this.CenX, this.CenY);
		if (p.distance(what) <= margin) {
			Gom.setImage(Effect2.getImage());
			if (soundmusicOn)
				jelly.startPlay();
			if (cnt1) {
				cnt2 = true;
				cnt1 = false;

			}

			return true;

		} else
			return false;
	}

	public void Draw(Graphics2D g2d) {
		g2d.drawImage(Gom.getImage(), x, y, gomSizeX, gomSizeY, null);
	}

	public void go(int Px) {
		if (x > -100) {
			x -= Px;
			CenX -= Px;
		}

	}

	public void move(int Px) {

		if (x > -100) {
			x -= Px;
			CenX -= Px;
		}
	}

	public void move(int Px, int Py) {
		x -= Px;
		y -= Py;
		CenX -= Px;
		CenY -= Py;
	}

	public void reset() {
		Gom.setImage(resetGom.getImage());
		cnt1 = true;
		cnt2 = false;
	}

	public void jellyMusicGo() {
		soundmusicOn = true;
	}

	public void jellyMusicStop() {
		soundmusicOn = false;
	}

}
