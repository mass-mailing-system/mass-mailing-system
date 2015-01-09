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
public abstract class AbstractMessageLayer implements MessageLayer {
    protected Long id;

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
