package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class CatSubject implements Subject{
    // ��Ź۲��ߵļ���
    private List<Observer> observers;
    public CatSubject(){
        observers = new ArrayList<>();
    }
    // ע��۲���
    @Override
    public void registerObserver(Observer o){
        if(!observers.contains(o)){
            observers.add(o);
        }
    }
    // ȡ��ע��۲���
    @Override
    public void unregisterObserver(Observer o){
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
    @Override
    public void notifyObserver(){
        for(int i=0;i<observers.size();i++){
            observers.get(i).update();
        }
    }
    @Override
    public void activity(){
        // �����ʵ��
    	System.out.println("è���һ��\n");
    }
}