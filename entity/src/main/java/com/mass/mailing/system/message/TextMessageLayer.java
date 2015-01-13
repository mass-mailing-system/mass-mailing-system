/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.message;


import org.apache.commons.lang.Validate;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class TextMessageLayer implements MessageLayer {

    private String content;

    public TextMessageLayer(final String content) {
        Validate.notNull(content, "Text is required");

        this.content = content;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }
}
