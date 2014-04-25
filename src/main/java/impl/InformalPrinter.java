package impl;
import javax.inject.Inject;

public class InformalPrinter {

    @Inject
    @Informal
    Greeter greeter;

    public String printGreeting(final String name) {
        return this.greeter.greet(name);
    }

}