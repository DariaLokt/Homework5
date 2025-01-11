public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int clientOS = 0;
        if (clientOS == 1)
        {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0)
        {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Для Вашей операционной системы приложение ещё не адаптировано");
        }

        //Task 2
        System.out.println("Task 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1)
        {
            if (clientDeviceYear < 2015)
            {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0)
        {
            if (clientDeviceYear < 2015)
            {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Для Вашей операционной системы приложение ещё не адаптировано");
        }

        //Task 3
        System.out.println("Task 3");
        int year = 1800;
        if (year >= 1584)
        {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
            {
                System.out.println("Год високосный");
            } else {
                System.out.println("Год не високосный");
            }
        } else {
            System.out.println("Високосные года ещё не были введены");
        }

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }

        //Task 5
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber)
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}