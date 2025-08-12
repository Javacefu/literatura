package com.alura.literatura.principal;

import com.alura.literatura.service.ConsumoAPI;
import com.alura.literatura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

@Component
public class Principal {
    @Autowired
    private LibroService libroService;
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoApi = new ConsumoAPI();
    private final String URL_BASE = "https://gutendex.com/books";

    public void muestraElMenu() throws IOException, InterruptedException {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    1- buscar libro por titulo
                    2- listar libros registrados
                    3- listar autores registrados
                    4- listar autores vivos en un determinado año
                    5- listar libros por idioma
                    0- salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextByte();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarLibroPorTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivosEnUnDeterminadoAnio();
                    break;
                case 5:
                    listarLibrosPorIdioma();
                    break;
                case 0:
                    System.out.println("Saliendo de la aplicacion");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    private void buscarLibroPorTitulo() throws IOException, InterruptedException {
        System.out.println("Ingrese el titulo del libro a buscar");
        String titulo = teclado.nextLine().trim();

        //Llamar a la API con el titulo ingresado
        String urlBusqueda = URL_BASE + "?search=" + titulo.replace(" ", "%20");
        String json = consumoApi.obtenerDatos(urlBusqueda);

        System.out.println("URL: " + urlBusqueda);

        System.out.println("\nResultado de la busqueda: ");
        System.out.println(json);
    }

    private void listarLibrosRegistrados() throws IOException, InterruptedException {
        System.out.println("Listando libros registrados (primera página)");
        String url = URL_BASE + "?page=1";
        String json = consumoApi.obtenerDatos(url);
        System.out.println(json);
    }

    private void listarAutoresRegistrados() throws IOException, InterruptedException {
        System.out.println("Listando autores registrados (extraído de libros página 1)");
        String url = URL_BASE + "?page=1";
        String json = consumoApi.obtenerDatos(url);
        System.out.println(json);
    }

    private void listarAutoresVivosEnUnDeterminadoAnio() throws IOException, InterruptedException {
        System.out.println("Ingrese el año para listar autores vivos en ese año");
        int anio = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Listando autores vivos en el año " + anio);
        // Por simplicidad, obtener autores de página 1 y filtrar en consola (puede ser luego en el service)
        String url = URL_BASE + "?page=1";
        String json = consumoApi.obtenerDatos(url);
        System.out.println(json);
        System.out.println("NOTA: Filtro por año debe ser implementado para extraer autores vivos.");
    }

    private void listarLibrosPorIdioma() throws IOException, InterruptedException {
        System.out.println("Ingrese el código de idioma (ejemplo: en)");
        String idioma = teclado.nextLine().trim();

        System.out.println("Listando libros en idioma: " + idioma);
        String url = URL_BASE + "?languages=" + idioma;
        String json = consumoApi.obtenerDatos(url);
        System.out.println(json);
    }
}
