package JAVA_OOP_util1.sam04.a2;

import JAVA_OOP_util1.sam04.a1.계좌;

public class 저축계좌체크테스트 {

    //같은 패키지도 아니고, 상속도 아님.
    public static void main(String[] args) {
        계좌 계좌1 = new 계좌();
        계좌1.이름 = "은행계좌"; // public만 접근이 가능하고, protected는 상속만 접근가능.


    }
}
