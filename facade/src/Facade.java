public class Facade{
	ServiceA sa;
	ServiceB sb;
	ServiceC sc;

	public Facade(){
		sa = new ServiceAImpl();
		sb = new ServiceBImpl();
		sc = new ServiceCImpl();
	}

	public void methodA(){
		sa.methodA();
		sb.methodB();
	}

	public void methodB(){
		sb.methodB();
		sc.methodC();
	}

	public void methodC(){
		sa.methodA();
		sc.methodC();
	}
}

interface ServiceA{
	void methodA();
}

interface ServiceB{
	void methodB();
}

interface ServiceC{
	void methodC();
}

class ServiceAImpl implements ServiceA{
	public void methodA(){
		System.out.println("This is ServiceA");
	}
}

class ServiceBImpl implements ServiceB{
	public void methodB(){
		System.out.println("This is ServiceB");
	}
}

class ServiceCImpl implements ServiceC{
	public void methodC(){
		System.out.println("This is ServiceC");
	}
}

