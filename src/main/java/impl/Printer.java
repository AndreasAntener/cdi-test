package impl;
import javax.inject.Inject;



public class Printer {

    @Inject
    Greeter greeter;

    public String printGreeting(final String name) {
        return this.greeter.greet(name);
    }

}