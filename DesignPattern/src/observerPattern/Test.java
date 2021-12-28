package observerPattern;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args){
	    // 创建被观察者
	    Subject subject = new CatSubject();
	    subject.activity();
	    // 创建观察者
	    Observer one = new MouseObserver(subject);
	    // 创建观察者
	    Observer two = new MasterObserver(subject);
	    // 状态发生改变，通知观察者
	    subject.notifyObserver();
	}
}
