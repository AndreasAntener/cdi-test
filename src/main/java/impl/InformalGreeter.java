/**
 * Copyright (c) 2014 by Andreas Antener. All rights reserved.
 */
package impl;


@Informal
public class InformalGreeter extends Greeter {

    @Override
    public String greet(final String name) {
        return "Hi, " + name + "!";
    }
}
