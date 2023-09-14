package semana_03;

public class Asesor {
	private int dni, codigo;
	private String nombreAsesor;
	private double remuneracionUSD;
	
	private static int cantidadAsesores;
	private static double sumaTotalRemun;
	public static final String nombreInsti;
	
	static{
		cantidadAsesores = 0;
		sumaTotalRemun = 0;
		nombreInsti = "Loquendo SRL";
	}

	public Asesor(int dni, int codigo, String nombreAsesor, double remuneracionUSD) {
		super();
		this.dni = dni;
		this.codigo = codigo;
		this.nombreAsesor = nombreAsesor;
		this.remuneracionUSD = remuneracionUSD;
		cantidadAsesores++;
		sumaTotalRemun+=remuneracionUSD;
	}
	public Asesor(int dni, String nombreAsesor) {
		this(dni, 55555, nombreAsesor, 2000.0);
	}
	public Asesor() {
		this(88888888,"NN");
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreAsesor() {
		return nombreAsesor;
	}
	public void setNombreAsesor(String nombreAsesor) {
		this.nombreAsesor = nombreAsesor;
	}
	public double getRemuneracionUSD() {
		return remuneracionUSD;
	}
	public void setRemuneracionUSD(double remuneracionUSD) {
		this.remuneracionUSD = remuneracionUSD;
	}
	public static int getCantidadAsesores() {
		return cantidadAsesores;
	}
	public static void setCantidadAsesores(int cantidadAsesores) {
		Asesor.cantidadAsesores = cantidadAsesores;
	}
	public static double getSumaTotalRemun() {
		return sumaTotalRemun;
	}
	public static void setSumaTotalRemun(double sumaTotalRemun) {
		Asesor.sumaTotalRemun = sumaTotalRemun;
	}
	
	
	
}
