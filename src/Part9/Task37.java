package Part9;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        System.out.println("Enter : Winter, Spring, Summer, Autumn");
        Scanner str = new Scanner(System.in);
        String season = str.next();
        Season.WINTER.GetDaysInSeason(season);
    }
}