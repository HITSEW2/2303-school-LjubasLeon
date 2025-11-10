public class Teacher {

    //Attribute
    private String fach;
    private String name;
    private char geschlecht;
    private String Geburtsjahr;

    //Konstruktoren
    public Teacher(String fach, String name, char geschlecht, String Geburtsjahr){}

    public Teacher(char geschlecht){}

    //GETTER SETTER
    public String getFach() {
        return fach;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getGeburtsjahr() {
        return Geburtsjahr;
    }

    public void setGeburtsjahr(String geburtsjahr) {
        Geburtsjahr = geburtsjahr;
    }


    public void alter(String geburtsjahr){
         int jahr = Integer.parseInt(geburtsjahr);

         int alter = 2025-jahr;

        System.out.println(name + " ist "+ alter + " jahre alt.");
    }
}