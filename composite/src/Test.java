import java.util.ArrayList;
public class Test {

    public static void main(String[] args) {
        Employer pm = new ProjectManager("��Ŀ����");
        Employer pa = new ProjectAssistant("��Ŀ����");
        Employer programmer1 = new Programmer("����Աһ");
        Employer programmer2 = new Programmer("����Ա��");
        
        pm.add(pa);//Ϊ��Ŀ���������Ŀ����
        pm.add(programmer2);//Ϊ��Ŀ������ӳ���Ա
        
        ArrayList ems = pm.getEmployers();
        for (int idx = 0;idx < ems.size();++idx) {
			Employer em = (Employer)ems.get(idx);
            System.out.println(em.getName());
        }
    }
}

