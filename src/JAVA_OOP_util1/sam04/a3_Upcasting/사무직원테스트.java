package JAVA_OOP_util1.sam04.a3_Upcasting;

public class 사무직원테스트 {

    public static void main(String[] args) {

        사람 남자 = new 사람("홍길동", 1111L);
        System.out.println("=========================");
        System.out.println("이름: " + 남자.이름 + "주민번호: " + 남자.번호);

        교직원 일잘하는교직원 = new 교직원("박하은", 2222L, "패스트캠퍼스", 33333L);
        사람 여자 = 일잘하는교직원;
        System.out.println("=========================");
        System.out.println("이름: " + 여자.이름 + "주민번호: " + 여자.번호);
        System.out.println("학교명: " + 일잘하는교직원.학교명);
        System.out.println("교직원번호: " + 일잘하는교직원.번호);

        사무직원 열심히일하는사무직원 = new 사무직원("박하영", 4444L, "패스트캠퍼스", 55555L, "경영지원");
        사람 사람3 = 열심히일하는사무직원; // 사무직원 => 사람 업캐스팅

        교직원 교직원3 = 열심히일하는사무직원; // 사무직원 => 교직원 업캐스팅

        System.out.println("=========================");
        System.out.println("이름: " + 사람3.이름 + "주민번호: " + 사람3.번호);
        System.out.println("학교명: " + 교직원3.학교명 + "교직원번호: " + 교직원3.번호);
//        System.out.println("부서: " + 사람3.부서); // 오류
//        System.out.println("부서: " + 교직원3.부서); // 오류
        System.out.println("부서: " + 열심히일하는사무직원.부서);
    }

}
