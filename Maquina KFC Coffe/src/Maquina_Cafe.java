import java.util.Scanner;
public class Maquina_Cafe {


	static Vaso vasosPequeño;
	static Vaso vasoMediano;
	static Vaso vasoGrande;
	static Cafetera cafetera;
	static Azuquero azuquero;
	private static Scanner scan;
	public static String nombreCliente;

	
public void setCafetera(Cafetera cafe) {
	cafetera = cafe;
}

public void setVasosPequeño(Vaso vasoP) {
	 vasosPequeño = vasoP;
}

public void setVasosMediano(Vaso vasoM) {
	 vasoMediano = vasoM;
}

public void setVasosGrande(Vaso vasoG) {
	 vasoGrande = vasoG;
}

public void setAzuquero(Azuquero az) {
	azuquero = az;
}

	public static void main(String[] args) {
		
		
		Cafetera cafetera = new Cafetera(50);
		Maquina_Cafe maquinaDeCafe = new Maquina_Cafe();
		Vaso vasoPequeño = new Vaso(5,10);
		Vaso vasoMediano = new Vaso(5,20);
		Vaso vasoGrande = new Vaso(5,30);
		Azuquero azucar= new Azuquero(5);
		maquinaDeCafe.setVasosPequeño(vasoPequeño);
		maquinaDeCafe.setVasosMediano(vasoMediano);
		maquinaDeCafe.setVasosGrande(vasoGrande);
		maquinaDeCafe.setCafetera(cafetera);
		maquinaDeCafe.setAzuquero(azucar);
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("╔═══════════════════════════════════════╗");
	        System.out.println("║       ¡Bienvenido/a! a KFC Coffe      ║");
	        System.out.println("╚═══════════════════════════════════════╝");
	        
	        System.out.print("¿Con quién tengo el placer?: ");
	        String nombreCliente = scan.nextLine();
	        
	        System.out.println("\nEntendido, será un placer atenderle, " + nombreCliente + ".");

	        System.out.println("╔═════════════════════════════════════════════════════╗");
	        System.out.print("║Por favor, Ingrese el tipo de vaso, sr/a " + nombreCliente + ":     ║");
	        System.out.println("\n╚═════════════════════════════════════════════════════╝");
	        String tipoVaso = scan.nextLine();
	        Vaso va = getTipoVaso(tipoVaso);

	        System.out.println("╔══════════════════════════════════════════════════════════╗");
	        System.out.print("║Por favor, Ingrese la cantidad de vasos, sr/a " + nombreCliente + ":     ║");
	        System.out.println("\n╚══════════════════════════════════════════════════════════╝");
	        int canva = Integer.parseInt(scan.nextLine());

	        System.out.println("╔═══════════════════════════════════════════════════════════╗");
	        System.out.print("║Por favor, Ingrese la cantidad de azúcar, sr/a " + nombreCliente + ":     ║");
	        System.out.println("\n╚═══════════════════════════════════════════════════════════╝");
	        int cana = Integer.parseInt(scan.nextLine());
	        String out = getVasoDeCafe(va, canva, cana);
	        System.out.println("");

		
		
	}

	public static Vaso getTipoVaso(String tipoDeVaso) {
		
		if (tipoDeVaso == "pequeño") {
			return vasosPequeño;
		}else if (tipoDeVaso == "mediano") {
			return vasoMediano;
		}else {
			return vasoGrande;
		}
		
	}
	
	public static String getVasoDeCafe(Vaso tipoDevaso,int cantidadDeVasos, int cantidadDeAzucar) {
		
		
		
		if (tipoDevaso.getCantidadVasos()<cantidadDeVasos) {
			return "Disculpe, No hay Vasos";	
		}
		
		else if (tipoDevaso.getContenido() > cafetera.getCantidadDeCafe()) {
			return "Disculpe, No hay Cafe";
		}
		
		else if (cantidadDeAzucar > azuquero.getCantidadDeAzucar()) {
			return "Disculpe, No hay Azucar";
		}else {
			tipoDevaso.giveVasos(cantidadDeVasos);
			System.out.println(""+cantidadDeVasos);
			int contenido = tipoDevaso.getContenido();
			int cantidad = cantidadDeVasos;
			int cantidadCafe = contenido * cantidad;
			System.out.println(contenido+","+cantidad);
			cafetera.giveCafe(cantidadCafe);
			azuquero.giveAzucar(cantidadDeAzucar);
			System.out.println(""+cantidadDeAzucar);
			System.out.println(""+cantidadCafe);
			
			
			
			return "Felicidades, aqui tiene su café solicitado!";
		}
		
		
		
	}
	
	public int getCafetera() {
		return cafetera.getCantidadDeCafe();
	}
	
	public int getAzuquero() {
		return azuquero.getCantidadDeAzucar();
	}
	
	
	
}
