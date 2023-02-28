package cts.s02.principii_clean_code.clase.reader;

import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudent extends ReaderAplicant{

    Scanner input = new Scanner(new File(file));
		input.useDelimiter(",|\n");
    List<Student> studenti = new ArrayList<Student>();

		while (input.hasNext()) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        int an_studii = input.nextInt();
        String facultate = (input.next()).toString();
        Student s = new Student(nume, prenume, varsta, punctaj, nr, vect, facultate, an_studii);
        studenti.add(s);
    }
		input.close();
		return studenti;
}