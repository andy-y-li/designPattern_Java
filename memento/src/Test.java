public class Test {

    public static void main(String[] args) {
        Originator org = new Originator();
        org.setState("������");
        
        Caretaker ctk = new Caretaker();
        ctk.setMemento(org.createMemento());//�����ݷ�װ��Caretaker
        
        org.setState("˯����");
        org.showState();//��ʾ
        
        org.setMemento(ctk.getMemento());//���������µ���
        org.showState();
    }
}

