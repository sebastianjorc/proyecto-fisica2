PImage background;   // DECLARO IMAGEN DE FONDO
color boton, letra;  // DECLARO COLOR DE BOTONES Y TEXTOS
float xPosParticula, yPosParticula, xVelocidad, yVelocidad; // DECLARO POSICIÓN DE PARTICULA
int xBotonRest,yBotonRest, diametroBotonRest;  // DECLARO BOTON DE RESTAURACIÓN
int opcion;  float [] datos = {1.0, -1.2};//   String [] titulo;

/*  MAIN | BASE DEL CÓDIGO  */ 
void setup (){
  size (900,600);       // ASIGNO VENTANA
  background = loadImage ("background.jpg");  // ASIGNO IMAGEN DE FONDO
  boton=color(246,228,174);  letra=color(0);  // ASIGNO COLORES A BOTÓN Y TEXTOS
  xBotonRest=15;  yBotonRest=105;  diametroBotonRest=30;  // ASIGNO VALORES AL BOTÓN DE RESTAURACIÓN
  xPosParticula=18;  yPosParticula=300;  yVelocidad=xVelocidad=0.0;  // ASIGNO VALORES A LA PARTICULA  
  opcion=0;  datos[0]=1.0;  datos[1]=-1.0;  // ASIGNO VALORES AL ARREGLO (CONTIENE VALORES DE CAMPO SUPERIOR E INFERIOR)
}

/*  FUNCIÓN DRAW | ESTA FUNCIÓN REPRODUCE FRAME A FRAME LO ESCRITO EN ELLA MEDIANTE LA VENTANA  */
void draw (){
  image (background,-7,-6); // UBICO IMAGEN EN EL FONDO
  rect(0,300,900,0);        // DIBUJO LA RECTA EN EL EJE X
  
  fill (boton);  ellipse(xBotonRest,yBotonRest,diametroBotonRest,diametroBotonRest);  // UBITO BOTÓN 'R' EN LA VENTANA.
  fill (letra);  text("R",xBotonRest-4,yBotonRest+5);  text("Campo superio: " +datos[0],6,22);  text("Campo inferior: " +datos[1],6,584);  // UBICO TODOS LOS TEXTOS DE LA VENTANA
  fill (30,45,145);  ellipse(xPosParticula,yPosParticula,16,16);   // UBICO LA PARTICULA EN LA VENTANA
}

/*   FUNCIÓN keyPressed | ESTA FUNCIÓN SE ACTIVA CADA VEZ QUE SE APRIETA UNA TECLA  */ //<>//
void keyPressed(){
  if (keyCode==UP)   if (datos[1]+1< 1.0 || opcion!=1) datos[opcion]++;  // SI PRECIONO LA FECHA HACIA ARRIBA, EL CAMPO SELECCIONADO AUMENTA UNO
  if (keyCode==DOWN) if (datos[0]-1>-1.0 || opcion!=0) datos[opcion]--;  // SI PRECIONO LA FLECHA HACIA ABAJO, EL CAMPO SELECCIONADO DISMINUYE UNO
  if (keyCode==LEFT) {       opcion=0;}  // SELECCIÓNO EL CAMPO SUPERIOR (POSITIVO)
  if (keyCode==RIGHT){       opcion=1;}  // SELECCIONO EL CAMPO INFERIOR (NEGATIVO)
  if (keyCode==' '){  // SI PRECIOSO LA BARRA ESPACIO.. LA PARTICULA SE MOVERÁ SIEMPRE Y CUANDO NO ESTÉ EN UNO DE LOS EXTREMOS DE LA VENTANA
       if (yPosParticula>=0 && yPosParticula<height-10 && xPosParticula<width-20 && yPosParticula>20){ 
          xVelocidad=xVelocidad+0.4;
          xPosParticula=xPosParticula+xVelocidad;
      
          yVelocidad=yVelocidad-((datos[0]+datos[1])/10);
          yPosParticula=yPosParticula+yVelocidad;
       }
  }  
}

/*  FUNCIÓN mousePressed | ESTA FUNCIÓN SE ACTIVA CADA VEZ QUE SE PRESIONA UNA TECLA DEL MOUSE  */
void mousePressed(){
  float distanciaConMouse=dist(mouseX, mouseY, xBotonRest, yBotonRest);  //  CREO VARIABLE CON LOS VALORES ENTRE 'R' Y LA POSICIÓN DEL MOUSE DONDE SE CLIQUE
  if (distanciaConMouse<(diametroBotonRest/2)){  // SI LA POSICIÓN DEL MOUSE DONDE CLIQUEAS ESTÁ DENTRO DEL BOTÓN R, SE REINICIAN LOS VALORES DE LA PARTICULA
    xPosParticula=18;  yPosParticula=300;  yVelocidad=xVelocidad=0.0;
  }
}