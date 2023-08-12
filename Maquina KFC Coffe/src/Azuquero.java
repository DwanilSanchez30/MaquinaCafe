
public class Azuquero {
int cantidadDeAzucar;

public Azuquero(int c) {
	cantidadDeAzucar = c;
}

public void setCantidadDeAzucar(int can) {
	cantidadDeAzucar = can;
}

public int getCantidadDeAzucar() {
	return cantidadDeAzucar;
}

public boolean hasAzucar(int can) {
	if (cantidadDeAzucar>=can) {
		 return true;
	 }else {
		 return false;
	 }	 
}

public void giveAzucar(int can) {
	cantidadDeAzucar = cantidadDeAzucar-can; 
	 }

}
