package com.human;
import java.util.List; 
import java.util.Random; 
public class HumanFactory { 
  
 //��һ�����䣬�������ȥ���˾ͳ��������̫�Ƚ��� 
	public static Human createHuman(Class c){ 
		Human human=null;  //����һ�����͵����� 
		try { 
			human = (Human)Class.forName(c.getName()).newInstance();   //����һ������ 
		} catch (InstantiationException e) {//��Ҫ�ǲ�˵��������ɫ�Ļ���û������Ҫ�׵ĺڣ���˵���˲źÿ� 
		  	System.out.println("����ָ���������ɫ"); 
		}  catch  (IllegalAccessException e) {  //��������������⣬�ǾͿ��������ˣ�����... 
		  	System.out.println("���ඨ�����"); 
		} catch (ClassNotFoundException e) { //�����˵�����࣬�ҵ������������ȥ���� 
		  	System.out.println("�쵰����ָ���������Ҳ�����"); 
		}  
		return human; 
	} 
  
  //Ů������ˣ���һ�������������¯��������ɶ�����ɶ���� 
	public static Human createHuman(){ 
		Human human=null;  //����һ�����͵����� 
	   
	   //�����ǻ���ж��ٸ�ʵ���࣬���ٸ����� 
		List<Class> concreteHumanList = 
		ClassUtils.getAllClassByInterface(Human.class);  //�����˶������� 
		System.out.println("Human size: " + concreteHumanList.size());
		//����¯�Լ���ʼ���ճ�ʲô�˾�ʲô��    
		Random random = new Random(); 
		int rand = random.nextInt(concreteHumanList.size()); 
		   
		human = createHuman(concreteHumanList.get(rand)); 
		   
		return human; 
	} 
} 

