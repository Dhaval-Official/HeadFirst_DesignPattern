package C2_Observer_Pattern;

import C2_Observer_Pattern.DisplayChannels.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
