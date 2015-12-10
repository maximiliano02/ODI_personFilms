/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.personfilms.exception;

/**
 * Classe permettant le traitement des exception unique
 * @author maximili.jeannere
 */
public class UniqueException extends Exception {

    public UniqueException() {
        super();
    }

    /**
     *
     * @param message
     */
    public UniqueException(String message) {
        super(message);
    }

    /**
     *
     * @param message
     * @param cause
     */
    public UniqueException(String message, Throwable cause) {
        super(message, cause);
    }
}
