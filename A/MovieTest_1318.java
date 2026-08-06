package main.Test.test2026_1_2.A;
import java.util.*;
//1318황지온
public class MovieTest_1318{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Movie[] movie = new Movie[5];
        int sum = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("영화" + (i + 1) + " 제목 : ");
            String title = sc.nextLine();

            System.out.print("영화" + (i + 1) + " 감독명 : ");
            String director = sc.nextLine();

            System.out.print("영화" + (i + 1) + " 상영시간(분) : ");
            int time = sc.nextInt();
            sc.nextLine();

            movie[i] = new Movie(title, director, time);

            sum += time;
        }

        System.out.println("-----------------------------------------");
        System.out.println("영화제목\t감독명\t상영시간");
        for (int i = 0; i < 5; i++) {
            movie[i].print();
        }
        System.out.println("-----------------------------------------");
        System.out.println("총 상영시간 : " + sum + "분");
    }
}

class Movie {
    String title;
    String director;
    int time;

    Movie(String title, String director, int time){
        this.title = title;
        this.director = director;
        this.time = time;
    }
    void print(){
        System.out.printf(title + "\t" + director + "\t" + time);
        System.out.println();
    }
}
