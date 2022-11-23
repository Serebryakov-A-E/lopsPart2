public class Main {
    public static void main(String[] args) {
        //second part
        //task 1
        int total = 15_000;
        int monthNumber = 0;
        while (total < 12_000_000) {
            total = total + total * 7 / 100;
            monthNumber++;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total);
        }
        System.out.println("Всего месяцев потребовалось " + monthNumber);

        //task 2
        total = 15_000;
        monthNumber = 0;
        while (total < 12_000_000) {
            total = total + total * 7 / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + total);
            }
        }
        System.out.println("Всего месяцев потребовалось " + monthNumber);

        //task 3
        total = 15_000;
        int years = 9;
        int monthsTotal = years * 12;
        monthNumber = 0;
        while (monthNumber < monthsTotal) {
            total = total + total * 7 / 100;
            monthNumber++;
            if (monthNumber % 6 == 0) {
                System.out.println("Полугодие " + monthNumber / 6 + " сумма " + total);
            }
        }
        //task 4
        int firstFridayOfMonth = 4;
        while (firstFridayOfMonth < 31) {
            System.out.println("Сегодня пятница, " + firstFridayOfMonth + "-е число. Необходимо подготовить отчет.");
            firstFridayOfMonth += 7;

        }
    }
}