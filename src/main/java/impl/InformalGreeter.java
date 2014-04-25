package impl;


@Informal
public class InformalGreeter extends Greeter {

    @Override
    public String greet(final String name) {
        return "Hi, " + name + "!";
    }
}
