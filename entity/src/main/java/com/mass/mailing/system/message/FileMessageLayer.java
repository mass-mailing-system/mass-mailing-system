package com.mass.mailing.system.message;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class FileMessageLayer extends AbstractMessageLayer {

    private String sourceFile;

    public FileMessageLayer() {}

    public FileMessageLayer(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public FileMessageLayer(Long id, String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
}
