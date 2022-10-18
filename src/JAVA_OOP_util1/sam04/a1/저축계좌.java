package JAVA_OOP_util1.sam04.a1;

import java.util.Calendar;

public class 저축계좌 extends 계좌{

    public void 값설정(){
        이름 = "은행계좌";
        계설일 = Calendar.getInstance().getTime();
        계좌번호 = 12345;
//        계좌.금액 => private라서 접근불가능.

    }
}
