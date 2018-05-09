public class Test {

    
    public static void main(String[] args) {
        RequestHandle hr = new HRRequestHandle();
        RequestHandle pm = new PMRequestHandle(hr);
        RequestHandle tl = new TLRequestHandle(pm);
        
        //team leader������ְ����
        Request request = new DimissionRequest();
        tl.handleRequest(request);
        
        System.out.println("===========");
        //team leader�����н����
        request = new AddMoneyRequest();
        tl.handleRequest(request);
        
        System.out.println("========");
        //��Ŀ���������ְ����
        request = new DimissionRequest();
        tl.handleRequest(request);

        System.out.println("========");
		request = new LeaveRequest();
		tl.handleRequest(request);
    }
}

