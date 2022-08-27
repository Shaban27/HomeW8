import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        printLeapYear(2024);
        printOperatingSystem(2015, 0);
        printDeliveryDistance(95);
    }

    public static void printLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "год високосный");
        } else {
            System.out.println(year + "год не високосный");
        }
    }


    public static void printOperatingSystem(int productY, int clientOS) {
        if (!(clientOS == 0 || clientOS == 1)) {
            throw new RuntimeException("устройство");
        }
        var currentYear = LocalDate.now().getYear();
        String version = productY < currentYear ? " lite" : "";
        String os = (clientOS == 0 ? "iOS" : "android");
        System.out.printf ("установить %s версию для %s", version, os  );

    }


    public static void printDeliveryDistance (int distance) {
        int deliveryDays = 1;
        int lastDistance = 40;
        int firstDistance = 20;
        if (distance >= firstDistance) {
            deliveryDays = (Math.abs((distance - firstDistance) / lastDistance) + 2);
        }
        System.out.println("Потребуется дней - " + deliveryDays);
        return;
    }}