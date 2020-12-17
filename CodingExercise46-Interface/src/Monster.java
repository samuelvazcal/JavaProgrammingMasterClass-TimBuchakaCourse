import java.util.ArrayList;
import java.util.List;


public class Monster implements ISaveable {
	private String name;
	private int hitPoints;
	private int strength;

	public Monster(String name, int hitPoints, int strength) {
		this.name = name;
		this.hitPoints = hitPoints;
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getStrength() {
		return strength;
	}

	@Override
	public List<String> write() {
		List<String> objectList = new ArrayList<String>();
		objectList.add(0,name);
		objectList.add(1,"" + hitPoints);
		objectList.add(2,"" + strength);
		return objectList;
	}

	@Override
	public void read(List<String> savedValues) {
		if(savedValues != null && savedValues.size()>0) {
			this.name = savedValues.get(0);
			this.hitPoints = Integer.parseInt(savedValues.get(1));
			this.strength = Integer.parseInt(savedValues.get(2));
		}
	}

	@Override
	public String toString() {
		return "Monster{" +
				"name='" + name + '\'' +
				", hitPoints=" + hitPoints +
				", strength=" + strength +
				'}';
	}
}
