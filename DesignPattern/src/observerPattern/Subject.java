package observerPattern;

public interface Subject{
    // ע��۲���
    void registerObserver(Observer o);
    // ȡ��ע��۲���
    void unregisterObserver(Observer o);
    // ֪ͨ�۲���
    void notifyObserver();
    //���۲�����Ϊ
    void activity();
}