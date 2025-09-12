package bingoPRO_LauraCespedesBerdonces;

import java.util.*;

public class Carton {
	
	private int[][] CARTON;
	
	private static final int FILAS = 3;
	
	private static final int COLUMNAS = 9;
	
	private boolean LINEA_1 = false;
	
	private boolean LINEA_2 = false;
	
	private boolean LINEA_3 = false;

	private String MENSAJE;
	
	public Carton() {
		CARTON = GENERAR_CARTON();
	}
	
	private int[][] GENERAR_CARTON() {
		
		int CARTON_GENERADO[][] = new int[COLUMNAS][FILAS];
		
		int NUMERO_REPETIDO_1 = 0;
		int NUMERO_REPETIDO_2 = 0;
		
		for(int COLUMNA = 0; COLUMNA<COLUMNAS; COLUMNA++) {
			for(int FILA = 0; FILA<FILAS; FILA++) {
				int NUMERO_ALEATORIO = NUMERO_ALEATORIO(COLUMNA, FILA);
				if (FILA == 0) {
					NUMERO_REPETIDO_1 = NUMERO_ALEATORIO;
				}
				if (FILA == 1) {
					do {
						NUMERO_ALEATORIO = NUMERO_ALEATORIO(COLUMNA, FILA);
					} while (NUMERO_ALEATORIO == NUMERO_REPETIDO_1);
					NUMERO_REPETIDO_2 = NUMERO_ALEATORIO;
				}
				if (FILA == 2) {
					do {
						NUMERO_ALEATORIO = NUMERO_ALEATORIO(COLUMNA, FILA);
					} while (NUMERO_ALEATORIO == NUMERO_REPETIDO_1 && NUMERO_ALEATORIO == NUMERO_REPETIDO_2);
				}
				CARTON_GENERADO[COLUMNA][FILA] = NUMERO_ALEATORIO;
			}
		}
		
		HUECOS_CARTON(CARTON_GENERADO);
		return CARTON_GENERADO;
	}
	
	private int NUMERO_ALEATORIO(int COLUMNA, int FILA) {
		Random random = new Random();
		
		int NUMERO_ALEATORIO = 0;
		
		if (COLUMNA==0) {
			int MAX = 9;
			int MIN = 1;
			NUMERO_ALEATORIO = random.nextInt(MAX - MIN + 1) + MIN;
		} else {
			int MAX = (10 * COLUMNA) + 9;
			int MIN = (10 * COLUMNA);
			NUMERO_ALEATORIO = random.nextInt(MAX - MIN + 1) + MIN;
		}
			
		return NUMERO_ALEATORIO;
	}
	
	private void HUECOS_CARTON(int[][] CARTON_GENERADO) {
		
		for(int FILA = 0; FILA<FILAS; FILA++) {
			int HUECOS = 3;
			for(int COLUMNA = 0; COLUMNA<COLUMNAS; COLUMNA++) {
				int RANDOM = (int)(Math.random() * 2);
				if (RANDOM == 1 && HUECOS != 0) {
					CARTON_GENERADO[COLUMNA][FILA] = -1;
					HUECOS--;
				}
				if (COLUMNA == 6 && HUECOS == 3) {
					CARTON_GENERADO[COLUMNA][FILA] = -1;
					HUECOS--;
				}
				if (COLUMNA == 7 && HUECOS == 2) {
					CARTON_GENERADO[COLUMNA][FILA] = -1;
					HUECOS--;
				}
				if (COLUMNA == 8 && HUECOS == 1) {
					CARTON_GENERADO[COLUMNA][FILA] = -1;
					HUECOS--;
				}

			}

		}
		
	}
	
	public void IMPRIMIR_CARTON() {
		
		System.out.println("╔═════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╦══════╗");
		for(int FILA=0;FILA<FILAS;FILA++)
		{
			for(int COLUMNA=0;COLUMNA <COLUMNAS; COLUMNA++)
	           {
				if (CARTON[COLUMNA][FILA]==-1) {
					if (COLUMNA==0) {
						if (COLUMNA==8) {
							System.out.print("║"+"  "+"#"+"  "+"║");
						} else {
							System.out.print("║"+"  "+"#"+"  ");
						}
					} else {
						if (COLUMNA==8) {
							System.out.print("║"+"  "+"##"+"  "+"║");
						} else {
							System.out.print("║"+"  "+"##"+"  ");
						}
					}
				} else {
					if (COLUMNA==8) {
						
						System.out.print("║"+"  " +CARTON[COLUMNA][FILA]+"  "+"║");

					} else {
							System.out.print("║"+"  " +CARTON[COLUMNA][FILA]+"  ");
					}
				}
					
			}
			
			System.out.println();
			if (FILA!=2) {
				System.out.println("╠═════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╬══════╣");
			}
			
	    }
		System.out.println("╚═════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╩══════╝");
	}
	
	public void REDIBUJAR_CARTON(int NUMERO_SORTEADO) {
		for(int FILA=0; FILA<FILAS; FILA++)
		{
			for(int COLUMNA=0; COLUMNA < COLUMNAS; COLUMNA++)
	           {
					if (CARTON[COLUMNA][FILA]==NUMERO_SORTEADO) {
						CARTON[COLUMNA][FILA] = 0;
					}
					
	           }
	    }
	}
	
	public boolean COMPROBAR_LINEA() {
    	for(int FILA=0;FILA < FILAS;FILA++)
		{
			int NUMERO=0;
			
			for(int COLUMNA=0;COLUMNA < COLUMNAS; COLUMNA++)
	           {
					if (CARTON[COLUMNA][FILA]==0) {
						NUMERO++;
					}
					if (NUMERO==6) {
						if (FILA==0 && LINEA_1 == false) {
							LINEA_1 = true;
							MENSAJE = "tiene la Linea 1";
							return true;
						}
						if (FILA==1 && LINEA_2 == false) {
							LINEA_2 = true;
							MENSAJE = "tiene la Linea 2";
							return true;
						}
						if (FILA==2 && LINEA_3 == false) {
							LINEA_3 = true;
							MENSAJE = "tiene la Linea 3";
							return true;
						}
					}
					
	           }
			
	    }
		return false;
    }
	
	public String DEVOLVER_MENSAJE() {
		return MENSAJE;
	}
	
	public boolean COMPROBAR_BINGO() {
		if (LINEA_1 == true && LINEA_2 == true && LINEA_3 == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean COMPROBAR_NUMERO(int NUMERO_COMPROBAR) {
		for(int FILA=0;FILA < FILAS;FILA++)
		{
			for(int COLUMNA=0;COLUMNA < COLUMNAS; COLUMNA++)
	           {
					if (CARTON[COLUMNA][FILA]==NUMERO_COMPROBAR) {
					return true;
	           }
			
	    }
		
    }
	return false;
	}
}
