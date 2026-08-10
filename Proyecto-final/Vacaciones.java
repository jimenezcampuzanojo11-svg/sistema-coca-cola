//Proyecto Final

package proyectofinal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class Vacaciones extends JFrame implements ActionListener{
    
  int i = 0;
    
  String a = "", b = "", c = "", d = "", e = "";
  String arreglo[] = new String[5];
    
  URL ruta1 = getClass().getResource("/proyectofinal/icon.png");
  URL ruta2 = getClass().getResource("/proyectofinal/logo-coca.png");
  
  ImageIcon imagen1 = new ImageIcon(ruta1);
  ImageIcon imagen2 = new ImageIcon(ruta2);
    
  private JLabel tex1, tex2, tex3, tex4, tex5, tex6, tex7, tex8, tex9, imagen;
  private JTextField espacio1, espacio2, espacio3;
  private JScrollPane flechas;
  private JTextArea area;
  
  private JComboBox combo1, combo2;
  private JMenuBar barra;
  private JMenu menu1, menu2, menu3, menu4;
  private JMenuItem item1, item2, item3, item4, item5, item6, item7;
  
  public Vacaciones(){
      
   setLayout(null);
   setTitle("Pantalla principal");
   setIconImage(imagen1.getImage());
  
   tex1 = new JLabel("Bienvenido "+Bienvenida.bandera);
   tex1.setBounds(300,75,450,35);
   tex1.setForeground(Color.white);
   tex1.setFont(new Font("Arial", Font.BOLD, 35));
   add(tex1);
   
   tex2 = new JLabel("Datos del trabajador para el cálculo de vacaciones");
   tex2.setBounds(0,180,782,25);
   tex2.setForeground(Color.white);
   tex2.setFont(new Font("Arial", Font.BOLD, 25));
   tex2.setHorizontalAlignment(JLabel.CENTER);
   add(tex2);
   
   tex3 = new JLabel("Nombre completo:");
   tex3.setBounds(30,230,110,25);
   tex3.setForeground(Color.white);
   add(tex3);
   
   tex4 = new JLabel("Apellido Paterno:");
   tex4.setBounds(30,300,110,25);
   tex4.setForeground(Color.white);
   add(tex4);
   
   tex5 = new JLabel("Apellido Materno:");
   tex5.setBounds(30,370,110,25);
   tex5.setForeground(Color.white);
   add(tex5);
   
   tex6 = new JLabel("Selecciona el Departamento:");
   tex6.setBounds(230,230,170,25);
   tex6.setForeground(Color.white);
   add(tex6);
   
   tex7 = new JLabel("Selecciona la Antigüedad:");
   tex7.setBounds(230,300,160,25);
   tex7.setForeground(Color.white);
   add(tex7);
   
   tex8 = new JLabel("Resultado del Cálculo:");
   tex8.setBounds(230,370,150,25);
   tex8.setForeground(Color.white);
   add(tex8);
   
   tex9 = new JLabel("©2026 The Coca-Cola Company | Todos los derechos reservados");
   tex9.setBounds(0,550,782,25);
   tex9.setForeground(Color.white);
   tex9.setHorizontalAlignment(JLabel.CENTER);
   add(tex9);
   
   imagen = new JLabel(imagen2);
   imagen.setBounds(30,50,240,80);
   add(imagen);
   
   espacio1 = new JTextField();
   espacio1.setBounds(30,255,150,30);
   espacio1.setBackground(new Color(220,220,220));
   espacio1.setForeground(Color.red);
   espacio1.setFont(espacio1.getFont().deriveFont(Font.BOLD));
   add(espacio1);
   
   espacio2 = new JTextField();
   espacio2.setBounds(30,325,150,30);
   espacio2.setBackground(new Color(220,220,220));
   espacio2.setForeground(Color.red);
   espacio2.setFont(espacio2.getFont().deriveFont(Font.BOLD));
   add(espacio2);
   
   espacio3 = new JTextField();
   espacio3.setBounds(30,395,150,30);
   espacio3.setBackground(new Color(220,220,220));
   espacio3.setForeground(Color.red);
   espacio3.setFont(espacio3.getFont().deriveFont(Font.BOLD));
   add(espacio3);
   
   area = new JTextArea("\n"+"  Aquí aparece el cálculo de las vacaciones.");
   area.setEditable(false);
   area.setBackground(new Color(220,220,220));
   area.setForeground(Color.red);
   flechas = new JScrollPane(area);
   flechas.setBounds(230,395,520,125);
   add(flechas);
   
   combo1 = new JComboBox();
   combo1.setBounds(230,255,200,30);
   combo1.setBackground(new Color(220,220,220));
   combo1.setForeground(Color.red);
   add(combo1);
   
   combo1.addItem("");
   combo1.addItem("Atención al Cliente");
   combo1.addItem("Departamento de Logística");
   combo1.addItem("Departamento de Gerencia");
   
   combo2 = new JComboBox();
   combo2.setBounds(230,325,200,30);
   combo2.setBackground(new Color(220,220,220));
   combo2.setForeground(Color.red);
   add(combo2);
   
   combo2.addItem("");
   combo2.addItem("1 año de servicio");
   combo2.addItem("2 a 6 años de servicio");
   combo2.addItem("7 años o más de servicio");
   
   barra = new JMenuBar();
   barra.setBackground(Color.red);
   setJMenuBar(barra);
   
   menu1 = new JMenu("Opciones");
   menu1.setForeground(Color.white);
   barra.add(menu1);
   
   menu2 = new JMenu("Calcular");
   menu2.setForeground(Color.white);
   barra.add(menu2);
   
   menu3 = new JMenu("Acerca de");
   menu3.setForeground(Color.white);
   barra.add(menu3);
   
   menu4 = new JMenu("Color de fondo");
   menu4.setForeground(Color.red);
   menu1.add(menu4);
   
   item1 = new JMenuItem("Nuevo");
   item1.setForeground(Color.red);
   menu1.add(item1);
   item1.addActionListener(this);
   
   item2 = new JMenuItem("Salir");
   item2.setForeground(Color.red);
   menu1.add(item2);
   item2.addActionListener(this);
   
   item3 = new JMenuItem("Vacaciones");
   item3.setForeground(Color.red);
   menu2.add(item3);
   item3.addActionListener(this);
   
   item4 = new JMenuItem("El creador");
   item4.setForeground(Color.red);
   menu3.add(item4);
   item4.addActionListener(this);
   
   item5 = new JMenuItem("Rojo");
   item5.setForeground(Color.red);
   menu4.add(item5);
   item5.addActionListener(this);
   
   item6 = new JMenuItem("Negro");
   item6.setForeground(Color.red);
   menu4.add(item6);
   item6.addActionListener(this);
   
   item7 = new JMenuItem("Morado");
   item7.setForeground(Color.red);
   menu4.add(item7);
   item7.addActionListener(this);
  
  }
  
  public void actionPerformed(ActionEvent evento){
      
    if(evento.getSource() == item1){
    
      espacio1.setText("");
      espacio2.setText("");
      espacio3.setText("");
      area.setText("\n"+"  Aquí aparece el cálculo de las vacaciones.");
      combo1.setSelectedIndex(0);
      combo2.setSelectedIndex(0);
      
    }
    
    if(evento.getSource() == item2){
    
      Bienvenida bienvenida = new Bienvenida();
      bienvenida.setBounds(0,0,380,560);
      bienvenida.setLocationRelativeTo(null);
      bienvenida.getContentPane().setBackground(Color.red);
      
      bienvenida.setVisible(true);
      bienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(false);
    
    }
      
    if(evento.getSource() == item3){
        
      a = espacio1.getText();
      b = espacio2.getText();
      c = espacio3.getText();
      d = combo1.getSelectedItem().toString();
      e = combo2.getSelectedItem().toString();
      
      arreglo[0] = a;
      arreglo[1] = b;
      arreglo[2] = c;
      arreglo[3] = d;
      arreglo[4] = e;
      
      for(i = 0; i < 5; i++){
          
        if(!arreglo[i].trim().equals("")){
            
        }else{
            
          i = i + 5;
        }   
      }
      
      if(i == 5){
      
        if(d.equals("Atención al Cliente")){
          
          if(e.equals("1 año de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en "+d+" con "+e+"\n"+"   recibe 6 días de vacaciones.");
        
          }else if(e.equals("2 a 6 años de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en "+d+" con "+e+"\n"+"   recibe 14 días de vacaciones.");
        
          }else if(e.equals("7 años o más de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en "+d+" con "+e+"\n"+"   recibe 20 días de vacaciones.");
        
          }else{}
      
        }else if(d.equals("Departamento de Logística")){
      
          if(e.equals("1 año de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 7 días de vacaciones.");
        
          }else if(e.equals("2 a 6 años de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 15 días de vacaciones.");
        
          }else if(e.equals("7 años o más de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 22 días de vacaciones.");
        
          }else{}
      
        }else if(d.equals("Departamento de Gerencia")){
          
          if(e.equals("1 año de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 10 días de vacaciones.");
        
          }else if(e.equals("2 a 6 años de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 20 días de vacaciones.");
        
          }else if(e.equals("7 años o más de servicio")){
        
            area.setText("\n"+"   El trabajador "+a+" "+b+" "+c+"\n"+
            "   quien labora en el "+d+" con "+e+"\n"+"   recibe 30 días de vacaciones.");
        
          }else{}
      
        }else{}
        
      }else{
      
        JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos.");
      
      } 
    }
    
    if(evento.getSource() == item4){
    
      JOptionPane.showMessageDialog(null, 
      "Desarrollado por Joshua Jimenez Campuzano"+"\n"+
      "       www.youtube.com/ErnestoPerezM");
    }
  
    if(evento.getSource() == item5){
        
      this.getContentPane().setBackground(Color.red);
    }
    
    if(evento.getSource() == item6){
        
      this.getContentPane().setBackground(Color.black);
    }
    
    if(evento.getSource() == item7){
        
      this.getContentPane().setBackground(new Color(75,0,130));
    }
  }
  
  public static void main (String args[]){
  
    Vacaciones ventana3 = new Vacaciones();
    ventana3.setBounds(0,0,800,650);
    ventana3.setLocationRelativeTo(null);
    ventana3.setResizable(false);
    ventana3.getContentPane().setBackground(Color.red);
    ventana3.setVisible(true);
    ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  } 
}