package observerPattern;

public interface Subject{
    // 注册观察者
    void registerObserver(Observer o);
    // 取消注册观察者
    void unregisterObserver(Observer o);
    // 通知观察者
    void notifyObserver();
    //被观察者行为
    void activity();
}