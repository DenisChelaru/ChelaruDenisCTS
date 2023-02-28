package cts.s02.principii_clean_code.clase.reader;


import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {

    public String getFileName() {
        return fileName;
    }

    String fileName="";
    public ReaderAplicant(String file){
        this.fileName=file;

    }
        public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;

    }

