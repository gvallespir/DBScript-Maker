/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guillermovallespir.dbscriptmaker.Utils;

import javax.swing.event.DocumentEvent;
import javax.swing.text.Document;


/**
 *
 * @author guille
 */
class DocumentListener implements javax.swing.event.DocumentListener{
    String newline = "\n";
 
    public void insertUpdate(DocumentEvent e) {
        updateLog(e, "inserted into");
    }
    
    public void removeUpdate(DocumentEvent e) {
        updateLog(e, "removed from");
    }
    
    public void changedUpdate(DocumentEvent e) {
        //Plain text components do not fire these events
    }

    public void updateLog(DocumentEvent e, String action) {
        Document doc = (Document)e.getDocument();
        int changeLength = e.getLength();
        /*displayArea.append(
            changeLength + " character" +
            ((changeLength == 1) ? " " : "s ") +
            action + doc.getProperty("name") + "." + newline +
            "  Text length = " + doc.getLength() + newline);*/
    }
}
