/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codingcrucible.rpg.tools;

import java.io.StringWriter;
import javax.swing.JTextArea;


public class ConsoleWriter {
    
    private JTextArea a;
    
    public ConsoleWriter(JTextArea a) {
        this.a = a;
    }
    
    public void print(String s)
    {
        a.append(s);
    }
    
    public void println(String s){
        a.append(s);
        a.append("\n");
    }
    
}
