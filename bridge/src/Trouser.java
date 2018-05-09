public class Trouser extends Clothing {

	public Trouser(){
		setType("Trouser");
	}

    public void personDressCloth(Person person) {
		person.setClothing(this);
        System.out.println(person.getType() + " " + this.getType());
    }
}

