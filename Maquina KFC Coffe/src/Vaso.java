
public class Vaso {
int cantidadVasos;
int contenido;

public Vaso(int can, int con) {
	cantidadVasos = can;
	contenido = con;
}

 public void setCantidadVasos(int c) {
	cantidadVasos = c;
}
 
 public int getCantidadVasos() {
	   return cantidadVasos;
 }
 
 public void setContenido(int con) {
	 contenido = con;
 }
 
 public int getContenido() {
	 return contenido;
 }
 
 public boolean hasVasos(int canV) {
	 if (cantidadVasos>=canV) {
		 return true;
	 }else {
		 return false;
	 }	 
 }
 
 public void giveVasos(int canV) {
 cantidadVasos = cantidadVasos-canV; 
 }
}
