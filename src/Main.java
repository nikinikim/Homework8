import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1_1();
        Task1_2();
        Task1_3();
        Task2();
        Task3();
        Task4();
    }
    public static void Task1_1(){
        int[] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;
        int first = integer[0];
        int second = integer[1];
        int third = integer[2];
        for (int i = 0; i < 3; i++) {
            System.out.println(integer[i]);
        }
    }
    public static void Task1_2(){
        double[] doubled = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubled.length; i++) {
            System.out.println(doubled[i]);

        }
    }
    public static void Task1_3(){
        String[] list = {"заяц", "волк", "медведь"};
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void Task2(){
        int[] integer = {1, 2, 3};
        double[] doubled = {1.57, 7.654, 9.986};
        String[] list = {"заяц", "волк", "медведь"};
        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i]);
            if (i != integer.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < doubled.length; i++) {
            System.out.print(doubled[i]);
            if (i != doubled.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]);
            if (i != list.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void Task3() {
        int[] integer = {1, 2, 3};
        double[] doubled = {1.57, 7.654, 9.986};
        String[] list = {"заяц", "волк", "медведь"};
        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.print(integer[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = doubled.length - 1; i >= 0; i--) {
            System.out.print(doubled[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void Task4(){
        int[] integer = {1, 2, 3};
        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0){
                integer[i]++;
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}
