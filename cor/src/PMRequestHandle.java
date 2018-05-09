public class PMRequestHandle implements RequestHandle {

    RequestHandle rh;
    
    public PMRequestHandle(RequestHandle rh) {
        this.rh = rh;
    }
    
    public void handleRequest(Request request) {
        if (request instanceof AddMoneyRequest) {
            System.out.println("要加薪, 项目经理审批!");
			System.out.println("请求完毕");
        } else {
            rh.handleRequest(request);
        }
    }
}

