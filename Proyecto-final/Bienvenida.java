//Proyecto Final

package proyectofinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Bienvenida extends JFrame implements ActionListener{
    
  public static String bandera = "";
  Font letra = new Font("Arial", Font.PLAIN,23);
    
  URL ruta1 = getClass().getResource("/proyectofinal/icon.png");
  URL ruta2 = getClass().getResource("/proyectofinal/logo-coca.png");
  
  ImageIcon imagen1 = new ImageIcon(ruta1);
  ImageIcon imagen2 = new ImageIcon(ruta2);
    
  private JLabel texto1, texto2, texto3, texto4;
  private JTextField espacio;
  private JButton boton;
    
  public Bienvenida(){
  
   setLayout(null);
   setTitle("Bienvenido");
   setIconImage(imagen1.getImage());
   
   texto1 = new JLabel("Sistema de Control Vacacional");
   texto1.setBounds(0,165,362,25);
   texto1.setForeground(Color.white);
   texto1.setHorizontalAlignment(JLabel.CENTER);
   texto1.setFont(letra);
   add(texto1);
   
   texto2 = new JLabel("Ingrese su nombre:");
   texto2.setBounds(35,230,150,25);
   texto2.setForeground(Color.white);
   add(texto2);
   
   texto3 = new JLabel("©2026 The Coca-Cola Company");
   texto3.setBounds(0,480,362,25);
   texto3.setForeground(Color.white);
   texto3.setHorizontalAlignment(JLabel.CENTER);
   add(texto3);
   
   texto4 = new JLabel(imagen2);
   texto4.setBounds(0,40,362,75);
   texto4.setHorizontalAlignment(JLabel.CENTER);
   add(texto4);
   
   boton = new JButton("Ingresar");
   boton.setBounds(136,300,90,30);
   boton.setForeground(Color.red);
   boton.setBackground(Color.white);
   add(boton);
   boton.addActionListener(this);
   
   espacio = new JTextField();
   espacio.setBounds(35,260,300,30);
   espacio.setBackground(new Color(220,220,220));
   espacio.setForeground(Color.red);
   espacio.setFont(espacio.getFont().deriveFont(Font.BOLD));
   add(espacio);
  
  }
  
  public void actionPerformed(ActionEvent evento){
      
    bandera = espacio.getText();
  
    if(evento.getSource() == boton){
    
      if(bandera.trim().equals("")){
      
        JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre");
        espacio.setText("");
      
      }else{
          
        Terminos terminos = new Terminos();
        terminos.setVisible(true);
        terminos.setBounds(0,0,715,560);
        terminos.setLocationRelativeTo(null);
        this.setVisible(false);
        terminos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      }
    }
  }
  
  public static void main (String args[]){
      
    Bienvenida ventana1 = new Bienvenida();
    ventana1.setBounds(0,0,380,560);
    ventana1.setLocationRelativeTo(null);
    ventana1.setResizable(false);
    ventana1.getContentPane().setBackground(Color.red);
    ventana1.setVisible(true);
    ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  }  
}