public class ConcreteMediator extends Mediator {

    private ColleagueA ca;
    
    private ColleagueB cb;
    
    public ConcreteMediator() {
        ca = new ColleagueA();
        cb = new ColleagueB();
    }
    
    public void notice(String content) {
        if (content.equals("boss")) {
            //�ϰ�����, ֪ͨԱ��A
            ca.action();
        }
        if (content.equals("client")) {
            //�ͻ�����, ֪ͨǰ̨B
            cb.action();
        }
    }
}

