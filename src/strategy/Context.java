package strategy;

public class Context {
    public Operations op;

    void setStrategy(Operations op)
    {
        this.op=op;
    }
    void executeWork(Double a, Double b)
    {
        System.out.println(op.stratgy(a, b));
    }

}
