/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoFinal;
//Se tiene que importar para que los grafos funcione:
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


/**
 *
 * @author Hector
 */
public class PintarDibujos {
    //Luego se continuara
    public PintarDibujos(){}
    
    public void pinta_Circulo(Graphics2D g, int x, int y, String n){
    ((Graphics2D)g).setColor(Color.red);
    ((Graphics2D)g).setStroke(new BasicStroke(2));
    ((Graphics2D)g).fillOval(x, y, 15, 15);
    ((Graphics2D)g).setColor(Color.blue);
    ((Graphics2D)g).drawOval(x, y, 15, 15);
    ((Graphics2D)g).setColor(Color.black);
    Font fuente= new Font("Monospaced", Font.BOLD, 16);
    g.setFont(fuente);
    ((Graphics2D)g).drawString(n, x, y);
    
    }
    
    public static void pinta_linea(){
    
    }
    
    
    
    
    
}
