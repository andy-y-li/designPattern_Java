public class ProxyObject implements Object {

    Object obj;
    
    public ProxyObject() {
        System.out.println("���Ǵ�����");
        obj = new ObjectImpl();
    }
    
    public void action() {
        System.out.println("����ʼ");
        obj.action();
        System.out.println("�������");
    }
}

