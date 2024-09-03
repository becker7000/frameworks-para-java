package com.cst.struts.app.model;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CargadorArchivoAction extends ActionSupport {

    private File archivo; // El archivo subido
    private String archivoFileName; // El nombre del archivo
    private String archivoContentType; // El tipo de contenido del archivo

    // Ruta donde se guardará el archivo en el servidor
    private static final String DIRECTORIO_SUBIDA = "C:/archivos_subidos";
    // Tamaño máximo permitido en bytes (ej. 5MB = 5 * 1024 * 1024)
    private static final long TAMANO_MAXIMO = 5 * 1024 * 1024;
    // Tipos de archivo permitidos
    private static final List<String> TIPOS_PERMITIDOS = Arrays.asList(
            "image/jpeg","image/png", "application/pdf","text/plain"
    );

    @Override
    public String execute() {
        if (archivo != null) {
            // Validar el tamaño del archivo
            if (archivo.length() > TAMANO_MAXIMO) {
                addActionError("El archivo es demasiado grande. El tamaño máximo permitido es de 5MB.");
                return ERROR;
            }

            // Validar el tipo de archivo
            if (!TIPOS_PERMITIDOS.contains(archivoContentType)) {
                addActionError("Tipo de archivo no permitido. Solo se permiten imágenes JPG, PNG y archivos PDF.");
                return ERROR;
            }

            try {
                // Crear el directorio de destino si no existe
                File directorioSubida = new File(DIRECTORIO_SUBIDA);
                if (!directorioSubida.exists()) {
                    directorioSubida.mkdirs();
                }
                // Mover el archivo al directorio de destino
                File archivoDestino = new File(directorioSubida, archivoFileName);
                FileUtils.copyFile(archivo, archivoDestino);
                System.out.println("\n\t Archivo cargado: "+archivoFileName);
                System.out.println("\n\t Destino: "+DIRECTORIO_SUBIDA);
                return SUCCESS;
            } catch (IOException e) {
                e.printStackTrace();
                return ERROR;
            }
        }
        return ERROR;

    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getArchivoFileName() {
        return archivoFileName;
    }

    public void setArchivoFileName(String archivoFileName) {
        this.archivoFileName = archivoFileName;
    }

    public String getArchivoContentType() {
        return archivoContentType;
    }

    public void setArchivoContentType(String archivoContentType) {
        this.archivoContentType = archivoContentType;
    }

}
