package JAVA_OOP_util1.sam04.a2;

import JAVA_OOP_util1.sam04.a1.계좌; // 다른패키지면 무조건 import해줘야함.

import java.util.Calendar;

public class 저축계좌체크 extends 계좌 {

    public void 값체크() {

        이름 = "저축계좌";
        계설일 = Calendar.getInstance().getTime();


    }

}
