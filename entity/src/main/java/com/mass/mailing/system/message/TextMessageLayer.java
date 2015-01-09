/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.message;

/**
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public class TextMessageLayer extends AbstractMessageLayer {
    private String content;
    
    public TextMessageLayer(){}
    public TextMessageLayer( String content ){
        this.content = content;
    }
    public TextMessageLayer( String content, Long id ){
        this.content = content;
        this.id = id;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
}
