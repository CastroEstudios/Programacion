/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut5_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 1damba
 */
public class ut5_7 {
    
    public ut5_7() {
    
}
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File archivo = new File("C:/Users/%username%/Desktop/GitHub/Lenguaje-de-Marcas/UT5");
        File backupLocation = new File("C:/Users/%username%/Documents");
        ut5_7 prueba = new ut5_7();
        prueba.runOverFiles(archivo, backupLocation);
    }
    
    public void runOverFiles(File archivo, File backupLocation) throws FileNotFoundException, IOException {
        File[] archivosCarpeta = archivo.listFiles();
        for (int i = 0; i < archivosCarpeta.length; i++) {
            if(archivosCarpeta[i].isDirectory()) {
                String nombreArchivo = archivosCarpeta[i].getName();
                File nuevaLocalizacion = new File(backupLocation + "/" + nombreArchivo);
                nuevaLocalizacion.mkdir();
                //Recorremos el interior de la carpeta
                ut5_7 recorrerCarpeta = new ut5_7();
                recorrerCarpeta.runOverFiles(archivo, backupLocation);
            }else if(archivosCarpeta[i].isFile()) {
                //Cogemos el nombre del archivo actual
                String nombreArchivo = archivosCarpeta[i].getName();
                //Establecemos la localización del archivo de backup
                File nuevaLocalizacion = new File(backupLocation + "/" + nombreArchivo);
                //Creamos el archivo de backup en la localización
                nuevaLocalizacion.createNewFile();
                //Obtenemos la ruta absoluta del archivo para copiar su contenido.
                File archivoActual = new File(archivosCarpeta[i].getAbsolutePath());
                ut5_7 copiarContenido = new ut5_7();
                ArrayList<String> contenidoArchivo = copiarContenido.fileToArrayList(archivoActual);
                //Pegamos el cotenido en el archivo de backup
                copiarContenido.arrayListToFile(contenidoArchivo, nuevaLocalizacion);
            }
        }
    }
    
    public ArrayList fileToArrayList(File archivoActual) throws FileNotFoundException {
        ArrayList<String> contenidoArchivo = new ArrayList<String>();
        Scanner s = new Scanner (archivoActual);
        while (s.hasNext()) {
            contenidoArchivo.add(s.nextLine());
        }
        return contenidoArchivo;
    }
    
    public void arrayListToFile(ArrayList contenidoArchivo, File nuevaLocalizacion) throws IOException {
        FileWriter fw = new FileWriter(nuevaLocalizacion);
        for(int j = 0; j < contenidoArchivo.size(); j++) {
            fw.write((String) contenidoArchivo.get(j));
        }
    }
}
