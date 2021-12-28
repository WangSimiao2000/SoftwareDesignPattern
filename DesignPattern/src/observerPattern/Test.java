package observerPattern;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args){
	    // �������۲���
	    Subject subject = new CatSubject();
	    subject.activity();
	    // �����۲���
	    Observer one = new MouseObserver(subject);
	    // �����۲���
	    Observer two = new MasterObserver(subject);
	    // ״̬�����ı䣬֪ͨ�۲���
	    subject.notifyObserver();
	}
}
