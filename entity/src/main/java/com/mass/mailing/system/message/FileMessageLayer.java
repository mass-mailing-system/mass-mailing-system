package com.mass.mailing.system.message;


import org.apache.commons.lang.Validate;

import java.nio.file.Path;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class FileMessageLayer implements MessageLayer {

    private Path sourceFile;

    public FileMessageLayer(final Path sourceFile) {
        Validate.notNull(sourceFile, "Source path is required");

        this.sourceFile = sourceFile;
    }

    @Override
    public Path getContent() {
        return sourceFile;
    }
}
