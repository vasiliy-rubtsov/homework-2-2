public class Puffenduy extends Hogwarts {
    private int diligence; // Трудолюбие
    private int loyalty; // Верность
    private int honesty; // Честность

    public static void compareStudentsOfFaculty(Puffenduy student1, Puffenduy student2) {
        int contSumm1 = student1.diligence + student1.loyalty + student1.honesty;
        int contSumm2 = student2.diligence + student2.loyalty + student2.honesty;
        String phrase;

        if (contSumm1 > contSumm2) {
            phrase = student1 + " лучший пуффендуец, чем " + student2;
        } else if (contSumm1 < contSumm2) {
            phrase = student2 + " лучший пуффендуец, чем " + student1;
        } else {
            phrase = student1 + " и " + student2 + " - одинаково достойные студенты Пуффендуя";
        }

        System.out.println(phrase);
    }
    public Puffenduy(String firstName, String secondName, int powerOfMagic, int distanceOfTrangression, int diligence, int loyalty, int honesty) {
        super(firstName, secondName, powerOfMagic, distanceOfTrangression);
        this.facultyName = "Пуффендуй";
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public void report() {
        super.report();
        System.out.println("Трудолюбие:" + diligence);
        System.out.println("Верность:" + loyalty);
        System.out.println("Честность:" + honesty);
    }
}
