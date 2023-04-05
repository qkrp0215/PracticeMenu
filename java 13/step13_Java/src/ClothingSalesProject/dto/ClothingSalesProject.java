package ClothingSalesProject.dto;

public class ClothingSalesProject {
	private Person person;
	private Cloth cloth;
	
	
	public ClothingSalesProject() {}

	public ClothingSalesProject(Person person, Cloth cloth) {
		super();
		this.person = person;
		this.cloth = cloth;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Cloth getCloth() {
		return cloth;
	}

	public void setCloth(Cloth cloth) {
		this.cloth = cloth;
	}

	@Override
	public String toString() {
		return "ClothingSalesProject [person=" + person + ", cloth=" + cloth + "]";
	}
	
	
	
	
	
	
	
}
