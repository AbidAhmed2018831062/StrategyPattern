package strategy;

public class Running {
    public static void main(String[] args)
    {
        Context cs=new Context();
        cs.setStrategy(new Addition());
        cs.executeWork(10.0, 20.0);
    }
}
