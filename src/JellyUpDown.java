import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.*;

public class JellyUpDown extends Jelly {
	int x = 800;
	int y = 240;
	boolean cnt1 = true, cnt2 = false;
	int gomSizeX = 31;
	int gomSizeY = 28;
	int stepX = 30;
	int stepY = 10;
	int Score = 0;
	int margin = 35;
	int initX, initY;

	boolean soundmusicOn = true;

	int CenX = x + gomSizeX / 2;
	int CenY = y + gomSizeY / 2;

	Jelly jelly0 = new Jelly();
	Jelly jelly1 = new Jelly();
	Jelly jelly2 = new Jelly();
	Jelly jelly3 = new Jelly();
	Jelly jelly4 = new Jelly();
	Jelly jelly5 = new Jelly();
	Jelly jelly6 = new Jelly();
	Jelly jelly7 = new Jelly();
	Jelly jelly8 = new Jelly();
	Jelly jelly9 = new Jelly();
	Jelly jelly10 = new Jelly();

	Jelly jelly11 = new Jelly();
	Jelly jelly12 = new Jelly();
	Jelly jelly13 = new Jelly();
	Jelly jelly14 = new Jelly();
	Jelly jelly15 = new Jelly();
	Jelly jelly16 = new Jelly();
	Jelly jelly17 = new Jelly();
	Jelly jelly18 = new Jelly();
	Jelly jelly19 = new Jelly();
	Jelly jelly20 = new Jelly();
	Jelly jelly21 = new Jelly();

	Jelly jelly22 = new Jelly();
	Jelly jelly23 = new Jelly();
	Jelly jelly24 = new Jelly();
	Jelly jelly25 = new Jelly();
	Jelly jelly26 = new Jelly();
	Jelly jelly27 = new Jelly();
	Jelly jelly28 = new Jelly();
	Jelly jelly29 = new Jelly();
	Jelly jelly30 = new Jelly();
	Jelly jelly31 = new Jelly();
	Jelly jelly32 = new Jelly();

	Jelly jelly33 = new Jelly();
	Jelly jelly34 = new Jelly();
	Jelly jelly35 = new Jelly();
	Jelly jelly36 = new Jelly();
	Jelly jelly37 = new Jelly();
	Jelly jelly38 = new Jelly();
	Jelly jelly39 = new Jelly();
	Jelly jelly40 = new Jelly();
	Jelly jelly41 = new Jelly();
	Jelly jelly42 = new Jelly();
	Jelly jelly43 = new Jelly();

	public JellyUpDown() {
		jellyupDown.add(jelly0);
		jellyupDown.add(jelly1);
		jellyupDown.add(jelly2);
		jellyupDown.add(jelly3);
		jellyupDown.add(jelly4);
		jellyupDown.add(jelly5);
		jellyupDown.add(jelly6);
		jellyupDown.add(jelly7);
		jellyupDown.add(jelly8);
		jellyupDown.add(jelly9);
		jellyupDown.add(jelly10);

		jellyupDown.add(jelly11);
		jellyupDown.add(jelly12);
		jellyupDown.add(jelly13);
		jellyupDown.add(jelly14);
		jellyupDown.add(jelly15);
		jellyupDown.add(jelly16);
		jellyupDown.add(jelly17);
		jellyupDown.add(jelly18);
		jellyupDown.add(jelly19);
		jellyupDown.add(jelly20);
		jellyupDown.add(jelly21);

		jellyupDown.add(jelly22);
		jellyupDown.add(jelly23);
		jellyupDown.add(jelly24);
		jellyupDown.add(jelly25);
		jellyupDown.add(jelly26);
		jellyupDown.add(jelly27);
		jellyupDown.add(jelly28);
		jellyupDown.add(jelly29);
		jellyupDown.add(jelly30);
		jellyupDown.add(jelly31);
		jellyupDown.add(jelly32);

		jellyupDown.add(jelly33);
		jellyupDown.add(jelly34);
		jellyupDown.add(jelly35);
		jellyupDown.add(jelly36);
		jellyupDown.add(jelly37);
		jellyupDown.add(jelly38);
		jellyupDown.add(jelly39);
		jellyupDown.add(jelly40);
		jellyupDown.add(jelly41);
		jellyupDown.add(jelly42);
		jellyupDown.add(jelly43);

		/*
		 * jellyupDown.add(jelly22); jellyupDown.add(jelly23);
		 */
		Jellyreset();
	}

	ImageIcon Gom = new ImageIcon("src/Jelly/Gom_Jelly2.png");

	ImageIcon resetGom = new ImageIcon("src/Jelly/Gom_Jelly2.png");

	ImageIcon Effect = new ImageIcon("src/Jelly/Gom_jelly4.png");

	public int getX() {
		return x;
	}

	public void setX(int x) {

		this.x = x;
		CenX = x + gomSizeX / 2;

		Jellyreset();

	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
		CenY = y + gomSizeY / 2;

	}

	public void drawupdown(Graphics2D g2d, int CollidX, int CollidY) {
		for (Jelly s : jellyupDown) {
			if (s.collide(CollidX, CollidY))
				if (s.cnt2) {
					Score += 100;
					s.cnt2 = false;
				}
			s.Draw(g2d);
		}
		this.collide(CollidX, CollidY);
	}

	public void drawGomHorizon5(Graphics2D g2d) {
		g2d.drawImage(Gom.getImage(), x, y, gomSizeX, gomSizeY, null);
		g2d.drawImage(Gom.getImage(), x + stepX, y, gomSizeX, gomSizeY, null);
		g2d.drawImage(Gom.getImage(), x + 2 * stepX, y, gomSizeX, gomSizeY, null);
		g2d.drawImage(Gom.getImage(), x + 3 * stepX, y, gomSizeX, gomSizeY, null);
		g2d.drawImage(Gom.getImage(), x + 4 * stepX, y, gomSizeX, gomSizeY, null);
	}

	ArrayList<Jelly> jellyupDown = new ArrayList<Jelly>();

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public void go(int x) {
		this.x -= x;
		CenX -= x;
		for (Jelly s : jellyupDown) {
			s.go(x);
		}
	}

	public void Jellyreset() {
		for (Jelly s : jellyupDown) {
			s.reset();
		}
		jellyupDown.get(0).setX(x - 5 * stepX);
		jellyupDown.get(1).setX(x - 4 * stepX);
		jellyupDown.get(2).setX(x - 3 * stepX);
		jellyupDown.get(3).setX(x - 2 * stepX);
		jellyupDown.get(4).setX(x - stepX);
		jellyupDown.get(5).setX(x);
		jellyupDown.get(6).setX(x + stepX);
		jellyupDown.get(7).setX(x + 2 * stepX);
		jellyupDown.get(8).setX(x + 3 * stepX);
		jellyupDown.get(9).setX(x + 4 * stepX);
		jellyupDown.get(10).setX(x + 5 * stepX);

		jellyupDown.get(11).setX(x - 5 * stepX);
		jellyupDown.get(12).setX(x - 4 * stepX);
		jellyupDown.get(13).setX(x - 3 * stepX);
		jellyupDown.get(14).setX(x - 2 * stepX);
		jellyupDown.get(15).setX(x - 1 * stepX);
		jellyupDown.get(16).setX(x);
		jellyupDown.get(17).setX(x + 1 * stepX);
		jellyupDown.get(18).setX(x + 2 * stepX);
		jellyupDown.get(19).setX(x + 3 * stepX);
		jellyupDown.get(20).setX(x + 4 * stepX);
		jellyupDown.get(21).setX(x + 5 * stepX);

		jellyupDown.get(22).setX(x - 5 * stepX);
		jellyupDown.get(23).setX(x - 4 * stepX);
		jellyupDown.get(24).setX(x - 3 * stepX);
		jellyupDown.get(25).setX(x - 2 * stepX);
		jellyupDown.get(26).setX(x - 1 * stepX);
		jellyupDown.get(27).setX(x);
		jellyupDown.get(28).setX(x + 1 * stepX);
		jellyupDown.get(29).setX(x + 2 * stepX);
		jellyupDown.get(30).setX(x + 3 * stepX);
		jellyupDown.get(31).setX(x + 4 * stepX);
		jellyupDown.get(32).setX(x + 5 * stepX);

		jellyupDown.get(33).setX(x - 5 * stepX);
		jellyupDown.get(34).setX(x - 4 * stepX);
		jellyupDown.get(35).setX(x - 3 * stepX);
		jellyupDown.get(36).setX(x - 2 * stepX);
		jellyupDown.get(37).setX(x - 1 * stepX);
		jellyupDown.get(38).setX(x);
		jellyupDown.get(39).setX(x + 1 * stepX);
		jellyupDown.get(40).setX(x + 2 * stepX);
		jellyupDown.get(41).setX(x + 3 * stepX);
		jellyupDown.get(42).setX(x + 4 * stepX);
		jellyupDown.get(43).setX(x + 5 * stepX);

		jellyupDown.get(0).setY(y);
		jellyupDown.get(1).setY(y);
		jellyupDown.get(2).setY(y);
		jellyupDown.get(3).setY(y);
		jellyupDown.get(4).setY(y);
		jellyupDown.get(5).setY(y);
		jellyupDown.get(6).setY(y);
		jellyupDown.get(7).setY(y);
		jellyupDown.get(8).setY(y);
		jellyupDown.get(9).setY(y);
		jellyupDown.get(10).setY(y);

		jellyupDown.get(11).setY(y - 2 * stepY);
		jellyupDown.get(12).setY(y - 2 * stepY);
		jellyupDown.get(13).setY(y - 2 * stepY);
		jellyupDown.get(14).setY(y - 2 * stepY);
		jellyupDown.get(15).setY(y - 2 * stepY);
		jellyupDown.get(16).setY(y - 2 * stepY);
		jellyupDown.get(17).setY(y - 2 * stepY);
		jellyupDown.get(18).setY(y - 2 * stepY);
		jellyupDown.get(19).setY(y - 2 * stepY);
		jellyupDown.get(20).setY(y - 2 * stepY);
		jellyupDown.get(21).setY(y - 2 * stepY);

		jellyupDown.get(22).setY(y - 4 * stepY);
		jellyupDown.get(23).setY(y - 4 * stepY);
		jellyupDown.get(24).setY(y - 4 * stepY);
		jellyupDown.get(25).setY(y - 4 * stepY);
		jellyupDown.get(26).setY(y - 4 * stepY);
		jellyupDown.get(27).setY(y - 4 * stepY);
		jellyupDown.get(28).setY(y - 4 * stepY);
		jellyupDown.get(29).setY(y - 4 * stepY);
		jellyupDown.get(30).setY(y - 4 * stepY);
		jellyupDown.get(31).setY(y - 4 * stepY);
		jellyupDown.get(32).setY(y - 4 * stepY);

		jellyupDown.get(33).setY(y - 6 * stepY);
		jellyupDown.get(34).setY(y - 6 * stepY);
		jellyupDown.get(35).setY(y - 6 * stepY);
		jellyupDown.get(36).setY(y - 6 * stepY);
		jellyupDown.get(37).setY(y - 6 * stepY);
		jellyupDown.get(38).setY(y - 6 * stepY);
		jellyupDown.get(39).setY(y - 6 * stepY);
		jellyupDown.get(40).setY(y - 6 * stepY);
		jellyupDown.get(41).setY(y - 6 * stepY);
		jellyupDown.get(42).setY(y - 6 * stepY);
		jellyupDown.get(43).setY(y - 6 * stepY);
	}

	public void setMusicGo() {
		for (Jelly s : jellyupDown)
			s.soundmusicOn = true;
	}

	public void setMusicStop() {
		for (Jelly s : jellyupDown)
			s.soundmusicOn = false;
	}
}
