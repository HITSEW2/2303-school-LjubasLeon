import java.util.Scanner;

public class Student {

    //Attribute
    private int noten;
    private String klasse;
    private String geburtsdatum;
    private char geschlecht;

    //Konstruktoren
    public Student(int noten, String klasse, String geburtsdatum, char geschlecht){
        setNoten(noten);
        setKlasse(klasse);
        setGeburtsdatum(geburtsdatum);
        setGeschlecht(geschlecht);
    }

    public Student(String klasse, int noten){}

    //GETTER SETTER
    public int getNoten() {
        return noten;
    }

    public void setNoten(int noten) {
        this.noten = noten;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void prüfenoten(int noten) {

        if(noten < 1){
            setNoten(1);
        } else if (noten > 5) {
            setNoten(5);
        }
        if(noten < 3){
            System.out.println("Sie haben einen guten Erfolg!");
        }
    }

    public void Geschlechtprüfen(char geschlecht){
        Scanner sc = new Scanner(System.in);

        if (geschlecht == 'm'){

            System.out.println("Sie sind ein Mann?");
            String antwort = sc.next();
            if (antwort.toLowerCase().equals("ja")){
                System.out.println("ok");
            }
            if (antwort.toLowerCase().equals("nein")){
                setGeschlecht('w');
            }

        } else if (geschlecht == 'w') {
            System.out.println("Sie sind eine Frau?");
            String antwort = sc.next();
            if (antwort.toLowerCase().equals("ja")){
                System.out.println("ok");
            }
            if (antwort.toLowerCase().equals("nein")){
                setGeschlecht('m');
            }
        }
    }


}