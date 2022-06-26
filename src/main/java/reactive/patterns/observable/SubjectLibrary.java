package reactive.patterns.observable;

public interface SubjectLibrary {
    void subscribeObserver(Observer ob);

    void unsubscribeObserver(Observer ob);

    void notifyObserver();
}
