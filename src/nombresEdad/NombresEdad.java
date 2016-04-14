package nombresEdad;

import java.util.Scanner;

public class NombresEdad
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String alumnoMenor = new String("nombre");
		int edad;
		int contadorAlumnos = 0;
		int sumaEdades = 0;
		int edadMenor = Integer.MAX_VALUE;
		System.out.print("Introduce nombre del alumno (fin para salir): ");
		String nombre = sc.nextLine();
		while(!nombre.equals("fin")) // MIENTRAS NO SEA "FIN"
		{
			System.out.print("Introduce su edad en años: ");
			edad = Integer.parseInt(sc.nextLine());
			sumaEdades += edad; 
			contadorAlumnos++;
			if(edad < edadMenor) // SI ES EL MENOR GUARDA EL NOMBRE
			{
				edadMenor = edad;
				alumnoMenor = nombre;
			}
			System.out.print("Introduce nombre del alumno (fin para salir): ");
			nombre = sc.nextLine();
		}
		sc.close();
		if(contadorAlumnos == 0) // SI NO SE HAN INTRODUCIDO ALUMNOS
		{
			System.out.println("Fin del programa.");
		}
		else
		{
			System.out.println("La media de edad de los alumnos es " + (double)sumaEdades / contadorAlumnos + ",el menor es " + alumnoMenor + " y tiene " + edadMenor + " años.");
			System.out.println("Fin del programa.");
		}
	}
}
