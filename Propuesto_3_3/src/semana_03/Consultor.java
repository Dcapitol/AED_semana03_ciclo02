package semana_03;

public class Consultor {
	private int codigo, hrsTrabajadas;
	private String nombre;
	private double tarifaxHora;
	
	private static int cantidadConsultores;
	private static double totalSueldoNeto;
	public static final double descAFP, descEPS;
	
	static {
		descAFP = 0.10;
		descEPS = 0.05;
		cantidadConsultores = 0;
		totalSueldoNeto = 0;
	}

	public Consultor(int codigo, int hrsTrabajadas, String nombre, double tarifaxHora) {
		super();
		this.codigo = codigo;
		this.hrsTrabajadas = hrsTrabajadas;
		this.nombre = nombre;
		this.tarifaxHora = tarifaxHora;
		cantidadConsultores++;
		totalSueldoNeto += SueldoNeto();
	}
	public Consultor(int codigo, int hrsTrabajadas, String nombre) {
		this(codigo,hrsTrabajadas,nombre,65.0);
	}
	public Consultor() {
		this(333,30,"Juan");
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getHrsTrabajadas() {
		return hrsTrabajadas;
	}
	public void setHrsTrabajadas(int hrsTrabajadas) {
		this.hrsTrabajadas = hrsTrabajadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTarifaxHora() {
		return tarifaxHora;
	}
	public void setTarifaxHora(double tarifaxHora) {
		this.tarifaxHora = tarifaxHora;
	}
	public static int getCantidadConsultores() {
		return cantidadConsultores;
	}
	public static void setCantidadConsultores(int cantidadConsultores) {
		Consultor.cantidadConsultores = cantidadConsultores;
	}
	public static double getTotalSueldoNeto() {
		return totalSueldoNeto;
	}
	public static void setTotalSueldoNeto(double totalSueldoNeto) {
		Consultor.totalSueldoNeto = totalSueldoNeto;
	}
	public double SueldoBruto() {
		return hrsTrabajadas * tarifaxHora;
	}
	public double descuentoAFP() {
		return SueldoBruto() * descAFP;
	}
	public double descuentoEPS() {
		return SueldoBruto() * descEPS;
	}
	public double SueldoNeto() {
		return SueldoBruto() - descuentoAFP() - descuentoEPS();
	}	
}
