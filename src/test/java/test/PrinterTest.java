/**
 * Copyright (c) 2014 by Andreas Antener. All rights reserved.
 */
package test;

import impl.Greeter;
import impl.InformalPrinter;
import impl.Printer;

import javax.inject.Inject;

import org.jglue.cdiunit.AdditionalPackages;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(CdiRunner.class)
@AdditionalPackages(Greeter.class)
public class PrinterTest {

    @Inject
    InformalPrinter informalPrinter;

    @Inject
    Printer defaultPrinter;

    @Test
    public void testInformal() {
        Assert.assertEquals("Hi, Lauzge!", this.informalPrinter.printGreeting("Lauzge"));
    }

    @Test
    public void testDefault() {
        Assert.assertEquals("Hello, Lauzge.", this.defaultPrinter.printGreeting("Lauzge"));
    }

}
