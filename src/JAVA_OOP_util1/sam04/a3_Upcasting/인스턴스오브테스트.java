package JAVA_OOP_util1.sam04.a3_Upcasting;

public class 인스턴스오브테스트 {

    public static void main(String[] args) {

        사람 남자 = new 사람("홍길동", 1111L);

        교직원 남자교직원 = new 교직원("홍길동", 1111L, "패스트캠퍼스", 22222L);

//        남자 --> 사람
//        남자교직원 --> 교직원, 사람
            System.out.println("남자 instanceof 사람 " + (남자 instanceof 사람));
        System.out.println("남자 instanceof 사람 " + (남자 instanceof 교직원));
        System.out.println("남자 instanceof 사람 " + (남자교직원 instanceof 사람));
        System.out.println("남자 instanceof 사람 " + (남자교직원 instanceof 교직원));
    }
}
