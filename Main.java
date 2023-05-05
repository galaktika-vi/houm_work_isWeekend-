import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой код выполнять? (1/2/3/4)");
        int codeToRun = scanner.nextInt();
        scanner.nextLine();

        if (codeToRun == 1) {
            // Код 1
            System.out.println("Выходной? (да/нет)");
            String isWeekendInput = scanner.nextLine();
            boolean isWeekend = isWeekendInput.equalsIgnoreCase("да");

            System.out.println("Идет дождь? (да/нет)");
            String isRainInput = scanner.nextLine();
            boolean isRain = isRainInput.equalsIgnoreCase("да");

            if (isWeekend && !isRain) {
                System.out.println("Гулять можно!");
            } else {
                System.out.println("Гулять нельзя.");
            }
        } else if (codeToRun == 2) {
            // Код 2
            System.out.println("Открыт ли магазин Edeka? (да/нет)");
            String isEdekaOpenInput = scanner.nextLine();
            boolean isEdekaOpen = isEdekaOpenInput.equalsIgnoreCase("да");

            System.out.println("Открыт ли магазин Rewe? (да/нет)");
            String isReweOpenInput = scanner.nextLine();
            boolean isReweOpen = isReweOpenInput.equalsIgnoreCase("да");

            boolean canBuy = canBuy(isEdekaOpen, isReweOpen);

            if (canBuy) {
                System.out.println("Я могу купить еду, потому что магазин открыт.");
            } else {
                System.out.println("Я не могу купить еду, потому что магазин закрыт.");
            }
        } else if (codeToRun == 3) {
            // Код 3
            System.out.println("Введите температуру первой колбы:");
            double temperature1 = scanner.nextDouble();

            System.out.println("Введите температуру второй колбы:");
            double temperature2 = scanner.nextDouble();

            boolean isDeviceWorking = isDeviceWorking(temperature1, temperature2);

            if (isDeviceWorking) {
                System.out.println("Устройство работает корректно: " + true);
            } else {
                System.out.println("Устройство работает не корректно: " + false);
            }
        } else if (codeToRun == 4) {
            // Код 4
            Random random = new Random();
            int n = random.nextInt(28801);

            System.out.println("Осталось секунд: " + n);

            int remainingHours = n / 3600;
            int remainingMinutes = (n % 3600) / 60;
            String hoursWord = getHoursWord(remainingHours);
            String minutesWord = getMinutesWord(remainingMinutes);

            System.out.println("Осталось " + remainingHours + " " + hoursWord);
            System.out.println("Осталось " + remainingHours + " " + hoursWord + " и " + remainingMinutes + " " + minutesWord);
        } else {
            System.out.println("Неверный ввод. Выберите 1, 2, 3 или 4.");
        }
    }

    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }

    public static boolean isDeviceWorking(double temperature1, double temperature2) {
        return temperature1 > 100.0 && temperature2 < 100.0;
    }

    private static String getHoursWord(int hours) {
        if (hours == 1) {
            return "час";
        } else if (hours >= 2 && hours <= 4) {
            return "часа";
        } else {
            return "часов";
        }
    }

    private static String getMinutesWord(int minutes) {
        if (minutes == 1) {
            return "минута";
        } else if (minutes >= 2 && minutes <= 4) {
            return "минуты";
        } else {
            return "минут";
        }
    }
}

