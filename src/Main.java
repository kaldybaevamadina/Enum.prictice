import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        Autumn autumn = Autumn.valueOf(soz.toUpperCase());
        autumn.method();

        switch (autumn) {
            case SEPTEMBER -> System.out.println("начало осени");
            case OCTOBER -> System.out.println("прекрасный месяц");
            case NOVEMBER -> System.out.println("холод начинается");
        }

    }
}
