package com.milindvinkar.solid.openclosed;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public abstract class FileParser {

    public List<String> parse(File file) throws IOException {
        return Files.readAllLines(file.toPath());
    }

    public abstract String getType();

    protected String getCustomErrorMessage() {
        return "Custom error message from base class !";
    }

}
