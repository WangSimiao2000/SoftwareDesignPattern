package observerPattern;

public class MouseObserver implements Observer{
    private Subject subject;
    public MouseObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update(){
        // �����ʵ��
    	System.out.println("����ʼ����\n");
    }
}