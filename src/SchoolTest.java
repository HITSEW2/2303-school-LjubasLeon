public class SchoolTest {
    public static void main(String[] args){



    Student leon = new Student(1,"2CHIT", "23.4.2008", 'm');

    Teacher HELT = new Teacher("SEW", "Thomas Helml", 'm', "1980");

        //Student-Methoden aufrufen
        leon.Geschlechtprüfen(leon.getGeschlecht());
        leon.prüfenoten(leon.getNoten());

        HELT.alter(HELT.getGeburtsjahr());
    }
}
