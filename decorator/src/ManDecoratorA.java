public class ManDecoratorA extends Decorator {

    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA��");
    }

    public void reEat() {
        System.out.println("�ٳ�һ�ٷ�");
    }
}

