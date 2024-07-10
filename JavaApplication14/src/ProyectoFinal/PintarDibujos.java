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
import java.awt.Color;

/**
 *
 * @author Hector
 */
public class PintarDibujos {

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
    
    public static void pinta_linea(Graphics2D g, int x1, int y1, int x2, int y2, double tam){
        int x_Aux=0;
        int y_Aux= 0;
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        ((Graphics2D)g).setStroke(stroke);
        ((Graphics2D)g).drawLine(x1+10, y1+10, x2+10, y2+10);
        if(x1<= x2){
            x_Aux= ((x2-x1)/2) + x1;
        }
        if(x1 > x2){
        x_Aux=  ((x2-x1)/2) + x2;
        }
        if(y1 < y2){
            y_Aux= ((y2-y1)/2)+y1;
        }
        if(y1 >= y2){
            y_Aux= ((y2-y1)/2)+y2;
        }
        ((Graphics2D)g).setColor(Color.blue);
        Font fuente= new Font("Monospaced", Font.PLAIN, 12);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(String.valueOf(tam), x_Aux, y_Aux);
       
    }
    public static void pinta_camino(Graphics2D g, int x1, int x2, int y2, int y1, Color co){
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke= new BasicStroke(3);
        
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(co);
        g.drawLine(x1+10, y1+10, x2+10, y2+10);
        
    }
    
   public static void seleccionaNodo(Graphics g, int x, int y, String n, Color co){
       ((Graphics2D)g).setColor(co);
       BasicStroke Stroke= new BasicStroke(2);
       ((Graphics2D)g).setStroke(Stroke);
       ((Graphics2D)g).fillOval(x, y, 15, 15);
       ((Graphics2D)g).setColor(Color.BLUE);
       ((Graphics2D)g).drawOval(x, y, 15, 15);
       
       
   } 
    
   
    
    



}
    //Luego se continuara
  