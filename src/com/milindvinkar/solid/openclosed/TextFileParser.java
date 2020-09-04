package com.milindvinkar.solid.openclosed;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class TextFileParser extends FileParser {

    @Override
    public String getType() {
        return "text";
    }

    @Override
    protected String getCustomErrorMessage() {
        return "Custom error message from TextFileParser !";
    }
}
