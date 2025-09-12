package bingoPRO_LauraCespedesBerdonces;

import java.util.*;

public class Bingo {
	
	private List<Jugador> JUGADORES = new ArrayList<>();
	
    private Set<Integer> NUMEROS_SORTEADOS = new HashSet<>();
    
    private int NUMERO_SORTEADO;
    
    private boolean JUEGO_BINGO = true;
    
    public Bingo() {
    	
    }
    
    public void BINGO() {
    	INICIAR_BINGO();
    }
    
    private void INICIAR_BINGO() {
    	Scanner lectura = new Scanner (System.in);
    	boolean INICIAR_BINGO = true;
    	int TECLADO;
    	
    	do {
    		System.out.println("####################################");
    		System.out.println("#            BINGO PRO             #");
    		System.out.println("####################################");
    		System.out.println("# INTRODUCE EL NUMERO DE JUGADORES #");
    		System.out.println("####################################");
    		System.out.println();
    		
    		do {
    			TECLADO = lectura.nextInt();
    		} while (TECLADO<0 && TECLADO>10);
    		
    		for (int i=1; i<=TECLADO; i++) {
    			System.out.println("# INTRODUCE EL NOMBRE DEL JUGADOR NUMERO " + i + " #");
        		System.out.println("####################################");
    			String NOMBRE_JUGADOR = lectura.next();
    			AGREGAR_JUGADOR(NOMBRE_JUGADOR);
    		}
    		
    		System.out.println("#         COMIENZA EL BINGO        #");
    		System.out.println("####################################");
    		
    		JUEGO_BINGO();
    		INICIAR_BINGO = false;
    		
    	} while (INICIAR_BINGO == true);
    }
    
    private void JUEGO_BINGO() {
    	
    	for (Jugador Jugador : JUGADORES) {
                try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            	System.out.println("JUGADOR: " + Jugador.getNombre());
            	Jugador.getCarton();
    	}
    	
    	do {
    		try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
    		SORTEAR_NUMERO();
    		System.out.println("SALE EL NUMERO: " + NUMERO_SORTEADO);
    		System.out.println();
    		for (Jugador Jugador : JUGADORES) {
    			if (Jugador.COMPROBAR_NUMERO(NUMERO_SORTEADO)==true) {
    				System.out.println("El jugador " + Jugador.getNombre() + " tiene el numero " + NUMERO_SORTEADO);
    				System.out.println();
    			}
    			Jugador.REDIBUJAR_CARTON(NUMERO_SORTEADO);
                CANTAR_LINEA(Jugador);
                CANTAR_BINGO(Jugador);
                if (JUEGO_BINGO == false) {
                	break;
                }
        		
    		}
    		
    	} while( JUEGO_BINGO == true);
    	
    	System.out.println("####################################");
		System.out.println("#            RESULTADOS            #");
		System.out.println("####################################");
        
    	for (Jugador Jugador : JUGADORES) {
            try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	System.out.println("JUGADOR: " + Jugador.getNombre());
        	Jugador.getCarton();
    	}
        
    }
    
    private void AGREGAR_JUGADOR(String NOMBRE_JUGADOR) {
    	Jugador Jugador = new Jugador(NOMBRE_JUGADOR);
		JUGADORES.add(Jugador);
		
    }
    
    private void SORTEAR_NUMERO() {
    	Random random = new Random();
    	int NUMERO;
    	do {
            NUMERO = random.nextInt((89 - 1) + 1) + 1; 
        } while (NUMEROS_SORTEADOS.contains(NUMERO));
    	NUMERO_SORTEADO = NUMERO;
    	NUMEROS_SORTEADOS.add(NUMERO);
    }
    
    private void CANTAR_LINEA(Jugador Jugador) {
    	boolean LINEA = Jugador.COMPROBAR_LINEA();
    	if (LINEA == true) {
    		System.out.println("El jugador " + Jugador.getNombre() + " " + Jugador.MENSAJE_LINEA());
    	}
    }
    
    private void CANTAR_BINGO(Jugador Jugador) {
    	if (Jugador.COMPROBAR_BINGO() == true) {
    		System.out.println("El jugador " + Jugador.getNombre() + " ha cantado BINGO");
    		JUEGO_BINGO = false;
    	}
    }
	
}
