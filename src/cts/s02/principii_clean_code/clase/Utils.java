package cts.s02.principii_clean_code.clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

	public static void readAll() {
		List<Elev> listaelevi;
		List<Student> listastudenti;
		List<Angajat> listaangajati;

		try {
			System.out.println("aasdasdasdas =>>>>>>>>>>.");

			listaelevi = Utils.readPupil("elevi.txt");

			for (int i = 0; i < listaelevi.size(); i++)
				System.out.println(listaelevi.get(i).toString());

			listastudenti = Utils.readStudents("studenti.txt");
			for (int i = 0; i < listastudenti.size(); i++)
				System.out.println(listastudenti.get(i).toString());

			listaangajati = Utils.readAngajati("angajati.txt");
			for (int i = 0; i < listaangajati.size(); i++)
				System.out.println(listaangajati.get(i).toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
