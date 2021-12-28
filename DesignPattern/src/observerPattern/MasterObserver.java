package observerPattern;

public class MasterObserver implements Observer{
    private Subject subject;
    public MasterObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update(){
        // 具体的实现
    	System.out.println("主人被惊醒\n");
    }
}