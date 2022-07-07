package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas implements listarNotasMaterias{

    @Getter
    @Setter
    ArrayList<ArrayList<String>> notasFinales = new ArrayList<>(); //contiene la lista de listas "nota" en formato string
    @Getter
    @Setter
    ArrayList<Integer> nota = new ArrayList<>(); //lista para agregar nota por nota

    @Getter
    @Setter
    private double promedio;  //calcula el promedio

    @Override
    public void RegistrarAlumnosNM() { //metodo para registrar las notas del alumno segun la materia que cursa

        int i;

        int notas;

        Materia materia1 = new Materia();

        materia1.mostrarmaterias();  //muestra la informacion de las materias para ver su CODIGO

        System.out.println("Seleccionar CODIGO materia");

        Scanner entrada = new Scanner(System.in);

        String buscar = entrada.next(); //escribe el codigo de la materia

        String toUper = buscar.toUpperCase(); //lo pasa a mayuscula

        if(toUper.isEmpty()){  //en caso de estar vacio se manda el sig msj

            System.out.println("Por favor ingresar un codigo de materia");

        }else {

            for (i = 0; i < BdMaterias.listarMaterias().size(); i++) { //toma el tamaño de todo el listado de materias para recorrerlas todas

                String compare = BdEstudiantes.listarEstudiantes().get(i).getIdMateria();

                if (compare.contains(toUper)) { //compara el IdMateria de la bd de estudiantes con la ingresada

                    for (int y = 0; y < BdEstudiantes.listarEstudiantes().size(); y++) {

                        if (y == i) {

                            System.out.println("Cantidad de notas a ingresar al alumno en: " + BdEstudiantes.listarEstudiantes().get(y).getIdMateria());

                            int cantNotas = entrada.nextInt();

                            System.out.println("Ingresar notas a estudiante: " + BdEstudiantes.listarEstudiantes().get(y).nombre + " " + BdEstudiantes.listarEstudiantes().get(y).apellido);

                            for (int j = 0; j < cantNotas; j++) {

                                notas = entrada.nextInt();

                                nota.add(notas); // agrega las notas individualmente para despues juntarlas en el listado "notas"

                                promedio += notas;

                            }

                            promedio = promedio / cantNotas; //calculo del promedio

                            String listadoNotas = String.valueOf(nota); //pasa las notas agregadas individualmente a string

                            String listadoPromedios = String.valueOf(promedio); //pasa el promedio a string

                            ArrayList<String> listadoFinal = new ArrayList<>(); //agrega las notas y la info del estudiante por separado

                            listadoFinal.add(BdEstudiantes.listarEstudiantes().get(y).getIdMateria());

                            listadoFinal.add(BdEstudiantes.listarEstudiantes().get(y).nombre);

                            listadoFinal.add(BdEstudiantes.listarEstudiantes().get(y).apellido);

                            listadoFinal.add(listadoNotas);

                            listadoFinal.add(listadoPromedios);

                            notasFinales.add(listadoFinal); //junta todo la informacion agregada por seprado en listadoFinal

                            System.out.println("Alumno/a" + " " + listadoFinal);

                            promedio = 0; //limpia el promedio del alumno

                            nota.clear(); //limpia la lista nota para que empiece desde cero con el proximo alumno

                        }

                    }

                }
            }
        }
    }

    @Override
    public void ListarAlumnosNM() {  //muestra la info de todos los alumnos

        System.out.println("Materia: | Nombre: | Apellido: | Notas: | Promedio:");

        for(int i = 0; i < notasFinales.size(); i++){

            System.out.println(notasFinales.get(i));

        }
    }
}
