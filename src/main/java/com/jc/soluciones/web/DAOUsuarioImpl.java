/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jc.soluciones.web;

import java.util.ArrayList;

public class DAOUsuarioImpl {
    
    public static ArrayList<Usuario> ggg(){
        ArrayList<Usuario> us=new ArrayList<Usuario>();
        Usuario u1=new Usuario("jorge","000",'x');
          Usuario u2=new Usuario("ivan","111",'y');
            Usuario u3=new Usuario("peña","222",'w');
        
        us.add(u1);
        us.add(u3);
        us.add(u2);
        return us;
    }
       
       
    
}
