public class Kogtevran extends Hogwarts {
    private int smart; // Ум
    private int wise; // Мудрость
    private int humor; // Остроумие
    private int creativity; // Креативность

    public static void compareStudentsOfFaculty(Kogtevran student1, Kogtevran student2) {
        int contSumm1 = student1.smart + student1.wise + student1.humor + student1.creativity;
        int contSumm2 = student2.smart + student2.wise + student2.humor + student2.creativity;
        String phrase;

        if (contSumm1 > contSumm2) {
            phrase = student1 + " лучший когтевранец, чем " + student2;
        } else if (contSumm1 < contSumm2) {
            phrase = student2 + " лучший когтевранец, чем " + student1;
        } else {
            phrase = student1 + " и " + student2 + " - одинаково достойные студенты Когтеврана";
        }

        System.out.println(phrase);
    }

    public Kogtevran(String firstName, String secondName, int powerOfMagic, int distanceOfTrangression, int smart, int wise, int humor, int creativity) {
        super(firstName, secondName, powerOfMagic, distanceOfTrangression);
        this.facultyName = "Когтевран";
        this.smart = smart;
        this.wise = wise;
        this.humor = humor;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public void report() {
        super.report();
        System.out.println("Ум: " + smart);
        System.out.println("Мудрость: " + wise);
        System.out.println("Остроумие: " + humor);
        System.out.println("Креативность: " + creativity);
    }
}
