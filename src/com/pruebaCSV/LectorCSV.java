package com.pruebaCSV;
import java.io.FileReader;
import com.opencsv.CSVReader;

public class LectorCSV {
    public void leeCSV(String nombreArchivo){
        try{
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String [] fila;
            while ((fila = csvReader.readNext()) != null) {
                System.out.println(fila[0] +
                        " | " + fila[1] +
                        " | " + fila[2] );
            }
            csvReader.close();
        }   catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
