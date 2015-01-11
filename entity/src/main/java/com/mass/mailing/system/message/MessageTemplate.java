package com.mass.mailing.system.message;

import com.mass.mailing.system.shared.Entity;
import org.apache.commons.lang.Validate;

import java.util.ArrayList;
import java.util.List;

/**
 * Спрингом сделать инъекции, для автоматизации
 *
 * MessageTemplate выступает шаблоном месседжа, которое будет отправляться.
 * Это начальная модель. В будущем при имплементации разных мессенджеров,
 * от этого класса будут унаследованы другие "темплейты", в которых будут дополнительные поля.
 * Например: при реализации MailMessageTemplate будет добавляться поле "заголовок"
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class MessageTemplate extends Entity {

    private Long id;

    private TextMessageLayer textContent;

    private List<FileMessageLayer> sourceFiles;

    public MessageTemplate(final Long id, final TextMessageLayer msgLayer) {
        Validate.notNull(msgLayer, "TextMessageLayer is required");

        this.id = id;
        this.textContent = msgLayer;
    }

    public MessageTemplate(final Long id, final FileMessageLayer fileLayer) {
        Validate.notNull(fileLayer, "FileMessageLayer is required");

        this.id = id;

        sourceFiles = new ArrayList<>();
        sourceFiles.add(fileLayer);
    }

    public void addSourceFile(FileMessageLayer fileLayer) {
        Validate.notNull(fileLayer, "FileMessageLayer is required");

        if(sourceFiles != null) {
            sourceFiles.add(fileLayer);
        } else {
            sourceFiles = new ArrayList<>();
            sourceFiles.add(fileLayer);
        }
    }

    @Override
    public Long getId() {
        return id;
    }

    public MessageLayer getTextContent() {
        return textContent;
    }

    public List<FileMessageLayer> getSourceFiles() {
        return sourceFiles;
    }
}
