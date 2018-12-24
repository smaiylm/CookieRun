import java.util.ArrayList;


public class GenJelly {
	
	public GenJelly(){
	ArrayList<Jelly> jelly = new ArrayList<Jelly>();
	Jelly jelly1 = new Jelly();
	jelly1.setX(jelly1.x+jelly1.stepX);
	jelly1.setY(jelly1.y+jelly1.stepY);
	Jelly jelly2 = new Jelly();
	jelly2.setY(jelly2.y+jelly2.stepY*2);
	Jelly jelly3 = new Jelly();
	jelly3.setY(jelly3.y+jelly3.stepY*3);
	Jelly jelly4 = new Jelly();
	jelly4.setY(jelly4.y+jelly4.stepY*4);
	jelly.add(jelly4);
	jelly.add(jelly3);
	jelly.add(jelly2);
	jelly.add(jelly1);
	}
	
	
}
