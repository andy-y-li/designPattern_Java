import java.util.ArrayList;

public abstract class Employer {

    private String name;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public abstract void add(Employer employer);
    
    public abstract void delete(Employer employer);
    
    protected ArrayList employers;
    
    public void printInfo() {
        System.out.println(name);
    }
    
    public ArrayList getEmployers() {
        return this.employers;
    }
}

