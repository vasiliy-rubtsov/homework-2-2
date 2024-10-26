public class Griffindor extends Hogwarts {
    private int nobility; // Благородство
    private int honor; // Честь
    private int bravery; // Храбрость

    public static void compareStudentsOfFaculty(Griffindor student1, Griffindor student2) {
        int contSumm1 = student1.nobility + student1.honor + student1.bravery;
        int contSumm2 = student2.nobility + student2.honor + student2.bravery;
        String phrase;

        if (contSumm1 > contSumm2) {
            phrase = student1 + " лучший гриффиндорец, чем " + student2;
        } else if (contSumm1 < contSumm2) {
            phrase = student2 + " лучший гриффиндорец, чем " + student1;
        } else {
            phrase = student1 + " и " + student2 + " - одинаково достойные студенты Гриффиндора";
        }

        System.out.println(phrase);
    }

    public Griffindor(String firstName, String secondName, int powerOfMagic, int distanceOfTrangression, int nobility, int honor, int bravery) {
        super(firstName, secondName, powerOfMagic, distanceOfTrangression);
        this.facultyName = "Гриффиндор";
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public void report() {
        super.report();
        System.out.println("Благородство: " + nobility);
        System.out.println("Честь: " + honor);
        System.out.println("Храбрость: " + bravery);
    }
}
