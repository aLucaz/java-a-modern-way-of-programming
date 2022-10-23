package reactive.patterns.observable;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class EndUser implements Observer {
    String name;

    EndUser(String name, SubjectLibrary subject) {
        this.name = name;
        subject.subscribeObserver(this);
    }

    @Override
    public void update(String avail) {
        log.info("Hello: " + name + " your requested book is now " + avail);
    }
}
