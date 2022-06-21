package functional.patterns.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandPattern {
    public static void main(String[] args) {
        Ac ac1 = new Ac();
        Ac ac2 = new Ac();
        AcAutomator remote = new AcAutomator();
        remote.setCommand(ac2::turnOn);
        remote.button();
        remote.setCommand(ac1::turnOff);
        remote.button();
    }
}
