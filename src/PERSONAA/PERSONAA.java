/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PERSONAA;

import javax.swing.JOptionPane;
/**
 *
 * @author EDWIN
 */
public class PERSONAA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad;
        String id, nombre, sexo, tp;
        double  ht, ph;
        
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿CUANTAS PERSONAS DESEA INGRESAR?"));
        
        for(int i=1; i<=cantidad; i++)
        {
            tp = JOptionPane.showInputDialog(null, "INGRESE EL TIPOD DE PERSONA [DOCTOR/DEPORTISTA]:");
            
            if(tp.compareTo("DOCTOR") == 0)
            {
              id = JOptionPane.showInputDialog(null, "INGRESE EL ID DEL DEPORTISTA:");
                nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL DEPORTISTA: ");
                sexo = JOptionPane.showInputDialog(null, "INGRESE EL SEXO DEL DEPORTISTA:");
                ht = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE PARTIDOS :"));
                ph = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL PAGO POR PARTIDO:"));
                DOCTOR p = new DOCTOR(id,nombre,sexo,ht,ph);
                System.out.println("EL PAGO PARA EL DEPORTISTA " + nombre + "(" + id + ") ES: L." + p.pagoDOCTOR());
            }
            else
            {
                if(tp.compareTo("PORTISTA") == 0)
                {
                id = JOptionPane.showInputDialog(null, "INGRESE EL ID DEL DEPORTISTA:");
                nombre = JOptionPane.showInputDialog(null, "INGRESE EL NOMBRE DEL DEPORTISTA: ");
                sexo = JOptionPane.showInputDialog(null, "INGRESE EL SEXO DEL DEPORTISTA:");
                ht = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL NUMERO DE PARTIDOS :"));
                ph = Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE EL PAGO POR PARTIDO:"));
                DOCTOR p = new DOCTOR(id,nombre,sexo,ht,ph);
                System.out.println("EL PAGO PARA EL DEPORTISTA " + nombre + "(" + id + ") ES: L." + p.pagopagoDOCTOR());
                }
                else
                    System.out.println("TIPO DE PERSONA DESCONOCIDA");
            }
        }
        
    }
    
}
