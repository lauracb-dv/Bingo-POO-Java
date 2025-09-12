package bingoPRO_LauraCespedesBerdonces;

public class Jugador {
	
	private Carton CARTON;
	
	private String NOMBRE;
	
	public Jugador() {
		
		this.CARTON = new Carton();
		this.NOMBRE = "";
	}
	
	public Jugador(String NOMBRE) {
		
		this.CARTON = new Carton();
		this.NOMBRE = NOMBRE;
	}
	
	public String getNombre() {
		return NOMBRE;
	}
	
	public void setNombre(String NOMBRE) {
		this.NOMBRE = NOMBRE;
	}
	
	public void getCarton() {
		this.CARTON.IMPRIMIR_CARTON();
	}
	
	public void REDIBUJAR_CARTON(int NUMERO_SORTEADO) {
		this.CARTON.REDIBUJAR_CARTON(NUMERO_SORTEADO);
	}
	
	public boolean COMPROBAR_LINEA() {
		return this.CARTON.COMPROBAR_LINEA();
	}
	
	public String MENSAJE_LINEA() {
		return this.CARTON.DEVOLVER_MENSAJE();
	}
	
	public boolean COMPROBAR_BINGO() {
		return this.CARTON.COMPROBAR_BINGO();
	}
	
	public boolean COMPROBAR_NUMERO(int NUMERO_COMPROBAR) {
		return this.CARTON.COMPROBAR_NUMERO(NUMERO_COMPROBAR);
	}

}
