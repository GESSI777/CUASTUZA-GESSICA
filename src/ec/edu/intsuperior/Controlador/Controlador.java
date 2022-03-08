/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.Controlador;

import ec.edu.intsuperior.Vista.Loggin;

/**
 *
 * @author Windows 10
 */
public class Controlador {
    Loggin loggin=new Loggin (this);
    public void showLoggin(){
     loggin.setVisible(true);   
    }
}
