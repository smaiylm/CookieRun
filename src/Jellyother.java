import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.*;

public class Jellyother extends Jelly {
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

	ArrayList<Jelly> jellyother = new ArrayList<Jelly>();

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

	public Jellyother() {
		jellyother.add(jelly0);
		jellyother.add(jelly1);
		jellyother.add(jelly2);
		jellyother.add(jelly3);
		jellyother.add(jelly4);
		jellyother.add(jelly5);
		jellyother.add(jelly6);
		jellyother.add(jelly7);
		jellyother.add(jelly8);
		jellyother.add(jelly9);
		jellyother.add(jelly10);

		jellyother.add(jelly11);
		jellyother.add(jelly12);
		jellyother.add(jelly13);
		jellyother.add(jelly14);
		jellyother.add(jelly15);
		jellyother.add(jelly16);
		jellyother.add(jelly17);
		jellyother.add(jelly18);
		jellyother.add(jelly19);
		jellyother.add(jelly20);
		jellyother.add(jelly21);

		jellyother.add(jelly22);
		jellyother.add(jelly23);
		jellyother.add(jelly24);
		jellyother.add(jelly25);
		jellyother.add(jelly26);
		jellyother.add(jelly27);
		jellyother.add(jelly28);
		jellyother.add(jelly29);
		jellyother.add(jelly30);
		jellyother.add(jelly31);
		jellyother.add(jelly32);

		jellyother.add(jelly33);
		jellyother.add(jelly34);
		jellyother.add(jelly35);
		jellyother.add(jelly36);
		jellyother.add(jelly37);
		jellyother.add(jelly38);
		jellyother.add(jelly39);
		jellyother.add(jelly40);
		jellyother.add(jelly41);
		jellyother.add(jelly42);
		jellyother.add(jelly43);
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

	public void drawother(Graphics2D g2d, int CollidX, int CollidY) {
		for (Jelly s : jellyother) {
			if (s.collide(CollidX, CollidY))
				if (s.cnt2) {
					Score += 100;
					s.cnt2 = false;
				}
			s.Draw(g2d);

		}
		this.collide(CollidX, CollidY);
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}

	public void go(int x) {
		this.x -= x;
		CenX -= x;
		for (Jelly s : jellyother) {
			s.go(x);
		}

	}

	public void Jellyreset() {
		for (Jelly s : jellyother) {
			s.reset();
		} // 22°³
		jellyother.get(0).setX(x - 5 * stepX);
		jellyother.get(1).setX(x - 4 * stepX);
		jellyother.get(2).setX(x - 3 * stepX);
		jellyother.get(3).setX(x - 2 * stepX);
		jellyother.get(4).setX(x - stepX);
		jellyother.get(5).setX(x);
		jellyother.get(6).setX(x + stepX);
		jellyother.get(7).setX(x + 2 * stepX);
		jellyother.get(8).setX(x + 3 * stepX);
		jellyother.get(9).setX(x + 4 * stepX);
		jellyother.get(10).setX(x + 5 * stepX);

		jellyother.get(11).setX(x - 5 * stepX);
		jellyother.get(12).setX(x - 4 * stepX);
		jellyother.get(13).setX(x - 3 * stepX);
		jellyother.get(14).setX(x - 2 * stepX);
		jellyother.get(15).setX(x - 1 * stepX);
		jellyother.get(16).setX(x);
		jellyother.get(17).setX(x + 1 * stepX);
		jellyother.get(18).setX(x + 2 * stepX);
		jellyother.get(19).setX(x + 3 * stepX);
		jellyother.get(20).setX(x + 4 * stepX);
		jellyother.get(21).setX(x + 5 * stepX);

		jellyother.get(22).setX(x - 5 * stepX);
		jellyother.get(23).setX(x - 4 * stepX);
		jellyother.get(24).setX(x - 3 * stepX);
		jellyother.get(25).setX(x - 2 * stepX);
		jellyother.get(26).setX(x - 1 * stepX);
		jellyother.get(27).setX(x);
		jellyother.get(28).setX(x + 1 * stepX);
		jellyother.get(29).setX(x + 2 * stepX);
		jellyother.get(30).setX(x + 3 * stepX);
		jellyother.get(31).setX(x + 4 * stepX);
		jellyother.get(32).setX(x + 5 * stepX);

		jellyother.get(33).setX(x - 5 * stepX);
		jellyother.get(34).setX(x - 4 * stepX);
		jellyother.get(35).setX(x - 3 * stepX);
		jellyother.get(36).setX(x - 2 * stepX);
		jellyother.get(37).setX(x - 1 * stepX);
		jellyother.get(38).setX(x);
		jellyother.get(39).setX(x + 1 * stepX);
		jellyother.get(40).setX(x + 2 * stepX);
		jellyother.get(41).setX(x + 3 * stepX);
		jellyother.get(42).setX(x + 4 * stepX);
		jellyother.get(43).setX(x + 5 * stepX);

		jellyother.get(0).setY(y);
		jellyother.get(1).setY(y);
		jellyother.get(2).setY(y);
		jellyother.get(3).setY(y);
		jellyother.get(4).setY(y);
		jellyother.get(5).setY(y);
		jellyother.get(6).setY(y);
		jellyother.get(7).setY(y);
		jellyother.get(8).setY(y);
		jellyother.get(9).setY(y);
		jellyother.get(10).setY(y);

		jellyother.get(11).setY(y - 3 * stepY);
		jellyother.get(12).setY(y - 3 * stepY);
		jellyother.get(13).setY(y - 3 * stepY);
		jellyother.get(14).setY(y - 3 * stepY);
		jellyother.get(15).setY(y - 3 * stepY);
		jellyother.get(16).setY(y - 3 * stepY);
		jellyother.get(17).setY(y - 3 * stepY);
		jellyother.get(18).setY(y - 3 * stepY);
		jellyother.get(19).setY(y - 3 * stepY);
		jellyother.get(20).setY(y - 3 * stepY);
		jellyother.get(21).setY(y - 3 * stepY);

		jellyother.get(22).setY(y - 6 * stepY);
		jellyother.get(23).setY(y - 6 * stepY);
		jellyother.get(24).setY(y - 6 * stepY);
		jellyother.get(25).setY(y - 6 * stepY);
		jellyother.get(26).setY(y - 6 * stepY);
		jellyother.get(27).setY(y - 6 * stepY);
		jellyother.get(28).setY(y - 6 * stepY);
		jellyother.get(29).setY(y - 6 * stepY);
		jellyother.get(30).setY(y - 6 * stepY);
		jellyother.get(31).setY(y - 6 * stepY);
		jellyother.get(32).setY(y - 6 * stepY);

		jellyother.get(33).setY(y - 9 * stepY);
		jellyother.get(34).setY(y - 9 * stepY);
		jellyother.get(35).setY(y - 9 * stepY);
		jellyother.get(36).setY(y - 9 * stepY);
		jellyother.get(37).setY(y - 9 * stepY);
		jellyother.get(38).setY(y - 9 * stepY);
		jellyother.get(39).setY(y - 9 * stepY);
		jellyother.get(40).setY(y - 9 * stepY);
		jellyother.get(41).setY(y - 9 * stepY);
		jellyother.get(42).setY(y - 9 * stepY);
		jellyother.get(43).setY(y - 9 * stepY);
	}

	public void setMusicGo() {
		for (Jelly s : jellyother)
			s.soundmusicOn = true;
	}

	public void setMusicStop() {
		for (Jelly s : jellyother)
			s.soundmusicOn = false;
	}
}
