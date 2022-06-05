/*	Estudiante: Juan Jos� Romero - C.I.:29.955.629
 * 	Tarea Camioneta - POO - Secci�n "A" - 2022B - URU
 */

import java.util.Scanner;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Camioneta camioneta1 = new Camioneta();
		
		System.out.println("�Su camioneta por cu�l marca fu� fabricada? (Chevrolet, Toyota, Ford, etc): ");
        String marca1 = entrada.nextLine();
        camioneta1.Pedir_Marca(marca1);
        
        System.out.println("�Qu� modelo de la marca " +marca1 + " es?:");
        String modelo1 = entrada.nextLine();
        camioneta1.Pedir_Modelo(modelo1);
        
		System.out.println("�Su camioneta " +modelo1 + " qu� tipo de tracci�n tiene? (�Autom�tica o Sincr�nica?)");
		String traccion1 = entrada.nextLine();
        camioneta1.Pedir_Traccion(traccion1);
        
        System.out.println("�Su " +modelo1 + " en qu� anio fu� fabricada?: ");
        int anio1 = entrada.nextInt();
        camioneta1.Pedir_AnioFabricacion(anio1);
        
        /*Desconozco la raz�n por la que en consola no muestra la opci�n para pedirle al usuario su respuesta. 
         * Ya que, reviso y reviso el c�digo y no encuentro fallas.
         */
        System.out.println("�Tiene climatizador? (Si o No): ");  
        String climatizador1 = entrada.nextLine();
        camioneta1.Pedir_Climatizador(climatizador1);
        
        System.out.println("�Su " +modelo1 + " cuenta con asientos de cuero? (Si o No): ");
        String asientosCuero1 = entrada.nextLine();
        camioneta1.Pedir_AsientosCuero(asientosCuero1);
        
        System.out.println("\n \nEn resumen: \n");
        
        System.out.println(camioneta1.MostrarCaracteristicasGenerales());
	}

}
