public class TLRequestHandle implements RequestHandle {

    RequestHandle rh;
    
    public TLRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }

    public void handleRequest(Request request) {
        if (request instanceof LeaveRequest) {
            System.out.println("Ҫ���, ��Ŀ�鳤����!");
			System.out.println("�������");
        } else {
            rh.handleRequest(request);
        }
    }
}

