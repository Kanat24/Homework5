public class Test1 {
    public static void main(String[] args) {

        //Задача1
       var clientOS =1;
       switch (clientOS){
           case 0:
               System.out.println("Установите версию приложения для iOS по ссылке.");
               break;
           case 1:
               System.out.println("Установите версию приложения для Android по ссылке");
               break;
       }


       //Задача 2
        int x=2020;
        boolean clientDeviceYear= (x>2015);


        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                if (clientDeviceYear) {
                    System.out.println("У вас современный телефон, вы можете установить это приложение");
                } else
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");

                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                if (clientDeviceYear) {
                    System.out.println("У вас современный телефон, вы можете установить это приложение");
                } else
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");

                break;
        }


        //Задача 3
        int year = 2024;
        if (year % 4 == 0){
            if (year%100==0 && year%400!=0){
                System.out.println(year + " год не является високосным");
            }
            else
                System.out.println(year + " год является високосным");
        }
        else
            System.out.println(year + " год не является високосным");


        //Задача 4
        int deliveryDistance = 95;
        int deliveryPeriod;
        if (deliveryDistance<20){
            deliveryPeriod=1;
            System.out.println("Потребуется дней: "+ deliveryPeriod+ " сутки");
        }
        else if (deliveryDistance>=20 &&deliveryDistance<60){
            deliveryPeriod=2;
            System.out.println("Потребуется дней: "+ deliveryPeriod+ " суток");
        }
        else if (deliveryDistance>=60 &&deliveryDistance<100){
            deliveryPeriod=3;
            System.out.println("Потребуется дней: "+ deliveryPeriod+ " суток");
        }


        //Задача 5
        byte monthNumber=1;
        switch (monthNumber){
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
                System.out.print("Не корректный номер месяца");

        }


    }
}
