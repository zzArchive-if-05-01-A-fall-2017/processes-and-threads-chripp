/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleshell;

/**
 *
 * @author Pfleger C.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SimpleShell {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = null;
        System.out.println("Quit with input \"q\"\n");
        while(true) {
            try {
                s = br.readLine().split(" & ");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                continue;
            }
            if(s.length == 1 && s[0].equals("q"))
                break;
            for(int u = 0; u < s.length; u++)
                new MyThread(s[u]).start();
        }
    }
}
