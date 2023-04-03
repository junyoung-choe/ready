package five;

abstract class PairMap {  // 추상 메소드에 값을 넣는다는 생각을 하지말고 그냥 주어진것만 사용한다는 느씸
    protected String KeyArray [];     // 그래서 포로텍트로 값을 사용하라는게 아니고 똑같이 선언하라는 느낌
    protected String valueArray [];
    abstract String get(String key);
    abstract void put(String key, String value);

    abstract String delect(String key);

    abstract int length();
}

class Dictionary extends PairMap{
    int j;
    int size;
    String key;              // 배열에 넣기위해서 사용하는 변수
    String array;
    String KeyArray [];      //갯수를 받아서 생성하기 위해서 먼저 선언
    String valueArray [];

    Dictionary(int size) { // 사이즈를 배정받는다.
        this.size = size;
        KeyArray = new String[size];
        valueArray = new String[size];
        j = 0;               //배열에 값이 들어가는 경우도 기존에 값이 변하는 경우도 있기에 이용하여 구분
    }

    @Override
    String get(String key) {
        for(int i = 0; i < size; i++){
            if (key.equals(KeyArray[i]))
                return valueArray[i];
        }
        return null;
    }

    @Override
    void put(String key, String value) {
        for(int i = 0; i < size; i++){
            if (key.equals(KeyArray[i])){
                KeyArray[i] = key;
                valueArray[i] = value;
                return ;
            }
        }
        KeyArray[j] = key;
        valueArray[j] = value;
        j++;
    }

    @Override
    String delect(String key) {
        for(int i=0; i<size; i++) {
            if (key.equals(KeyArray[i])){
                String s = KeyArray[i];             // 임시 생성하여 사용한다.
                KeyArray[i] = null;
                valueArray[i] = null;
                return s;
            }
        }
        return null;                                // String은 리런타입 null 사용
    }

    @Override
    int length() {
        return 0;
    }

}

public class DictionaryApp {
    public static void main(String[] args) {
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");
        System.out.println("이재문은 값은 "+ dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));

        dic.delect("황기태");

        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}

