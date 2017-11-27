package local.zcw.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者 zcw
 * 时间 2017/11/27 12:06
 * 版本 1.0.0
 * 描述 被观察者
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state = 0;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObserver();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
