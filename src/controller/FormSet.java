/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JFrame;

/**
 *
 * @author Alumno
 */
public class FormSet{
    
    private final JFrame jf;

    public FormSet(JFrame jf){
        this.jf = jf;
    }
    
    public void undecorated(){
        jf.setUndecorated(true);
    }
    
    public void setAll(){

        jf.setTitle(AppResource.TITLE);
        jf.setLocationRelativeTo(null);
        jf.setResizable(false);

    }
}
