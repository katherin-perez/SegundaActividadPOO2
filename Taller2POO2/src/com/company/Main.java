package com.company;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        Book book = new Book("Me_Llevarás_en_ti", "Ivan_Obando", "a123-456-7890-9", 100);

        String control = "";
        do {
            System.out.println("Seleecione la operación que desea realizar: 1 para consultar un libro, 2 para prestar " +
                    "un libro o 3 para devolver un libro");
            int opt = scanner.nextInt();

            switch (opt){
                case 1:
                    System.out.println("Digite el nombre del libro a consultar");
                    String libroConsulta = scanner.next();
                    try {
                        book.existence(libroConsulta);
                        System.out.println("El libro fue encontrado exitosamente (´꒳`)♡");
                    }catch (ExistenceException e) {
                        System.out.println("Error: [" + e.getCode() + "] " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Digite la cantidad de libros a prestar");
                    int librosAPrestar = scanner.nextInt();
                    try{
                        book.lending(librosAPrestar);
                        System.out.println("El retiro del libro " + book.getTitle() + " fue exitoso, la cantidad de libros restantes " +
                                "en inventario es: "+book.getQuantity());
                    }catch (CantidadException e){
                        System.out.println("Error: [" + e.getCode() + "] " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Digite la cantidad de libros a devolver");
                    int librosADevolver = scanner.nextInt();
                    try {
                        book.giveBack(librosADevolver);
                        System.out.println("La devolución del libro "+ book.getTitle()+ " fue exitosa, la cantidad de libros "
                                + book.getQuantity());
                    }catch (CantidadException e){
                        System.out.println("Error: [" + e.getCode() + "] " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            System.out.println("¿Desea realizar otra operación? SI/NO");
            control = scanner.next();
        }while (control.equalsIgnoreCase("SI"));
    }
}
