package observerPattern;

public class MouseObserver implements Observer{
    private Subject subject;
    public MouseObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update(){
        // 具体的实现
    	System.out.println("老鼠开始逃跑\n");
    }
}