public class Test {

    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //�ϰ�����
        med.notice("boss");
        
        //�ͻ�����
        med.notice("client");
    }
}

