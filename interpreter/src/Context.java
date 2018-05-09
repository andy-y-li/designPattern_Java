import java.util.ArrayList;

public class Context {

    private String content;
    
    private ArrayList list = new ArrayList();
    
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public void add(Expression eps) {
        list.add(eps);
    }
    
    public ArrayList getList() {
        return list;
    }
}

