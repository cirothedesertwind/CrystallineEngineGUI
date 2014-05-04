/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codingcrucible.rpg.process;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurix
 */
public class ProcessHandler {

    public static void initGame() {
        ProcessBuilder pb = new ProcessBuilder("/usr/bin/java", "-jar", "dist/lib/RPGEngine.jar");
        try {
            Process p = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(ProcessHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
