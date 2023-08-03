import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class EJjemplo {

    public static void main(String[] args) {
        EJjemplo ej = new EJjemplo();
        ej.contarLetras();
    }

    public void contarLetras(){
    String input_frase = "Hola mundZZZo";
    int contador = 0;
    for (int i = 0; i < input_frase.length(); i++) {
        if (!(input_frase.charAt(i) >= 'A' && input_frase.charAt(i) <= 'Z') && !(input_frase.charAt(i) >= 'a' && input_frase.charAt(i) <= 'z')) {
           System.out.println("true");
        }
    }
    }


	/* 	13.Pide al usuario un número decimal y muestra su valor redondeado a un
		número específico de decimales */
        public void getRedondear(){
            String input_numero = JOptionPane.showInputDialog("Ingresa un numero decimal:");
            int input_numero_decimales = 2;
            String []numero;
            String parteDecimal = "";
            String parteEntera = "";
            System.out.println(input_numero);
             if(input_numero.contains(".")){
                numero = input_numero.split("\\.");
                parteEntera = numero[0];
                parteDecimal = numero[1];
            }else if (input_numero.contains(",")) {
                numero = input_numero.split("\\,");
                parteEntera = numero[0];
                parteDecimal = numero[1];
            } 

            

            System.out.println(parteEntera + "-" + parteDecimal);
        //    JOptionPane.showMessageDialog(null, "El factorial de ");
        }

    
}
