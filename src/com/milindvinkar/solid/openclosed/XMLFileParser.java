package com.milindvinkar.solid.openclosed;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLFileParser extends FileParser {

    private Validator validator = new Validator();

    @Override
    public List<String> parse(File file) throws IOException {
        if (!validator.isXMLFile(file)) {
            throw new RuntimeException(getCustomErrorMessage());
        }
        return super.parse(file);
    }

    @Override
    public String getType() {
        return "XML";
    }

    @Override
    protected String getCustomErrorMessage() {
        return "Custom error message from excel file parser !";
    }
}
