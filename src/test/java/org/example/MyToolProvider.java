package org.example;

import java.io.PrintWriter;
import java.nio.file.spi.FileSystemProvider;
import java.util.spi.ToolProvider;

public class MyToolProvider implements ToolProvider {
    @Override
    public String name() {
        return "foo";
    }

    @Override
    public int run(PrintWriter out, PrintWriter err, String... args) {
        return 0;
    }
}
