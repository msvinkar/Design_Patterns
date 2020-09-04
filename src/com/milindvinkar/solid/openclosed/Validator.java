package com.milindvinkar.solid.openclosed;

import java.io.File;

public class Validator {

    public boolean isXMLFile(File file) {
        return file.getPath().endsWith("xml");
    }
}
