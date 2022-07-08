public class Main {
    public static void main(String[] args) {

        GriffindorStudent harry = new GriffindorStudent ("Гарии Поттер", 15 ,40, 25,89,78);
        GriffindorStudent germiona = new GriffindorStudent("Гермиона Грейнджер",68,97,45,52,63);
        GriffindorStudent ron = new GriffindorStudent("Рон Уизли",45,86,56,78,23);

        SlytherinStudent drako = new SlytherinStudent("Драко Малфой",45,23,76,68,81,
                                                                                                                 37,24);
        SlytherinStudent grehem = new SlytherinStudent("Грэхэм Монтегю",23,82,5,58,76,
                                                                                                                 89,76);
        SlytherinStudent gregori = new SlytherinStudent("Грегори Гойл",21,65,24,84,63,
                                                                                                                 85,96);

        HufflepuffStudent zaharij = new HufflepuffStudent("Захария Смит",44,36,89,99,25,41);
        HufflepuffStudent sendrik = new HufflepuffStudent("Седрик Диггори",45,87,73,46,65,85);
        HufflepuffStudent djastin = new HufflepuffStudent("Джастин Финч-Флетчли",41,58,76,81,56,56);

        RavenclawStudent chsang = new RavenclawStudent("Чжоу Чан",54,82,55,74,82);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил",48,89,82,87,58);
        RavenclawStudent markus = new RavenclawStudent("Маркус Белби",58,89,56,96,85);
        // вывоод студентов на консоль - способ 1
        System.out.println(harry.toString());
        System.out.println(drako.toString());
        System.out.println(sendrik.toString());
        System.out.println(padma.toString());
        System.out.println();
        // вывоод студентов на консоль - способ 2
        harry.print();
        drako.print();
        sendrik.print();
        padma.print();
        System.out.println();
        //сравнение внутри факультета
        harry.comparisonGriffindorStudent(germiona);
        zaharij.comparisonHufflepuffStudent(sendrik);
        chsang.comparisonRavenclawStudent(markus);
        grehem.comparisonSlytherinStudent(gregori);
        //сравнение студентов между факультетами
        ron.comparisonHogwartsStudent(djastin);
        drako.comparisonHogwartsStudent(markus);




    }
}