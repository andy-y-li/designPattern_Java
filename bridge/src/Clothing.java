public abstract class Clothing {
	private String type;

	public void setType(String type){
		this.type = type;
	}
	
	public String getType(){
		return type;
	}

    public abstract void personDressCloth(Person person);
}

