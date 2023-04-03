package seven;
import java.util.*;
public class Nation {
    Scanner scanner = new Scanner(System.in);

    private String country, capital;
    int option; ///// 1 2 3
    HashMap<String, Nation> hashMap = new HashMap<>();
    Nation(){};
    Nation (String country, String capital) {
        this.country = country;
        this.capital = capital;
    }
    public String getCountry(){
        return country;
    }
    public String getCapital(){
        return capital;
    }
    public static void main(String[] args) {
        Nation n = new Nation();
        n.run();
    }
    public void run(){
       System.out.println("**** 수도 맞추기 게임을 시작합니다. ***");
       while (true) {
           System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
           option = scanner.nextInt();
           switch (option) {
               case 1: insert();
               break;
               case 2: question();
               break;
               case 3: System.exit(0);
           }
       }
    }
    public void insert(){
        System.out.println("현재 " +hashMap.size() + "개 나라와 수도가 입력되어 있습니다.");
        String country, capital;
        while (true) {
            System.out.print("나라와 수도 입력 " + hashMap.size() + "번째 >>");
            country = scanner.next();
            if (country.equals("그만")) break;
            capital = scanner.next();
            Nation nation = hashMap.get(country);
            if (nation == null) hashMap.put(country , new Nation(country, capital));
            else System.out.println(country + "는 이미 있습니다.");
        }
    }
    public void question(){
        Set<String> keys = hashMap.keySet();                        // 해쉬맵의 모든 키를 keys 컬렉션에 저장한다.
        Object [] array = (keys.toArray());                         // keys 컬렉션에 모든 값을 배열로 선언해서 사용한다.
        while (true) {
            int n = (int) (Math.random() * array.length);
            String question = (String)array[n];
            Nation nation = hashMap.get(question);
            String answer = nation.getCapital();

            System.out.println(question + "의 수도는? ");
            String capital = scanner.next();
            if (capital.equals("그만")) break;
            else if (capital.equals(answer)) System.out.println("정답 !");
            else System.out.println("아닙니다 !");
        }
    }
}
