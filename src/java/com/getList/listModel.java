/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.getList;

/**
 *
 * @author oscardiaz
 */
public class listModel {
    private int ID_LISTCAT;
    private String NAMECAT;
    private String IDENTIFIER;
    private int STATUS;

    public int getID_LISTCAT() {
        return ID_LISTCAT;
    }

    public void setID_LISTCAT(int ID_LISTCAT) {
        this.ID_LISTCAT = ID_LISTCAT;
    }

    public String getNAMECAT() {
        return NAMECAT;
    }

    public void setNAMECAT(String NAMECAT) {
        this.NAMECAT = NAMECAT;
    }

    public String getIDENTIFIER() {
        return IDENTIFIER;
    }

    public void setIDENTIFIER(String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }
    
    
    
}
