package JAVA_OOP_util1.sam04.a3_Upcasting;

public class 오버라이딩테스트 {

    public static void main(String[] args) {

        사람 남자 = new 사람("홍길동", 1111L);
        남자.정보출력();

        사람 여자 = new 사람("박하은", 2222L);
        여자.정보출력();


        교직원 남자교직원 = new 교직원("이순신", 3333L, "패스트캠퍼스", 33333L);
        남자교직원.정보출력();
    }

}
