public class Test {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.add(new SimpleExpression());
        ctx.add(new AdvanceExpression());
        ctx.add(new SimpleExpression());
        
        for (int idx = 0; idx < ctx.getList().size();++idx) {
			Expression eps = (Expression)ctx.getList().get(idx);
            eps.interpret(ctx);
        }
    }
}

