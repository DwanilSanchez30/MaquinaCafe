
public class Cafetera {
int cantidadCafe;

public Cafetera(int can) {
	cantidadCafe = can;
}

public void setCantidadDeCafe(int c) {
	cantidadCafe = c;
}

public int getCantidadDeCafe() {
	 return cantidadCafe;
}

public boolean hasCafe(int can) {
	if (cantidadCafe>=can) {
		 return true;
	 }else {
		 return false;
	 }	 
}

public void giveCafe(int can) {
	cantidadCafe = cantidadCafe-can; 
	 }
}
