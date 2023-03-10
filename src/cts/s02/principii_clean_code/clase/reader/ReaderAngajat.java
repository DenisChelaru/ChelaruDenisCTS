package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Angajat;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAngajat extends ReaderAplicant{

    Scanner input2 = new Scanner(new File(super.getFileName()));
		input2.useDelimiter(",");
    List<Angajat> angajati = new ArrayList<Angajat>();

		while (input2.hasNext()) {
        String nume = input2.next();
        String prenume = input2.next();
        int varsta = input2.nextInt();
        int punctaj = input2.nextInt();
        int nr = input2.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input2.next();
        int salariu = input2.nextInt();
        String ocupatie = input2.next();
        Angajat a = new Angajat(nume, prenume, varsta, punctaj, nr, vect, salariu, ocupatie);
        angajati.add(a);
    }
		input2.close();
		return angajati;

}
