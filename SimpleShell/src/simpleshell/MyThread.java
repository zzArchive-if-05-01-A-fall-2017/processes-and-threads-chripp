/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleshell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pfleger C.
 */
public class MyThread extends Thread {
    
    private final String i;
    
    public MyThread(String i) {
        this.i = i;
    }
    
    @Override
    public void run() {
        String s;
        Process p;
        try {
            p = Runtime.getRuntime().exec(i);
            BufferedReader br = new BufferedReader(
                new InputStreamReader(p.getInputStream()));
            while ((s = br.readLine()) != null)
                System.out.println(s);
            p.waitFor();
            p.destroy();
            System.out.println("$ \"" + i + "\" finished\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
