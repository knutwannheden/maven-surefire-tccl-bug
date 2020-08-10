package org.example;

import java.util.ServiceLoader;
import java.util.spi.ToolProvider;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyIT {

    @Test
    public void test() {
        for (ToolProvider provider : ServiceLoader.load(ToolProvider.class)) {
            if (provider instanceof MyToolProvider)
                return;
        }
        Assertions.fail();
    }
}
