public class Test {

    public static void main(String[] args) {
        List list = new ListImpl();
        list.add("a");
        list.add("b");
        list.add("c");
        //��һ�ֵ�����ʽ
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        System.out.println("=====");
        //�ڶ��ֵ�����ʽ
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}

