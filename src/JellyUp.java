import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.*;

public class JellyUp extends ImageIcon {
	int x = 800;
	int y = 220;
	int gomSizeX = 31;
	int gomSizeY = 29;
	int stepX = 30;
	int stepY = 10;

	int CenX = x + gomSizeX / 2;
	int CenY = y + gomSizeY / 2;

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

	int margin = 30;

	ImageIcon Gom = new ImageIcon("src/Jelly/Gom_Jelly2.png");

	public JellyUp() {

	}

	public boolean collide(int px, int py) {
		Point what = new Point(px, py);

		Point p = new Point(this.CenX, this.CenY);
		if (p.distance(what) <= margin)
			return true;
		return false;

	}

	public void Draw(Graphics2D g2d) {

	}

	public void go(int Px) {
		x -= Px;
		CenX -= Px;
	}

	public void move(int Px, int Py) {
		x += Px;
		y += Py;
		CenX += Px;
		CenY += Py;
	}
}
