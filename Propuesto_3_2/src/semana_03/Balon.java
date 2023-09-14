package semana_03;

public class Balon {
	private String marca;
	private double peso, presion, diametro, precio;
	
	private static int cantidadBalones;
	private static double totalImportesPagar;
	public static final double pi, descuento;
	
	static {
		cantidadBalones = 0;
		totalImportesPagar = 0;
		pi = 3.1416;
		descuento = 0.05;
	}

	public Balon(String marca, double peso, double presion, double diametro, double precio) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.presion = presion;
		this.diametro = diametro;
		this.precio = precio;
		cantidadBalones++;
		totalImportesPagar += ImportePagar();
	}
	public Balon(String marca, double peso, double presion) {
		this(marca, peso, presion, 18.5, 100.0);
	}
	public Balon() {
		this("Adidas", 1.5, 4.8);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPresion() {
		return presion;
	}
	public void setPresion(double presion) {
		this.presion = presion;
	}
	public double getDiametro() {
		return diametro;
	}
	public void setDiametro(double diametro) {
		this.diametro = diametro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public static int getCantidadBalones() {
		return cantidadBalones;
	}
	public static void setCantidadBalones(int cantidadBalones) {
		Balon.cantidadBalones = cantidadBalones;
	}
	public static double getTotalImportesPagar() {
		return totalImportesPagar;
	}
	public static void setTotalImportesPagar(double totalImportesPagar) {
		Balon.totalImportesPagar = totalImportesPagar;
	}
	
	public double Radio() {
		return diametro/2;
	}
	public double VolumenBalon() {
		return 4 * pi * Radio() * Radio() * Radio() / 3;
	}
	public double descuento() {
		return precio*descuento;
	}
	public double ImportePagar() {
		return precio - descuento();
	}
}
