package impl;
import javax.enterprise.inject.Default;

@Default
public class Greeter {

    public String greet(final String name) {
        return "Hello, " + name + ".";
    }
}