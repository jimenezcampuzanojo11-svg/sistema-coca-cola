//Proyecto Final

package proyectofinal;

import javax.swing.*;
import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Terminos extends JFrame implements ChangeListener, ActionListener{
    
  URL ruta1 = getClass().getResource("/proyectofinal/icon.png");
  URL ruta2 = getClass().getResource("/proyectofinal/coca-cola.png");
  
  ImageIcon imagen1 = new ImageIcon(ruta1);
  ImageIcon imagen2 = new ImageIcon(ruta2);
    
  private JLabel texto, imagen;
  private JButton boton1, boton2;
  private JCheckBox check;
  private JTextArea area;
  private JScrollPane flecha;
  
  public Terminos(){
  
   setLayout(null);
   setTitle("Lincecia de uso");
   setIconImage(imagen1.getImage());
   
   texto = new JLabel("TÉRMINOS Y CONDICIONES");
   texto.setBounds(0,20,697,30);
   texto.setFont(new Font("Arial",Font.BOLD,18));
   texto.setHorizontalAlignment(JLabel.CENTER);
   add(texto);
   
   imagen = new JLabel(imagen2);
   imagen.setBounds(450,380,235,85);
   add(imagen);
   
   boton1 = new JButton("Continua");
   boton1.setBounds(13,420,100,27);
   boton1.setEnabled(false);
   add(boton1);
   boton1.addActionListener(this);
   
   boton2 = new JButton("No Acepto");
   boton2.setBounds(130,420,100,27);
   add(boton2);
   boton2.addActionListener(this);
   
   check = new JCheckBox("Yo "+Bienvenida.bandera+" acepto");
   check.setBounds(13,380,300,25);
   check.setFont(check.getFont().deriveFont(Font.BOLD));
   check.addChangeListener(this);
   add(check);
   
   area = new JTextArea("\n"+"\n"+" TÉRMINOS Y CONDICIONES"+"\n"+
   "\n"+"    A. PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE JIMENEZ CAMPUZANO JOSHUA."+
   "\n"+"    B. PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS."+
   "\n"+"    C. JIMENEZ CAMPUZANO JOSHUA NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE."+"\n"+
   "\n"+"   LOS ACUERDOS LEGALES EXPUESTOS A CONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE"+
   "\n"+"   (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR JOSHUA), NO SE RESPONSABILIZAN DEL USO QUE USTED"+
   "\n"+"   HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TÉRMINOS HAGA CLIC EN (ACEPTO)"+
   "\n"+"   SI USTED NO ACEPTA ESTOS TÉRMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE."+"\n"+
   "\n"+"   PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE"+
   "\n"+"   http://www.youtube.com/ernestoperezm");
   
   area.setEditable(false);
   flecha = new JScrollPane(area);
   flecha.setBounds(13,80,676,280);
   add(flecha);
  
  }
  
  public void stateChanged(ChangeEvent evento){
  
    if(check.isSelected() == true){
    
      boton1.setEnabled(true);
      boton2.setEnabled(false);
    
    }else{
    
      boton1.setEnabled(false);
      boton2.setEnabled(true);
    
    }
  }
  
  public void actionPerformed(ActionEvent evento){
  
    if(evento.getSource() == boton1){
    
      Vacaciones vacaciones = new Vacaciones();
      vacaciones.setBounds(0,0,800,650);
      vacaciones.setLocationRelativeTo(null);
      
      vacaciones.getContentPane().setBackground(Color.red);
      vacaciones.setVisible(true);
      vacaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    
    if(evento.getSource() == boton2){
    
      Bienvenida bienvenida = new Bienvenida();
      bienvenida.setBounds(0,0,380,560);
      bienvenida.setLocationRelativeTo(null);
      
      bienvenida.getContentPane().setBackground(Color.red);
      bienvenida.setVisible(true);
      bienvenida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    this.setVisible(false);
  }
  
  public static void main(String args[]){

    Terminos ventana2 = new Terminos();
    ventana2.setBounds(0,0,715,560);
    ventana2.setLocationRelativeTo(null);
    ventana2.setResizable(false);
    ventana2.setVisible(true);
    ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
  } 
}