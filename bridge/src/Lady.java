public class Lady extends Person {

    public Lady() {
        setType("Lady");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}

