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
public class TextMessageLayer {
    private String content;
    private Long id;
    
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
