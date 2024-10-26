public class Slizerin extends Hogwarts {
    private int trick; // Хитрость
    private int resolute; // Решительность
    private int ambition; // Амбициозность
    private int resourcefulness; // Находчивость
    private int lustForPower; // Жажда власти

    public static void compareStudentsOfFaculty(Slizerin student1, Slizerin student2) {
        int contSumm1 = student1.trick + student1.resolute + student1.ambition + student1.resourcefulness + student1.lustForPower;
        int contSumm2 = student2.trick + student2.resolute + student2.ambition + student2.resourcefulness + student2.lustForPower;
        String phrase;

        if (contSumm1 > contSumm2) {
            phrase = student1 + " лучший слизеринец, чем " + student2;
        } else if (contSumm1 < contSumm2) {
            phrase = student2 + " лучший слизеринец, чем " + student1;
        } else {
            phrase = student1 + " и " + student2 + " - одинаково достойные студенты Слизерина";
        }

        System.out.println(phrase);
    }

    public Slizerin(String firstName, String secondName, int powerOfMagic, int distanceOfTrangression, int trick, int resolute, int ambition, int resourcefulness, int lustForPower) {
        super(firstName, secondName, powerOfMagic, distanceOfTrangression);
        this.facultyName = "Слизерин";
        this.trick = trick;
        this.resolute = resolute;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }



    @Override
    public void report() {
        super.report();
        System.out.println("Хитрость:" + trick);
        System.out.println("Решительность:" + resolute);
        System.out.println("Амбициозность:" + ambition);
        System.out.println("Находчивость:" + resourcefulness);
        System.out.println("Жажда власти:" + lustForPower);

    }
}
