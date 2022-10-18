package JAVA_OOP_util1.sam04.a3_Upcasting;

public class 사람테스트 {
    public static void main(String[] args) {
        사람 사람1 = new 사람("김호집", 970401L);

        System.out.println("이름: " + 사람1.이름);
        System.out.println("번호: " + 사람1.번호);
    }
}
