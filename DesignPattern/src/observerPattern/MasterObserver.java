package observerPattern;

public class MasterObserver implements Observer{
    private Subject subject;
    public MasterObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update(){
        // �����ʵ��
    	System.out.println("���˱�����\n");
    }
}