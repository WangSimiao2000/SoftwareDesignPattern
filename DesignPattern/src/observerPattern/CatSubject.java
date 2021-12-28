package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class CatSubject implements Subject{
    // 存放观察者的集合
    private List<Observer> observers;
    public CatSubject(){
        observers = new ArrayList<>();
    }
    // 注册观察者
    @Override
    public void registerObserver(Observer o){
        if(!observers.contains(o)){
            observers.add(o);
        }
    }
    // 取消注册观察者
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
        // 具体的实现
    	System.out.println("猫大叫一声\n");
    }
}