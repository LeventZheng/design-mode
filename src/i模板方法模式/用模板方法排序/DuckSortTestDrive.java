package i模板方法模式.用模板方法排序;

import java.lang.reflect.Array;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Louie", 7),
                new Duck("Howard", 2),
                new Duck("huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Array.sort(ducks);

        System.out.println("\n after sorting:");
        display(ducks);

        public static void display(Duck[] ducks) {
            for (int i = 0; i < ducks.length; i++) {
                System.out.println(ducks[i]);
            }
        }
    }
}
