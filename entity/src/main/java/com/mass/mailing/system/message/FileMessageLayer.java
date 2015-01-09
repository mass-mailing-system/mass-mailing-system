package com.mass.mailing.system.message;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class FileMessageLayer {

    private String sourceFile;
    private Long id;
    
    public FileMessageLayer() {}

    public FileMessageLayer(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    public FileMessageLayer(Long id, String sourceFile) {
        this.id = id;
        this.sourceFile = sourceFile;
    }

    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
}
