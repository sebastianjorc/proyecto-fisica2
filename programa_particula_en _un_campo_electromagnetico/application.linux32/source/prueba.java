import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class prueba extends PApplet {

PImage background;   // DECLARO IMAGEN DE FONDO
int boton, letra;  // DECLARO COLOR DE BOTONES Y TEXTOS
float xPosParticula, yPosParticula, xVelocidad, yVelocidad; // DECLARO POSICI\u00d3N DE PARTICULA
int xBotonRest,yBotonRest, diametroBotonRest;  // DECLARO BOTON DE RESTAURACI\u00d3N
int opcion;  float [] datos = {1.0f, -1.2f};//   String [] titulo;

/*  MAIN | BASE DEL C\u00d3DIGO  */ 
public void setup (){
         // ASIGNO VENTANA
  background = loadImage ("background.jpg");  // ASIGNO IMAGEN DE FONDO
  boton=color(246,228,174);  letra=color(0);  // ASIGNO COLORES A BOT\u00d3N Y TEXTOS
  xBotonRest=15;  yBotonRest=105;  diametroBotonRest=30;  // ASIGNO VALORES AL BOT\u00d3N DE RESTAURACI\u00d3N
  xPosParticula=18;  yPosParticula=300;  yVelocidad=xVelocidad=0.0f;  // ASIGNO VALORES A LA PARTICULA  
  opcion=0;  datos[0]=1.0f;  datos[1]=-1.0f;  // ASIGNO VALORES AL ARREGLO (CONTIENE VALORES DE CAMPO SUPERIOR E INFERIOR)
}

/*  FUNCI\u00d3N DRAW | ESTA FUNCI\u00d3N REPRODUCE FRAME A FRAME LO ESCRITO EN ELLA MEDIANTE LA VENTANA  */
public void draw (){
  image (background,-7,-6); // UBICO IMAGEN EN EL FONDO
  rect(0,300,900,0);        // DIBUJO LA RECTA EN EL EJE X
  
  fill (boton);  ellipse(xBotonRest,yBotonRest,diametroBotonRest,diametroBotonRest);  // UBITO BOT\u00d3N 'R' EN LA VENTANA.
  fill (letra);  text("R",xBotonRest-4,yBotonRest+5);  text("Campo superio: " +datos[0],6,22);  text("Campo inferior: " +datos[1],6,584);  // UBICO TODOS LOS TEXTOS DE LA VENTANA
  fill (30,45,145);  ellipse(xPosParticula,yPosParticula,16,16);   // UBICO LA PARTICULA EN LA VENTANA
}

/*   FUNCI\u00d3N keyPressed | ESTA FUNCI\u00d3N SE ACTIVA CADA VEZ QUE SE APRIETA UNA TECLA  */ //<>//
public void keyPressed(){
  if (keyCode==UP)   if (datos[1]+1< 1.0f || opcion!=1) datos[opcion]++;  // SI PRECIONO LA FECHA HACIA ARRIBA, EL CAMPO SELECCIONADO AUMENTA UNO
  if (keyCode==DOWN) if (datos[0]-1>-1.0f || opcion!=0) datos[opcion]--;  // SI PRECIONO LA FLECHA HACIA ABAJO, EL CAMPO SELECCIONADO DISMINUYE UNO
  if (keyCode==LEFT) {       opcion=0;}  // SELECCI\u00d3NO EL CAMPO SUPERIOR (POSITIVO)
  if (keyCode==RIGHT){       opcion=1;}  // SELECCIONO EL CAMPO INFERIOR (NEGATIVO)
  if (keyCode==' '){  // SI PRECIOSO LA BARRA ESPACIO.. LA PARTICULA SE MOVER\u00c1 SIEMPRE Y CUANDO NO EST\u00c9 EN UNO DE LOS EXTREMOS DE LA VENTANA
       if (yPosParticula>=0 && yPosParticula<height-10 && xPosParticula<width-20 && yPosParticula>20){ 
          xVelocidad=xVelocidad+0.4f;
          xPosParticula=xPosParticula+xVelocidad;
      
          yVelocidad=yVelocidad-((datos[0]+datos[1])/10);
          yPosParticula=yPosParticula+yVelocidad;
       }
  }  
}

/*  FUNCI\u00d3N mousePressed | ESTA FUNCI\u00d3N SE ACTIVA CADA VEZ QUE SE PRESIONA UNA TECLA DEL MOUSE  */
public void mousePressed(){
  float distanciaConMouse=dist(mouseX, mouseY, xBotonRest, yBotonRest);  //  CREO VARIABLE CON LOS VALORES ENTRE 'R' Y LA POSICI\u00d3N DEL MOUSE DONDE SE CLIQUE
  if (distanciaConMouse<(diametroBotonRest/2)){  // SI LA POSICI\u00d3N DEL MOUSE DONDE CLIQUEAS EST\u00c1 DENTRO DEL BOT\u00d3N R, SE REINICIAN LOS VALORES DE LA PARTICULA
    xPosParticula=18;  yPosParticula=300;  yVelocidad=xVelocidad=0.0f;
  }
}
  public void settings() {  size (900,600); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "prueba" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
