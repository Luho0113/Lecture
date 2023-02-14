package setEx_01;

public class Animal {
	public String animalName;
	public int life;

	public Animal(String name, int life) {
		super();
		this.animalName = name;
		this.life = life;
	}

	@Override
	public int hashCode() {

		return animalName.hashCode() + life;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal target) {
			//Animal animal = (Animal) obj;
			return target.animalName.equals(this.animalName) && target.life == life;
		} else {
			return false;
		}
	}

	
	//게터세터
	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}
	
	
	
}
