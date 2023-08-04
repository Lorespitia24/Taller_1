import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();
		
		//Punto 1
		app.getCalculadora();

		//Punto 2
		app.getParImpar();

		//Punto 3
		app.getAreaPerimetroCirculo();

		//Punto 4
		app.getEdad();

		//Punto 5
		app.getMayor();

		//Punto 6
		app.getPositivoNegativo();

		//Punto 7
		app.getTablaMultiplicar();

		//Punto 8
		Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
		app.getRandom(numeroAleatorio);

		//Punto 9
		app.getFactorial();

		//Punto 10
		app.getFibonacci();

		//Punto 11
		app.getAreaTrianguloFormulaHeron();

		//Punto 12
		app.getNumerosPrimos();

		//Punto 13
		//Punto 14
		app.getPerfecto();

		//Punto 15
		app.getNumeroCapicua();

		//Punto 16
		app.getFibonacciHasta();

		//Punto 17
		app.getImprimirPrimo();
		
		//Punto 18
		app.getContrasenaAleatoria();

		//Punto 19
		app.getNombreMayusculaMinuscula();

		//Punto 20
		app.getPalabraInvertida();

		//Punto 21
		//Punto 22
		app.getFrasePolindromo();

		//Punto 23
		app.getContarPalabras();

		//Punto 24
		app.getReemplazarLetra();

		//Punto 25
		app.getPalabrasSeparadas();

		//Punto 26
		app.getContarCaracteresSinEspacios();

		//Punto 27
		app.getOrdenarPalabras();

		//Punto 28
		app.getSumarArreglo();

		//Punto 29
		app.getMaximoArreglo();

		//Punto 30
		//Punto 31
		//Punto 32
		app.getNumeroArreglo();

		//Punto 33
		//Punto 34
		//Punto 35
		app.getTablasMultiplicar();

	}

		/* 1. Realiza un programa que solicite al usuario dos números enteros y muestre
		su suma, resta, multiplicación y división*/
		
	public void getCalculadora(){

		String input_1 = JOptionPane.showInputDialog("Ingresa el primer numero entero:");
		String input_2 = JOptionPane.showInputDialog("Ingresa el segundo numero entero:");
		
		int resultadoSuma = Integer.parseInt(input_1) + Integer.parseInt(input_2);
		int resultadoResta = Integer.parseInt(input_1) - Integer.parseInt(input_2);
		int resultadoMultiplicacion = Integer.parseInt(input_1) * Integer.parseInt(input_2);
		double resultadoDivision = Integer.parseInt(input_1) / Integer.parseInt(input_2);
		
		JOptionPane.showMessageDialog(null, "Suma: "+ resultadoSuma + 
											"\nResta: "+ resultadoResta +
											"\nMultiplicación: "+ resultadoMultiplicacion +
											"\nDivisión: " + resultadoDivision);
	}

	/* 2. Escribe un programa que pida al usuario un número entero y determine si es
	par o impar*/
	
	public void getParImpar(){

		String inputParesImpares = JOptionPane.showInputDialog("Ingresa un numero entero:");
		
		int resultadoParesImpares = Integer.parseInt(inputParesImpares) % 2 ;		
		
		JOptionPane.showMessageDialog(null, ((resultadoParesImpares == 0) ?  "Es par": "es impar"));
	}

	/* 3. Crea un programa que calcule y muestre el área y el perímetro de un círculo.
	El usuario debe proporcionar el radio del círculo*/

	public void getAreaPerimetroCirculo(){
		String inputRadio = JOptionPane.showInputDialog("Ingresa el radio  del circulo:");
		
		double resultadoArea = Math.PI * Math.pow(Double.parseDouble(inputRadio) ,2) ;		
		double resultadoPerimetro = 2 * Math.PI * Double.parseDouble(inputRadio);
		
		JOptionPane.showMessageDialog(null, "El Area es: "+ resultadoArea + "\n El perimetro es: " + resultadoPerimetro);
	
	}

	/* 4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
	o menor de edad.*/

	public void getEdad(){
		String input_edad = JOptionPane.showInputDialog("Ingresa la edad:");
		
		JOptionPane.showMessageDialog(null, ((Integer.parseInt(input_edad) >= 18) ?  "Es mayor de edad": "Es menor de edad"));
	}

	/* 5. Realiza un programa que solicite al usuario dos números enteros y determine
	cuál es el mayor de ellos.*/
	
	public void getMayor(){
		String input_numero_1 = JOptionPane.showInputDialog("Ingresa el primer numero entero:");
		String input_numero_2 = JOptionPane.showInputDialog("Ingresa el segundo numero entero:");
		
		if (Integer.parseInt(input_numero_1) > Integer.parseInt(input_numero_2)) {
			JOptionPane.showMessageDialog(null, (input_numero_1 + " es el numero mayor"));
		}else if(Integer.parseInt(input_numero_1) == Integer.parseInt(input_numero_2)){
			JOptionPane.showMessageDialog(null, ("El numero " + input_numero_1 +" y el numero "+ input_numero_2+ " son iguales"));
		}else {			
			JOptionPane.showMessageDialog(null, (input_numero_2 + " es el numero mayor"));
		}
	}

	/* 6. Escribe un programa que pida al usuario un número y verifique si es positivo,
	negativo o cero. */

	public void getPositivoNegativo(){
	
	String inputPositivoNegativo = JOptionPane.showInputDialog("Ingresa un numero entero:");
	
	if (Integer.parseInt(inputPositivoNegativo) > 0) {
		
		JOptionPane.showMessageDialog(null, (inputPositivoNegativo + " es un numero positivo "));
	}else if(Integer.parseInt(inputPositivoNegativo) == 0){
		JOptionPane.showMessageDialog(null, ("El numero es cero"));
	}else {			
		JOptionPane.showMessageDialog(null, (inputPositivoNegativo + " es un numero negativo"));
	}
	
	}

	/* 7. Crea un programa que pida al usuario un número entero positivo y muestre
	su tabla de multiplicar hasta el 10. */

	public void getTablaMultiplicar(){
		String input_tablaMultiplicar = JOptionPane.showInputDialog("Ingresa un numero entero:");
		String tablaMultiplicar = "";
		for (int i = 0; i <= 10; i++) {
			tablaMultiplicar += "\n" + (input_tablaMultiplicar+" X "+i+" = "+ Integer.parseInt(input_tablaMultiplicar)*i); 
		}
		JOptionPane.showMessageDialog(null, (tablaMultiplicar));
	}

	/*8. Realiza un programa que simule un juego de adivinar un número. El
	  programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
	  adivinarlo. El programa debe indicar si el número ingresado es mayor o
	  menor que el número a adivinar.*/

  public void getRandom(int numeroAleatorio){
	  
	  String input_numero_1 = JOptionPane.showInputDialog("Ingresa un numero entero:");
	  
	  if (Integer.parseInt(input_numero_1) > numeroAleatorio) {
		  JOptionPane.showMessageDialog(null, ("El numero es menor a " + input_numero_1));
		  getRandom(numeroAleatorio);
	  }else if(Integer.parseInt(input_numero_1) == numeroAleatorio){
		  JOptionPane.showMessageDialog(null, ("El numero aleatorio es "+ numeroAleatorio));
	  }else {			
		  JOptionPane.showMessageDialog(null, ("El numero mayor a "+ input_numero_1));
		  getRandom(numeroAleatorio);
	  }
	}

	  /*9. Escribe un programa que solicite al usuario un número entero positivo y
	  calcule su factorial.*/
	public void getFactorial(){
		String input_factorial = JOptionPane.showInputDialog("Ingresa un numero entero:");
		double factorial = 1;
		for (int i = 1; i <= Integer.parseInt(input_factorial); i++) {
			factorial *= i;
		}
		JOptionPane.showMessageDialog(null, "El factorial de " +input_factorial+ " es " + (factorial));
	}

		/* 10. Ejercicio 10: Crea un programa que muestre los primeros 20 números de la
		serie Fibonacci. La serie Fibonacci se forma sumando los dos números
		anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …*/

		public void getFibonacci(){
			String serieFibonacci ="";
			int numeroInicial = 0;
			int numeroFinal = 1;	
			
			for(int i = 0; i < 20; i++){
				serieFibonacci += numeroInicial + ",";
				numeroInicial += numeroFinal;
				numeroFinal = numeroInicial - numeroFinal;
			} 
			JOptionPane.showMessageDialog(null, ("Serie Fibonacci "+ serieFibonacci));
		}

		/* 11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
		de Herón. El usuario debe ingresar las longitudes de los tres lados.*/
		public void getAreaTrianguloFormulaHeron(){
            String inputLongitud_1 = JOptionPane.showInputDialog("Ingresa longitud triangulo 1: ");
            String inputLongitud_2 = JOptionPane.showInputDialog("Ingresa longitud triangulo 2: ");
            String inputLongitud_3 = JOptionPane.showInputDialog("Ingresa longitud triangulo 3: ");
            double semiperimetro = ((Double.parseDouble(inputLongitud_1) +
                                    Double.parseDouble(inputLongitud_2) + 
                                    Double.parseDouble(inputLongitud_3)) / 2 );
        double area = (Math.sqrt(semiperimetro * 
                                ((semiperimetro - Double.parseDouble(inputLongitud_1)) * 
                                (semiperimetro -Double.parseDouble(inputLongitud_2)) * 
                                (semiperimetro - Double.parseDouble(inputLongitud_3)))));
            
            JOptionPane.showMessageDialog(null, ("Area: "+ area)); 
		}
    

		/* 	12.Realiza un programa que pida al usuario un número entero y determine si es
		un número primo o no */
		public void getNumerosPrimos(){
        String input_numero_primo = JOptionPane.showInputDialog("Ingresa un numero entero:");
        for (int i = 2; i <= Integer.parseInt(input_numero_primo); i++) {
            if (Integer.parseInt(input_numero_primo) != 2 && Integer.parseInt(input_numero_primo) % i == 0 ) {
                JOptionPane.showMessageDialog(null, (input_numero_primo + " No es un numero primo")); 
                break;
            }else{
               JOptionPane.showMessageDialog(null, (input_numero_primo + " Es un numero primo")); 
               break;
           	 }
        	}
			JOptionPane.showMessageDialog(null, (input_numero_primo + " No es un numero primo")); 
    	}
		
		/* 	13.Pide al usuario un número decimal y muestra su valor redondeado a un
		número específico de decimales */

		/* 14.Escribe un programa que solicite al usuario un número entero positivo y
		verifique si es un número perfecto. Un número perfecto es aquel cuya suma
		de sus divisores propios (excluyendo al propio número) es igual al número. */

        public void getPerfecto(){
            String input_numero = JOptionPane.showInputDialog("Ingresa un numero:");
            int suma = 0;
                for(int i = 1 ; i < Integer.parseInt(input_numero) ; i++){
                    if(Integer.parseInt(input_numero) % i == 0){
                        suma += i;
                    }
                 }

                 if (suma == Integer.parseInt(input_numero)) {
                    JOptionPane.showMessageDialog(null, (input_numero + " Es un numero perfecto"));  
                 } else {
                    JOptionPane.showMessageDialog(null, (input_numero + " No es un numero perfecto"));  
                 }
        }

		/* 15.Crea un programa que pida al usuario un número entero y determine si es un
		número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
		derecha que de derecha a izquierda. */

		public void getNumeroCapicua(){
            String input_numero = JOptionPane.showInputDialog("Ingresa un numero:");
            String numeroInvertido = "";
            for (int i = input_numero.length()-1; i >= 0; i--) {
                numeroInvertido += input_numero.charAt(i);
            }
            if(Integer.parseInt(input_numero) == Integer.parseInt(numeroInvertido)){
                JOptionPane.showMessageDialog(null, (input_numero + " Es un numero capicúa")); 
            }else{
                JOptionPane.showMessageDialog(null, (input_numero + " No es un numero capicúa")); 
            }
		}

		 /* 16.Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
		número dado ingresado por el usuario. */
		public void getFibonacciHasta(){
            String input_numero_1 = JOptionPane.showInputDialog("Ingresa un numero entero:");
			String serieFibonacci ="";
			int numeroInicial = 0;
			int numeroFinal = 1;	
			
			for(int i = 0; i < Integer.parseInt(input_numero_1); i++){
				serieFibonacci += numeroInicial + ",";
				numeroInicial += numeroFinal;
				numeroFinal = numeroInicial - numeroFinal;
			} 
			JOptionPane.showMessageDialog(null, ("Serie Fibonacci "+ serieFibonacci));
		}

		/* 17.Pide al usuario dos números enteros y muestra todos los números primos
        que se encuentran en ese rango. */

		public boolean esPrimo(int numero){
			for (int i = 2; i <= numero; i++) {
				if ((numero != 2 ) && numero % i == 0 ) {
					return false;
				}else{
					return true;
				}
			}
			return false;
		}
	
		public void getImprimirPrimo(){
			String input_numero_primo = JOptionPane.showInputDialog("Ingresa un numero entero:");
			String numerosPrimo = "";
			for (int j = 0; j <= Integer.parseInt(input_numero_primo); j++) {     
			   if(esPrimo(j)){
				numerosPrimo += j + ",";
			   }
			}
			JOptionPane.showMessageDialog(null, ("Numeros Primos: " + numerosPrimo));  
		}

       	/* 18.Crea un programa que genere una contraseña aleatoria de 8 caracteres que
		contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
		clase Math para generar números aleatorios y la clase String para manipular
		la contraseña. */

		public void getContrasenaAleatoria(){
			String contrasena = "";
			String contrasenaFinal = "";
			Random random = new Random();
			while (contrasena.length() < 8) {
				contrasena += generar();
			}
			for (int i = 0; i < 8; i++) {
				int numeroAleatorio = random.nextInt(8);
				contrasenaFinal += "" + contrasena.charAt(numeroAleatorio);
			}
			JOptionPane.showMessageDialog(null, ("Contraseña Aleatoria: " + contrasenaFinal)); 
			
		}

		public String generar(){
			Random random = new Random();
			int numeroAleatorio = random.nextInt(10);
			int letraMayuscula = (int)(Math.random()*((90-65)+1)+65);
			int letraMinuscula = (int)(Math.random()*((122-97)+1)+97);
			String contrasena = "";
			return contrasena += (char)letraMayuscula +""+ numeroAleatorio +""+ (char)letraMinuscula;
		}

		/* 19.Escribe un programa que solicite al usuario su nombre y luego lo imprima en
		mayúsculas y minúsculas */
		public void getNombreMayusculaMinuscula(){
            String input_nombre = JOptionPane.showInputDialog("Ingresa un nombre:");
			 JOptionPane.showMessageDialog(null, ("Minuscula: "+ input_nombre.toLowerCase() +
                                                    "\nMayuscula: "+ input_nombre.toUpperCase())); 
		}
		 /* 20.Realiza un programa que solicite al usuario una cadena y luego invierta su
		orden */
		public void getPalabraInvertida(){
            String input_nombre = JOptionPane.showInputDialog("Ingresa una palabra:");
            String palabraInvertida = "";
            for (int i = input_nombre.length()-1; i >= 0; i--) {
                palabraInvertida += input_nombre.charAt(i);
            }
			 JOptionPane.showMessageDialog(null, ("Palabra Invertida : "+ palabraInvertida)); 
		}
		/* 21.Pide al usuario una cadena y muestra cuántas veces aparece una letra
		específica en ella */

		/* 22.Escribe un programa que solicite al usuario una frase y verifique si es un
		palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda) */

		public void getFrasePolindromo(){
            String input_frase = JOptionPane.showInputDialog("Ingresa una frase:");
            String fraseInvertida = "";
            for (int i = input_frase.length()-1; i >= 0; i--) {
                fraseInvertida += input_frase.charAt(i);
            }
            if(input_frase.replace(" ", "").equalsIgnoreCase(fraseInvertida.replace(" ", ""))){
                JOptionPane.showMessageDialog(null, (input_frase + " es una frase palíndromo")); 
            }else{
                JOptionPane.showMessageDialog(null, (input_frase + " No es una frase palíndromo")); 
            }
		}
		
		/* 23.Crea un programa que pida al usuario una oración y muestre cuántas
		palabras contiene */
		public void getContarPalabras(){
            String input_nombre = JOptionPane.showInputDialog("Ingresa una oración: ");
            String []palabras = input_nombre.split(" ");
            JOptionPane.showMessageDialog(null, ("Cantidad de Palabras: "+ palabras.length)); 
		}

		    /* 24.Realiza un programa que solicite al usuario una cadena y reemplace todas
		las apariciones de una letra específica por otra */

		public void getReemplazarLetra(){
            String input_frase = JOptionPane.showInputDialog("Ingresa una cadena:");
            String input_letra_remplazar = JOptionPane.showInputDialog("Ingresa la letra que quiere reemplazar:");
            String input_letra_sustituir = JOptionPane.showInputDialog("Ingresa la letra por la que sustituir:");

            JOptionPane.showMessageDialog(null, ("Palabra Original: " + input_frase 
                                                + "\nPalabra Final: "+ input_frase.replace(input_letra_remplazar, input_letra_sustituir))); 
		}

		/* 25.Pide al usuario una frase y muestra cada palabra por separado */
		public void getPalabrasSeparadas(){
            String input_palabra = JOptionPane.showInputDialog("Ingresa una frase: ");
            JOptionPane.showMessageDialog(null, ("Palabras Separadas: \n"+ input_palabra.replace(" ", "\n"))); 
		}

		/* 26.Escribe un programa que pida al usuario una cadena y muestre cuántos
		caracteres tiene sin contar los espacios en blanco */
		public void getContarCaracteresSinEspacios(){
            String input_palabra = JOptionPane.showInputDialog("Ingresa una frase: ");
            JOptionPane.showMessageDialog(null, ("Cantidad de Caracteres: "+ input_palabra.replace(" ", "").length())); 
		}

		/* 27.Crea un programa que solicite al usuario una frase y luego muestre las
		palabras ordenadas alfabéticamente */

		public void getOrdenarPalabras(){
            String input_frase = JOptionPane.showInputDialog("Ingresa una frase:");
            String []vector_palabras = input_frase.split(" ");
            Arrays.sort(vector_palabras);
            String palabrasOrdenadas = "";
            for (int i = 0; i < vector_palabras.length; i++) {
                palabrasOrdenadas += vector_palabras[i].toString() + " ";
            }
           

             JOptionPane.showMessageDialog(null, ("Frase Original: " + input_frase 
                                                + "\nFrase Ordenada: "+ palabrasOrdenadas));  
		}

	/* 28.Suma de elementos: Escribe un programa que calcule la suma de todos los
		elementos en un arreglo de enteros. */

		public void getSumarArreglo(){
            int []arreglo_numeros = {40,21,5,60};
            int suma = 0;
            for (int i = 0; i < arreglo_numeros.length; i++) {
                suma += arreglo_numeros[i];
            }
           

             JOptionPane.showMessageDialog(null, ("Suma Arreglo Enteros: " + suma));  
		}

		/* 29.Encontrar el número más grande: Crea un programa que encuentre el número
		más grande en un arreglo de enteros. */

		public void getMaximoArreglo(){
            int []arreglo_numeros = {40,90,21,5,60,91};
            int maximo = 0;
            maximo = arreglo_numeros[0];
            for (int i = 1; i < arreglo_numeros.length; i++) {
                    if(maximo < arreglo_numeros[i]){
                        maximo = arreglo_numeros[i];
                    }
            }

             JOptionPane.showMessageDialog(null, ("Suma Arreglo Enteros: " + maximo));  
		}
		/* 30.Eliminar duplicados: Diseña un programa que elimine los elementos
		duplicados de un arreglo. */
		/* 31.Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
		el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
		de manera ascendente. */

		/* 32.Buscar un elemento: Escribe un programa que busque un número específico
		en un arreglo y muestre su índice (o un mensaje si no se encuentra). */

		public void getNumeroArreglo(){
            String input_numero_buscar = JOptionPane.showInputDialog("Ingresa un numero entero:");
            int []arreglo_numeros = {40,90,21,5,60,91};
            String numero_encontrado = "";
            for (int i = 1; i < arreglo_numeros.length; i++) {
                    if(arreglo_numeros[i] == Integer.parseInt(input_numero_buscar)){
                        numero_encontrado = "Se encuentra en el array";
                        break;
                    }else{
                        numero_encontrado = "No se encuentra en el array";
                    }
            }
           

             JOptionPane.showMessageDialog(null, (input_numero_buscar + " " + numero_encontrado));  
		}
		/* 33.Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
		cada elemento en un arreglo. */

		/* 34.Rotación de elementos: Implementa un programa que rote los elementos de
		un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones. */

		/* 35.Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
		del 1 al 10. Usa para esto una matriz */
   		public void getTablasMultiplicar(){
           int fila = 10*10, columna = 3;
            int [][]tablas = new int[fila][columna];
            int cicloInterno = 1;
            
            while(cicloInterno <= 10){
                System.out.println("Tabla del " + cicloInterno);
                    for (int i = 1; i <= 10; i++) {
                    tablas[i][0] = cicloInterno;
                    tablas[i][1]= i;
                    tablas[i][2]= tablas[i][0] * tablas[i][1];
                    System.out.println(tablas[i][0] + " X " + tablas[i][1] + " = " + tablas[i][2] );
                    
                }
                ++cicloInterno;
            }
		}
		
}
