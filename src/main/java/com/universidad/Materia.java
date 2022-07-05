package com.universidad;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import lombok.Getter;
import lombok.Setter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Materia {


    @Setter
    @Getter
    private String idMateria;

    @Setter
    @Getter
    private String nombreMateria;

    @Setter
    @Getter
    private String horario;

    @Setter
    @Getter
    private String fechaInicio;

    @Setter
    @Getter
    private String fechaFin;


    public Materia(String idMateria, String nombreMateria, String horario, String fechaInicio, String fechaFin) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.horario = horario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Materia() {

    }

    /* public void mostrarmaterias(){
        for (int i=0; i < idMateria.length; i++ ){
            System.out.println("Indice: "+  (i) +  " Codigo: " + idMateria[i] + " " + "Materia: " + nombreMateria[i] );/      }
    }*/

    @Override
    public String toString() {
        return "Materia{" +
                "idMateria='" + idMateria + '\'' +
                ", nombreMateria='" + nombreMateria + '\'' +
                ", horario='" + horario + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                '}';
    }

    public  void mostrarInfo() throws FileNotFoundException {


        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Escriba el indice de la materia:");

         int nmateria = entrada.nextInt();


        //Crear pdf PdfWriter
        String dest = "C:/Pruebas/prueba.pdf";
        PdfWriter writer = new PdfWriter(dest);

        //Crear PdfDocument
        PdfDocument pdfDoc = new PdfDocument(writer);

        //Crear documento
        Document documento = new Document(pdfDoc);

        //creando tabla
        float [] pointColumnWidth = {150F, 150F};
        Table tabla = new Table(pointColumnWidth);


           //Agregando datos a la tabla
           //primera fila
           Cell cell1 = new Cell();
           cell1.add("ID de la materia");
           tabla.addCell(cell1);

           Cell cell2 = new Cell();
           cell2.add(BdMaterias.listarMaterias().get(0).idMateria);
           tabla.addCell(cell2);


           //segunda fila
           Cell cell3 = new Cell();
           cell3.add("Materia");
           tabla.addCell(cell3);

           Cell cell4 = new Cell();
           cell4.add(BdMaterias.listarMaterias().get(0).nombreMateria);
           tabla.addCell(cell4);

           //tercera fila
           Cell cell5 = new Cell();
           cell5.add("Maestro");
           tabla.addCell(cell5);

           Cell cell6 = new Cell();
           cell6.add("maestrooo");
           tabla.addCell(cell6);

           //cuarta fila
           Cell cell7 = new Cell();
           cell7.add("Horario");
           tabla.addCell(cell7);

           Cell cell8 = new Cell();
           cell8.add(BdMaterias.listarMaterias().get(0).horario);
           tabla.addCell(cell8);

           //quinta fila
           Cell cell9 = new Cell();
           cell9.add("Fecha de inicio");
           tabla.addCell(cell9);

           Cell cell10 = new Cell();
           cell10.add(BdMaterias.listarMaterias().get(0).fechaInicio);
           tabla.addCell(cell10);

           //sexta fila
           Cell cell11 = new Cell();
           cell11.add("Fecha de finalizacion");
           tabla.addCell(cell11);

           Cell cell12 = new Cell();
           cell12.add(BdMaterias.listarMaterias().get(0).fechaFin);
           tabla.addCell(cell12);

           documento.add(tabla);

           documento.close();

           entrada.close();

           System.out.println("Documento PDF creado");


    }









}
