/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mass.mailing.system.message;

/**
 * This is marker interface
 *
 * Я подумал, что МесседжЛейер - это все-таки не энтити, а value-object,
 * поэтому убрал все айдишники
 *
 * @author Oleg Kozak
 * @author Illia Rudenko
 */
public interface MessageLayer {

    public Object getContent();
}
