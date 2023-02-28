package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Utils;
import cts.s02.principii_clean_code.clase.reader.ReaderAngajat;
import cts.s02.principii_clean_code.clase.reader.ReaderAplicant;

public class Program {

	public static void main(String[] args) {
		List<cts.s02.principii_clean_code.clase.Aplicant> listaAngajati;
		try {
			ReaderAplicant readerAngajat=new ReaderAngajat("angajati.txt");
			listaAngajati = readerAngajat.readAplicant();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
