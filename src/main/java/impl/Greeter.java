/**
 * Copyright (c) 2014 by Andreas Antener. All rights reserved.
 */

package impl;
import javax.enterprise.inject.Default;

@Default
public class Greeter {

    public String greet(final String name) {
        return "Hello, " + name + ".";
    }
}