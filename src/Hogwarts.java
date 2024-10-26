public abstract class Hogwarts {
    protected String facultyName;
    protected String firstName;
    protected String secondName;
    protected int powerOfMagic; // Сила магии
    protected int distanceOfTrangression; // Расстояние трансгрессии

    public static void compareStudents(Hogwarts student1, Hogwarts student2) {
        String compMagic;
        String compTransgression;

        if (student1.powerOfMagic > student2.powerOfMagic) {
            compMagic = "превосходит по силе магии";
        } else if (student1.powerOfMagic < student2.powerOfMagic) {
            compMagic = "уступает по силе магии";
        } else {
            compMagic = "равен по силе магии";
        }

        if (student1.distanceOfTrangression > student2.distanceOfTrangression) {
            compTransgression = "превосходит по расстоянию трансгрессии";
        } else if (student1.distanceOfTrangression < student2.distanceOfTrangression) {
            compTransgression = "уступает по расстоянию трансгрессии";
        } else {
            compTransgression = "равен по расстоянию трансгрессии";
        }

        System.out.println(student1 + " " + compMagic + " и " + compTransgression + " " + student2);
    }

    public Hogwarts(String firstName, String secondName, int powerOfMagic, int distanceOfTrangression) {
        this.facultyName = "Не определено";
        this.firstName = firstName;
        this.secondName = secondName;
        this.powerOfMagic = powerOfMagic;
        this.distanceOfTrangression = distanceOfTrangression;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistanceOfTrangression() {
        return distanceOfTrangression;
    }

    public void setDistanceOfTrangression(int distanceOfTrangression) {
        this.distanceOfTrangression = distanceOfTrangression;
    }

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }

    public void report() {
        System.out.println("Фамилия: " + secondName);
        System.out.println("Имя: " + firstName);
        System.out.println("Сила магии: " + powerOfMagic);
        System.out.println("Расстояние трансгрессии: " + distanceOfTrangression);
        System.out.println("Факультет: " + facultyName);
        System.out.println("-----");
    }


}
