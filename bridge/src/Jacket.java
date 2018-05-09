public class Jacket extends Clothing {

	public Jacket(){
		setType("Jacket");
	}

    public void personDressCloth(Person person) {
		person.setClothing(this);
        System.out.println(person.getType() + " " + this.getType());
    }
}

