/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.guillermovallespir.dbscriptmaker;

import com.guillermovallespir.dbscriptmaker.Visual.Panel;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author guille
 */
public class DBScriptMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        Panel panel = new Panel();
        panel.setLocation(dim.width/2-panel.getSize().width/2, dim.height/2-panel.getSize().height/2);
        panel.setVisible(true);
    }
    
}
