import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;


public class Main extends JFrame {
    private static Collection<Integer> numeros;
    private JPanel menuPanel;
    private ButtonGroup buttonGroup;

    public Main() {
        setTitle("Menú de Opciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 3, 10, 10)); // Filas centradas con 3 columnas

        buttonGroup = new ButtonGroup();

        // Agregar 13 opciones al menú
        for (int i = 1; i <= 13; i++) {
            String optionText = "Opción " + i;
            JRadioButton radioButton = new JRadioButton(optionText);
            radioButton.setActionCommand(Integer.toString(i));
            radioButton.addActionListener(new MenuActionListener());
            buttonGroup.add(radioButton);
            menuPanel.add(radioButton);
        }

        add(menuPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class MenuActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedOption = e.getActionCommand();
            int optionNumber = Integer.parseInt(selectedOption);
            executeOptionFunction(optionNumber);
        }
    }

    private void executeOptionFunction(int optionNumber) {
        // Aquí ejecutas la función correspondiente a la opción seleccionada.
        // En este ejemplo, solo mostraremos un mensaje en la consola para cada opción.
        System.out.println("Ejecutando la función de la opción " + optionNumber);
        switch (optionNumber) {
            case 1:
                ejercicio1();
                break;
	        case 2:
		        ejercicio2();
		        break;
	        case 3:
				ejercicio3();
				break;
	        case 4:
				ejercicio4();
				break;
	        case 5:
				ejercicio5();
				break;
	        case 6:
				ejercicio6();
				break;
	        case 7:
				ejercicio7();
				break;
	        case 8:
				ejercicio8();
	        case 9:
				ejercicio9();
				break;
	        case 10:
				ejercicio10();
				break;
	        case 11:
				ejercicio11();
				break;
	        case 12:
				ejercicio12();
				break;
	        case 13:
				ejercicio13();
				break;
		}
        // Mostrar un diálogo para volver al menú
        JOptionPane.showMessageDialog(this, "Función de la opción " + optionNumber + " ejecutada.\nVuelve al menú.");
    }

    // EJERCICIO 1
    public void ejercicio1() {
        String nombre = "Hernan";
        String apellido = "Canestraro";
        int edad = 46;
        System.out.println("Mi nombre es "+nombre+" "+apellido+" y tengo "+edad+" años.");
    }

    // EJERCICIO 2
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer n├║mero:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo n├║mero:");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese el tercer n├║mero:");
        int numero3 = scanner.nextInt();
        int numeroMayor = Math.max(numero1, Math.max(numero2, numero3));
        System.out.println("El n├║mero mayor es: " + numeroMayor);
    }

    // EJERCICIO 3
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        String paridad = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número ingresado es " + paridad);
    }

    // EJERCICIO 4
    public void ejercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese primer cadena: ");
        String primerCadena = scanner.nextLine();
        System.out.println("Ingrese segunda cadena: ");
        String segundaCadena = scanner.nextLine();
        boolean sonIdenticas = primerCadena.equals(segundaCadena);
        if(sonIdenticas) {
            System.out.println("Las cadenas son idénticas.");
        } else {
            System.out.println("Las cadenas no son idénticas");
        }
    }

    // EJERCICIO 5
    public void ejercicio5() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Ingresa números (ingresa 0 para detenerse):");
        int numero;
        do {
            numero = scanner.nextInt();
            if (numero != 0) {
                numeros.add(numero);
            }
        } while (numero != 0);
        System.out.println("Números ingresados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }

    // EJERCICIO 6
    public void ejercicio6() {
        imprimirBienvenida();
    }
    public static void imprimirBienvenida() {
        System.out.println("!Bienvenido(a) a nuestro programa!");
	}

	// EJERCICIO 7
    public void ejercicio7() {
        int numero = 7;
        String paridad = determinarParidad(numero);
        System.out.println("El número " + numero + " es " + paridad + "." );
    }
    public static String determinarParidad(int numero) {
        return (numero % 2 == 0) ? "par" : "impar";
    }

    // EJERCICIO 8 -------------
    public void ejercicio8() {
        int numero = 17; // Puedes cambiar este número para probar con diferentes valores
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // EJERCICIO 9
    public void ejercicio9() {
        // Ejemplo: creando una colección de números para probar la función
        java.util.ArrayList<Integer> numeros1 = new java.util.ArrayList<>();
        numeros1.add(3);
        numeros1.add(8);
        numeros1.add(5);
        numeros1.add(10);
        numeros1.add(7);
	    int sumaImpares;
	    sumaImpares = sumaNumerosImpares( numeros1 );
	    System.out.println("La suma de los números impares es: " + sumaImpares);
    }
    public static int sumaNumerosImpares(Collection<Integer> numeros) {
        Main.numeros = numeros;
        int suma = 0;
        for (int numero2 : numeros) {
            if (numero2 % 2 != 0) { // Si el número es impar
                suma += numero2;
            }
        }
        return suma;
    }

	// EJERCICIO 10
	public void ejercicio10() {
        // Ejemplo: creando una colección de números para probar la función
	    java.util.ArrayList<Integer> numeros2 = new java.util.ArrayList<>();
	    numeros2.add(3);
	    numeros2.add(8);
	    numeros2.add(5);
	    numeros2.add(10);
	    numeros2.add(7);

	    int sumaImpares = sumaNumerosImpares2(numeros2);
	    System.out.println("La suma de los números impares es: " + sumaImpares);
    }
    public static int sumaNumerosImpares2(Collection<Integer> numeros3) {
		int suma = 0;
		for (int numero : numeros3) {
			if (numero % 2 != 0) { // Si el número es impar
				suma += numero;
			}
		}
		return suma;
	}

	// EJERCICIO 11
    public void ejercicio11() {
	    mostrarMenu();
    }
	// Función que muestra el menú de la calculadora y realiza la operación seleccionada
	public static void mostrarMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcion;

		do {
			System.out.println("=== Calculadora ===");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("0. Salir");
			System.out.print("Ingresa la opción: ");

			opcion = scanner.nextInt();
			scanner.nextLine(); // Consumir el salto de línea dejado por nextInt()

			switch (opcion) {
				case 1:
					realizarSuma();
					break;
				case 2:
					realizarResta();
					break;
				case 3:
					realizarMultiplicacion();
					break;
				case 4:
					realizarDivision();
					break;
				case 0:
					System.out.println("!Hasta luego!");
					break;
				default:
					System.out.println("Opción inválida. Intenta nuevamente.");
					break;
			}
		} while (opcion != 0);
	}

	// Funciones para realizar las operaciones básicas de la calculadora
	public static void realizarSuma() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		double num1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		double num2 = scanner.nextDouble();
		double resultado = num1 + num2;
		System.out.println("Resultado: " + resultado);
	}

	public static void realizarResta() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		double num1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		double num2 = scanner.nextDouble();
		double resultado = num1 - num2;
		System.out.println("Resultado: " + resultado);
	}

	public static void realizarMultiplicacion() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el primer número: ");
		double num1 = scanner.nextDouble();
		System.out.print("Ingresa el segundo número: ");
		double num2 = scanner.nextDouble();
		double resultado = num1 * num2;
		System.out.println("Resultado: " + resultado);
	}

	public static void realizarDivision() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa el dividendo: ");
		double dividendo = scanner.nextDouble();
		System.out.print("Ingresa el divisor: ");
		double divisor = scanner.nextDouble();

		if (divisor != 0) {
			double resultado = dividendo / divisor;
			System.out.println("Resultado: " + resultado);
		} else {
			System.out.println("No es posible dividir entre cero.");
		}
	}

	// EJERCICIO 12
    public void ejercicio12() {
	    mostrarMenu12();
    }

	// Función que muestra el menú de la calculadora y realiza la operación seleccionada
    public static void mostrarMenu12() {
	    Scanner scanner = new Scanner(System.in);
	    int opcion;
	    do {
		    System.out.println("=== Calculadora ===");
		    System.out.println("1. Sumar");
		    System.out.println("2. Restar");
		    System.out.println("3. Multiplicar");
		    System.out.println("4. Dividir");
		    System.out.println("0. Salir");
		    System.out.print("Ingresa la opción: ");
		    opcion = scanner.nextInt();
		    scanner.nextLine(); // Consumir el salto de línea dejado por nextInt()
		    switch (opcion) {
			    case 1:
				    realizarOperacion('+');
				    break;
			    case 2:
				    realizarOperacion('-');
				    break;
			    case 3:
				    realizarOperacion('*');
				    break;
			    case 4:
				    realizarOperacion('/');
				    break;
			    case 0:
				    System.out.println("!Hasta luego!");
					break;
				default:
				    System.out.println("Opción inválida. Intenta nuevamente.");
				    break;
			}
		} while (opcion != 0);
	}
	// Función que realiza una operación de la calculadora
	public static void realizarOperacion(char operador) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingresa el primer número: ");
	    double num1 = scanner.nextDouble();
	    System.out.print("Ingresa el segundo número: ");
	    double num2 = scanner.nextDouble();
	    switch (operador) {
		    case '+':
			    double suma = num1 + num2;
			    System.out.println("Resultado: " + suma);
			    break;
		    case '-':
			    double resta = num1 - num2;
			    System.out.println("Resultado: " + resta);
			    break;
		    case '*':
			    double multiplicacion = num1 * num2;
			    System.out.println("Resultado: " + multiplicacion);
			    break;
		    case '/':
			    if (num2 != 0) {
				    double division = num1 / num2;
				    System.out.println("Resultado: " + division);
			    } else {
				    System.out.println("No es posible dividir entre cero.");
			    }
			    break;
		    default:
			    System.out.println("Operador inválido.");
			    break;
	    }
    }

	// EJERCICIO 13
    public void ejercicio13() {
	    Scanner scanner = new Scanner(System.in);
	    int capacidadMaxima = 500;
	    int personasIngresadas = 0;
	    int dineroRecaudado = 0;
	    int valorEntradaNormal = 1500;
	    int valorEntradaVIP = 2000;

	    while (true) {
		    System.out.println("=== Menú ===");
		    System.out.println("1. Ingreso de datos.");
		    System.out.println("2. Capacidad disponible.");
		    System.out.println("3. Dinero recaudado.");
		    System.out.println("4. Salir del sistema.");
		    System.out.print("Ingresa la opción: ");
		    int opcion = scanner.nextInt();
		    scanner.nextLine(); // Consumir el salto de línea dejado por nextInt()

		    switch (opcion) {
			    case 1:
				    if (personasIngresadas < capacidadMaxima) {
					    System.out.println("=== Ingreso de datos ===");
					    System.out.print("Nombre: ");
					    String nombre = scanner.nextLine();
					    System.out.print("Edad: ");
					    int edad = scanner.nextInt();
					    scanner.nextLine(); // Consumir el salto de línea dejado por nextInt()
					    System.out.print("DNI: ");
					    String dni = scanner.nextLine();
					    System.out.print("Pase (vip o descuento): ");
					    String pase = scanner.nextLine();

					    if (edad >= 21) {
						    if (pase.equalsIgnoreCase("vip")) {
							    System.out.println("!Bienvenido(a), " + nombre + "! Pase VIP, ingresa gratis.");
							    dineroRecaudado += valorEntradaVIP;
						    } else if (pase.equalsIgnoreCase("descuento")) {
							    System.out.println("!Bienvenido(a), " + nombre + "! Tienes descuento, abonas la mitad.");
							    dineroRecaudado += valorEntradaNormal / 2;
						    } else {
							    System.out.println("!Bienvenido(a), " + nombre + "! Abonas la entrada normal.");
							    dineroRecaudado += valorEntradaNormal;
						    }
						    personasIngresadas++;
					    } else {
						    System.out.println("Lo siento, solo se permite el ingreso a mayores de 21 años.");
					    }
				    } else {
					    System.out.println("Lo siento, el boliche está lleno. Vuelve más tarde.");
				    }
				    break;
			    case 2:
				    int capacidadDisponible = capacidadMaxima - personasIngresadas;
				    System.out.println("Capacidad disponible: " + capacidadDisponible + " personas.");
				    break;
			    case 3:
				    System.out.println("Dinero recaudado: $" + dineroRecaudado);
				    break;
			    case 4:
				    System.out.println("Gracias por usar el sistema. !Hasta luego!");
				    System.exit(0);
			    default:
				    System.out.println("Opción inválida. Intenta nuevamente.");
				    break;
		    }
	    }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}

