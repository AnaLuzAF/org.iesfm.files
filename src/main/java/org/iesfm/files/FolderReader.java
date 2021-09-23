package org.iesfm.files;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FolderReader {
    private final static Logger log= LoggerFactory.getLogger(FolderReader.class);
    private   FileToStringReader reader= new FileToStringReader();

    public String readAll (String folderPath){
        File folder= new File(folderPath);
        StringBuilder builder= new StringBuilder(); //construir String

        for(File file: folder.listFiles()){
        builder.append(reader.readFile(file));
        }

        return builder.toString();
    }

    public static void main(String[] args) {

        FolderReader reader= new FolderReader();
        log.info(reader.readAll("/home/analuz/files"));




    }
}
