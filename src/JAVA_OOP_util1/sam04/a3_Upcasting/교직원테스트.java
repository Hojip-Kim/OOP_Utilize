package JAVA_OOP_util1.sam04.a3_Upcasting;

public class 교직원테스트 {

    public static void main(String[] args) {
        교직원 교직원1 = new 교직원("김호집", 1111L, "패스트캠퍼스", 2222);

        System.out.println("이름: " + 교직원1.이름);
        System.out.println("주민번호: " + 교직원1.get주민번호());
        System.out.println("학교명: " + 교직원1.학교명);
        System.out.println("교원번호: " + 교직원1.get교직원번호());

        System.out.println("==================");
        사람 사람1 = 교직원1; // 업캐스팅 (위로 올라가는것) => 덮어버린다는 개념으로 보면됨.
        System.out.println(사람1.이름);
        System.out.println(사람1.번호);


    }
}
