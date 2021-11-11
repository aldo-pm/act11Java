package java11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opciones = 0, propiedad = 0, opcion = 0;
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccionar la propiedad a calcular:");
            System.out.println("1 - área");
            System.out.println("2 - perímetro");
            System.out.println("7 - Salir");
            try {
                opciones = sc.nextInt();
                switch (opciones) {
                    case 1:
                        propiedad = 1;
                        System.out.println("Area seleccionada");
                        System.out.println("Selecciona la figura a calcular:");
                        System.out.println("3 - Circulo");
                        System.out.println("4 - Triangulo");
                        System.out.println("5 - Cuadrado");                       
                        System.out.println("6.Solicitar los atributos de la figura");
                        System.out.println("7.Salir");
                        break;
                    case 2:
                        propiedad = 2;
                        System.out.println("Perimetro seleccionado");
                        System.out.println("Selecciona la figura a calcular:");
                        System.out.println("3 - Circulo");
                        System.out.println("4 - Triangulo");
                        System.out.println("5 - Cuadrado");
                        System.out.println("6 - Solicitar los atributos de la figura");
                        System.out.println("7 - Salir");
                        break;

                    case 3:
                        Circle circle = new Circle();
                        opcion = 1;
                        if (propiedad == 1) {
                            System.out.println("Area= " + circle.area());
                        } else {
                            System.out.println("Perimetro=" + circle.perimetro());
                        }
                        break;
                    case 4:
                        Triangle triangle = new Triangle();
                        opcion = 2;
                        if (propiedad == 1) {
                            System.out.println("Area= " + triangle.area());
                        } else {
                            System.out.println("Perimetro=" + triangle.perimetro());
                        }
                        break;
                    case 5:
                        Square square = new Square();
                        opcion = 3;
                        if (propiedad == 1) {
                            System.out.println("Area= " + square.area());
                        } else {
                            System.out.println("Perimetro= " + square.perimetro());
                        }
                        break;

                    case 6:
                        if (propiedad == 1) {
                            Circle circle1 = new Circle();
                        } else if (propiedad == 2) {
                            Triangle triangle1 = new Triangle();
                        } else if (propiedad == 3) {
                            Square square1 = new Square();
                        }

                        break;
                    case 7:
                        salir = true;
                        System.out.println("Se ha salido del programa");
                        break;
                    default:
                        throw new IllegalStateException("opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("opcion invalida");
                sc.next();
            }
        }
    }
}


