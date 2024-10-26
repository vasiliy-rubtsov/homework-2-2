public class Main {
    public static void main(String[] args) {
        // Инициализируем массивы студентов
        // гриффиндорцы
        Griffindor[] griffindors = {
                new Griffindor("Гарри", "Поттер", 98, 50, 0, 0, 0),
                new Griffindor("Гермиона", "Грейнджер", 80, 60, 5, 5, 6),
                new Griffindor("Рон", "Уизли", 76, 85, 3, 6, 5)
        };

        // слизеринцы
        Slizerin[] slizerins = {
                new Slizerin("Драко", "Малфой", 54, 30, 0, 0, 0, 0, 0),
                new Slizerin("Грэхэм", "Монтегю", 62, 80, 0, 0, 0, 0, 0),
                new Slizerin("Грегори", "Гойл", 80, 90, 0, 0, 0, 0, 0),
        };

        // пуффендуйцы
        Puffenduy[] puffenduys = {
            new Puffenduy("Захария", "Смит", 80, 0, 0, 0, 0),
            new Puffenduy("Седрик", "Диггори", 99, 0, 0, 0, 0),
            new Puffenduy("Джастин", "Финч-Флетчли", 74, 0, 0, 0, 0)
        };

        // когтевранцы
        Kogtevran[] kogtevrans = {
            new Kogtevran("Чжоу", "Чанг", 67, 0, 0, 0, 0, 0),
            new Kogtevran("Падма", "Патил", 83, 0, 0, 0, 0, 0),
            new Kogtevran("Маркус", "Белби", 94, 0, 0, 0, 0, 0)
        };

        // Сводный отчет по всем студентам
        // гриффиндорцы
        for (Griffindor student: griffindors) {
            student.report();
            System.out.println("----------------------------------------");
        }
        // слизеринцы
        for (Slizerin student: slizerins) {
            student.report();
            System.out.println("----------------------------------------");
        }
        // пуффендуйцы
        for (Puffenduy student: puffenduys) {
            student.report();
            System.out.println("----------------------------------------");
        }
        // когтевранцы
        for (Kogtevran student: kogtevrans) {
            student.report();
            System.out.println("----------------------------------------");
        }

        // Сравниваем Гарри Поттера и Грегори Гойла по основным показателям
        Hogwarts.compareStudents(puffenduys[2], griffindors[0]);

        // Сравниваем студентов Гриффиндора Гермиону и Рона
        Griffindor.compareStudentsOfFaculty(griffindors[1], griffindors[2]);

    }
}