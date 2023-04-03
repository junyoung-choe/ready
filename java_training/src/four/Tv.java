package four;
import java.util.Scanner;

public class Tv {
    String company;
    int year;
    int inch;

    public Tv(String company, int year, int inch){
        this.company = company;
        this.year = year;
        this.inch = inch;
    }

    public void show(){
        System.out.println(company + "에서 만든 " + year + "년 " + inch + "인치" );
    }

    public static void main(String[] args) {
        Tv myTv = new Tv("LG", 2017, 32); //LG 에서 만든 2017년 32인치
        myTv.show();
    }
}
