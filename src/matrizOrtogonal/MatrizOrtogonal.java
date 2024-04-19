package matrizOrtogonal;

import java.util.regex.Pattern;

import javax.swing.SwingUtilities;

public class MatrizOrtogonal {
		int fila;
		int columna;
		private int tamanioMatriz;
	    NodoFila primeraFila;
	    NodoColumna primeraColumna;
	    
	    	    

		public int getFila() {
			return fila;
		}

		public void setFila(int fila) {
			this.fila = fila;
		}

		public int getColumna() {
			return columna;
		}

		public void setColumna(int columna) {
			this.columna = columna;
		}

		public NodoFila getPrimeraFila() {
			return primeraFila;
		}

		public void setPrimeraFila(NodoFila primeraFila) {
			this.primeraFila = primeraFila;
		}

		public NodoColumna getPrimeraColumna() {
			return primeraColumna;
		}

		public void setPrimeraColumna(NodoColumna primeraColumna) {
			this.primeraColumna = primeraColumna;
		}

		public int getTamanioMatriz() {
			return tamanioMatriz;
		}

		public void setTamanioMatriz(int tamanioMatriz) {
			this.tamanioMatriz = tamanioMatriz;
		}

		public MatrizOrtogonal( int fila, int columna, int tamanioMatriz) {  
	        this.primeraFila = null;
	        this.primeraColumna = null;
	        this.fila = fila;
	        this.columna = columna;
	        this.tamanioMatriz = tamanioMatriz;
	        
	    }

	    public MatrizOrtogonal() {
			// TODO Auto-generated constructor stub
		}
	    
	    private Automovil[][] matriz;
	    
		public void insertar(int fila, int columna, Automovil automovil, int tamanioMatriz) {
			System.out.println("Tamanio de matriz: " +  tamanioMatriz);
	        if (fila >= tamanioMatriz || columna >= tamanioMatriz || fila < 0 || columna < 0) {
	            System.out.println("Índices fuera de rango.");
	            return;
	        }

	        NodoFila nuevaFila = obtenerNodoFila(fila);
	        NodoColumna nuevaColumna = obtenerNodoColumna(columna);

	        NodoColumna nuevoNodoColumna = new NodoColumna(columna, automovil);

	        // Insertar en la fila
	        if (nuevaFila.getDerecha() == null || nuevaFila.getDerecha().getColumna() > columna) {
	            nuevoNodoColumna.setSiguiente(nuevaFila.getDerecha());
	            nuevaFila.setDerecha(nuevoNodoColumna);
	        } else {
	            NodoColumna actual = nuevaFila.getDerecha();
	            while (actual.getSiguiente() != null && actual.getSiguiente().getColumna() < columna) {
	                actual = actual.getSiguiente();
	            }
	            nuevoNodoColumna.setSiguiente(actual.getSiguiente());
	            actual.setSiguiente(nuevoNodoColumna);
	        }

	        NodoFila nuevoNodoFila = new NodoFila(fila);
	        
	        // Insertar en la columna
	        if (nuevaColumna.getAbajo() == null || nuevaColumna.getAbajo().getFila() > fila) {
	            nuevoNodoFila.setSiguiente(nuevaColumna.getAbajo());
	            nuevaColumna.setAbajo(nuevoNodoFila);
	        } else {
	            NodoFila actual = nuevaColumna.getAbajo();
	            while (actual.getSiguiente() != null && actual.getSiguiente().getFila() < fila) {
	                actual = actual.getSiguiente();
	            }
	            nuevoNodoFila.setSiguiente(actual.getSiguiente());
	            actual.setSiguiente(nuevoNodoFila);
	        }
	    }

	    private NodoFila obtenerNodoFila(int fila) {
	        if (primeraFila == null) {
	            primeraFila = new NodoFila(fila);
	            return primeraFila;
	        }

	        NodoFila actual = primeraFila;
	        while (actual != null && actual.getFila() != fila) {
	            if (actual.getSiguiente() == null || actual.getSiguiente().getFila() > fila) {
	                NodoFila nueva = new NodoFila(fila);
	                nueva.setSiguiente(actual.getSiguiente());
	                actual.setSiguiente(nueva);
	                return nueva;
	            }
	            actual = actual.getSiguiente();
	        }

	        return actual;
	    }

	    private NodoColumna obtenerNodoColumna(int columna) {
	        if (primeraColumna == null) {
	            primeraColumna = new NodoColumna(columna, null);
	            return primeraColumna;
	        }

	        NodoColumna actual = primeraColumna;
	        while (actual != null && actual.getColumna() != columna) {
	            if (actual.getSiguiente() == null || actual.getSiguiente().getColumna() > columna) {
	                NodoColumna nueva = new NodoColumna(columna, null);
	                nueva.setSiguiente(actual.getSiguiente()); 
	                actual.setSiguiente(nueva);
	                return nueva;
	            }
	            actual = actual.getSiguiente();
	        }

	        return actual;
	    }

	    public void imprimirMatriz() {
	        for (int i = 0; i < tamanioMatriz; i++) {
	            NodoFila fila = obtenerNodoFila(i);
	            NodoColumna actual = fila.getDerecha();
	            for (int j = 0; j < tamanioMatriz; j++) {
	                if (actual != null && actual.getColumna() == j) {
	                    System.out.print(actual.getAutomovil() + " | ");
	                    actual = actual.getSiguiente();
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
	    }

	    public static boolean esAlfanumerico(String cadena) {
	        // Definir el patrón de expresión regular para validar alfanuméricos
	        String patron = "^[a-zA-Z0-9]*$";
	        // Compilar el patrón en un objeto Pattern
	        Pattern pattern = Pattern.compile(patron);
	        // Verificar si la cadena coincide con el patrón
	        return pattern.matcher(cadena).matches();
	    }
	    
	    //Función para validar numeros
	    public static boolean esNumero(String cadena) {
	        return cadena.matches("-?\\d+(\\.\\d+)?");
	    }
	    
	    //Función para valida solo letras
	    public static boolean sonSoloLetras(String cadena) {
	        return cadena.matches("[a-zA-Z]+");
	    }
	    
	    //Método Buscar
	 // Método para buscar un automóvil por un atributo específico en la matriz
	    public Automovil buscarAutomovilAtributo(String atributo, String valor) {
	        for (int i = 0; i < fila; i++) {
	            NodoFila nodoFila = obtenerNodoFila(i);
	            NodoColumna actual = nodoFila.getDerecha();
	            while (actual != null) {
	                Automovil automovil = actual.getAutomovil();
	                switch (atributo) {
	                    case "placa":
	                        if (automovil.getPlaca().equals(valor)) {
	                            return automovil;
	                        }
	                        break;
	                    case "color":
	                        if (automovil.getColor().equals(valor)) {
	                            return automovil;
	                        }
	                        break;
	                    case "linea":
	                        if (automovil.getLinea().equals(valor)) {
	                            return automovil;
	                        }
	                        break;
	                    case "modelo":
	                        if (automovil.getModelo().equals(valor)) {
	                            return automovil;
	                        }
	                        break;
	                    case "propietario":
	                        if (automovil.getPropietario().equals(valor)) {
	                            return automovil;
	                        }
	                        break;
	                    default:
	                        System.out.println("Atributo no válido");
	                        return null;
	                }
	                actual = actual.getSiguiente();
	            }
	        }
	        System.out.println("No se encontró ningún automóvil con ese atributo y valor");
	        return null;
	    }

	    
	    
	    public static void main(String[] args) {
	    	SwingUtilities.invokeLater(FormBuscarMatriz::new);
		    }
	}
