package com.apress.progwt.client.college.gui.ext;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;

/**
 * Use this class to get around varying implementations of:
 * 
 * DOM.eventGetClientX(evt);
 * 
 * Between Friefox and the rest of the world. Usage: call setLastXY() in a
 * mousemove listener.
 * 
 * @author Jeff Dwyer
 * 
 */
public class ClientMouseImpl {

    protected int x;
    protected int y;

    public void setLastXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getClientX(Event evt) {
        if (evt != null) {
            return DOM.eventGetClientX(evt);
        } else {
            return x;
        }
    }

    public int getClientY(Event evt) {
        if (evt != null) {
            return DOM.eventGetClientY(evt);
        } else {
            return y;
        }
    }
}
