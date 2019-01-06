/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverversioncontrol;

import java.io.*;
import java.util.*;

/**
 *
 * @author Brian
 */
public class ServerVersionControl {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Aqui estoy, en el main");
        TimerTask task = new DirWatcher("c:/temp", "" );

          Timer timer = new Timer();
          timer.schedule( task , new Date(), 5000 );
    }
    
}
