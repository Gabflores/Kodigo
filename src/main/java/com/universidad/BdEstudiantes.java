package com.universidad;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BdEstudiantes {
    @Getter @Setter
    private int numeroCuotas =0;
    public static ArrayList<Estudiante> listarEstudiantes (){
        ArrayList<Estudiante> estudiantesList = new ArrayList();
        ArrayList<Materia> materiasList = BdMaterias.listarMaterias();

        Estudiante estudiante1 = new Estudiante(6,"Renata","Morales","FEM","15-03-1985","activo",15.3,"a","QUIM1",new ArrayList<>(Arrays.asList(materiasList.get(1),materiasList.get(2))),6);
        Estudiante estudiante2 = new Estudiante(7,"Romina","Larico","FEM","15-03-1985","activo",15.3,"a","QUIM1",new ArrayList<>(Arrays.asList(materiasList.get(1),materiasList.get(3))),6);
        Estudiante estudiante3 = new Estudiante(8,"Luis","Gomez","FEM","15-03-1985","activo",15.3,"a","QUIM2",new ArrayList<>(Arrays.asList(materiasList.get(6),materiasList.get(4))),5);
        Estudiante estudiante4 = new Estudiante(9,"Julio","Morales","FEM","15-03-1985","activo",15.3,"a","FIS2",new ArrayList<>(Arrays.asList(materiasList.get(2),materiasList.get(5))),7);
        Estudiante estudiante5 = new Estudiante(10,"Carlos","Morales","FEM","15-03-1985","activo",15.3,"a","QUIM3",new ArrayList<>(Arrays.asList(materiasList.get(3),materiasList.get(4))),8);
        Estudiante estudiante6 = new Estudiante(11,"Rita","Morales","FEM","15-03-1985","activo",15.3,"a","FIS1",new ArrayList<>(Arrays.asList(materiasList.get(5),materiasList.get(1))),2);
        Estudiante estudiante7 = new Estudiante(12,"Pedro","Morales","FEM","15-03-1985","activo",15.3,"a","PROG1",new ArrayList<>(Arrays.asList(materiasList.get(2),materiasList.get(3))),5);
        Estudiante estudiante8 = new Estudiante(13,"Pablo","Morales","FEM","15-03-1985","activo",15.3,"a","FIS2",new ArrayList<>(Arrays.asList(materiasList.get(1),materiasList.get(7))),6);
        Estudiante estudiante9 = new Estudiante(14,"Pia","Morales","FEM","15-03-1985","activo",15.3,"a","ING1",new ArrayList<>(Arrays.asList(materiasList.get(3),materiasList.get(7))),8);
        Estudiante estudiante10 = new Estudiante(15,"Paula","Morales","FEM","15-03-1985","activo",15.3,"a","ING2",new ArrayList<>(Arrays.asList(materiasList.get(3),materiasList.get(6))),9);

        estudiantesList.add(estudiante1);
        estudiantesList.add(estudiante2);
        estudiantesList.add(estudiante3);
        estudiantesList.add(estudiante4);
        estudiantesList.add(estudiante5);
        estudiantesList.add(estudiante6);
        estudiantesList.add(estudiante7);
        estudiantesList.add(estudiante8);
        estudiantesList.add(estudiante9);
        estudiantesList.add(estudiante10);

        return estudiantesList;

    }
}
