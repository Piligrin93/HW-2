package ru.skypro;

public class Main {

    public static void main(String[] args) {
     // Уважаемый проверяющий! Обращаюсь к тебе с просьбой не судить строго!:) не смог найти как перевести на кириллицу.
     // Спасибо за понимание:) Обнимаю:)

     // Задание 1

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;

        float e = 5.1f;
        double f = 6.2;

        char g =48;

        boolean h = c > 5;


    // Задание 2

       float boxer1 = 78.2f;
       float boxer2 = 82.7f;
       float weightAllBoxer = boxer1 + boxer2;
       float weightDifference = boxer2 - boxer1; // Так как вес боксера 2 больше веса боксера 1
       System.out.println("Ves dvuch boxerov " + weightAllBoxer + " kg");
       System.out.println("Raznicha d vese dvuch boxerov " + weightDifference + " gk");


    // Задание 3

       float weightBananas = 80f;
       float weigtAllBananas = weightBananas * 5;

       float weigthMilk = 105f;
       float weigthAllMilk = weigthMilk * 2;

       float weightIcecream = 100f;
       float weightAllIcecream = weightIcecream * 2;

       float weightEgg = 70f;
       float weightAllEgg = weightEgg * 4;

       float weightAllMeal = (weigtAllBananas + weigthAllMilk + weightAllIcecream + weightAllEgg) / 1000;
       System.out.println("Obshiy ves zavtraka sportsmena " + weightAllMeal);
    // Почему я поставил все переменные продуктов в float ?
    // Изначально переменные продуктов я поставил short и int, но при выводе результата в кг, мне давало только 1.0
    // без округления до сотых. Поэтому, я все операторы продуктов заменил на переменную float и результат выдался
    // до округления в сотых, т.е. 1.09


    // Задание 4

        byte weightDown = 7;
        float weightDownMin = 0.25f; // Из грамм перевел в килограмм
        float weightDownMax = 0.5f; // Из грамм перевел в килограмм

        float dayMin = weightDown / weightDownMin;
        float dayMax = weightDown / weightDownMax;
        System.out.println("Poterya v vese pri min " + dayMin);
        System.out.println("Poterya v vese pri min " + dayMax);

        float middleDay = (dayMin + dayMax) / 2; // Среднее арифметическое
        System.out.println("Srednee kolichestvo dney " + middleDay);


    // Задание 5

        int salaryMashaInMonth = 67760;
        int salaryDenisInMonth = 83690;
        int salaryKrisInMonth = 76230;

        int salaryMashaInYear = salaryMashaInMonth * 12; // Годовая з/п
        int salaryDenisInYear = salaryDenisInMonth * 12; // Годовая з/п
        int salaryKrisInYear = salaryKrisInMonth * 12; // Годовая з/п

        float salaryMashaInMonthNew = salaryMashaInMonth * 1.1f; // Увеличение з/п на 10%
        float salaryDenisInMonthNew = salaryDenisInMonth * 1.1f; // Увеличение з/п на 10%
        float salaryKrisInMonthNew = salaryKrisInMonth * 1.1f; // Увеличение з/п на 10%

        System.out.println("Masha teper poluchaet " + salaryMashaInMonthNew);
        System.out.println("Denis teper poluchaet " + salaryDenisInMonthNew);
        System.out.println("Kris teper poluchaet " + salaryKrisInMonthNew);

        double salaryMashaInYearNew = salaryMashaInMonthNew * 12; // Годовая з/п с увеличением на 10%
        double salaryDenisInYearNew = salaryDenisInMonthNew * 12; // Годовая з/п с увеличением на 10%
        double salaryKrisInYearNew = salaryKrisInMonthNew * 12; // Годовая з/п с увеличением на 10%

        double salaryUpMasha = salaryMashaInYearNew - salaryMashaInYear; // Увеличение годового дохода на...
        double salaryUpDenis = salaryDenisInYearNew - salaryDenisInYear; // Увеличение годового дохода на...
        double salaryUpKris = salaryKrisInYearNew - salaryKrisInYear; // Увеличение годового дохода на...

        System.out.println("Godovoy dohod Mashy viros na " + salaryUpMasha);
        System.out.println("Godovoy dohod Denisa viros na " + salaryUpDenis);
        System.out.println("Godovoy dohod Kris viros na " + salaryUpKris);


        System.out.println("SPASIBO ZA UDELENOE VREMYA");
    }
}
