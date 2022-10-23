package functional.patterns.command;

import lombok.Setter;

@Setter
public class AcAutomator {
    Command command;

    public void button(){
        command.execute();
    }
}
