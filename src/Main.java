package com.learning;

public class Main {
    public static void main(String[] args) {
        // สร้างกระปุกใบแรก ชื่อเจ้าของ "น้องพอใจ"
        PiggyBank myBank = new PiggyBank("น้องพอใจ");

        // ดูเงินครั้งแรก (ควรจะเป็น 0)
        myBank.showMoney();

        // หยอดเงิน 2-3 ครั้ง
        myBank.addMoney(20); // หยอด 20 บาท
        myBank.addMoney(50); // หยอด 50 บาท

        // ดูเงินอีกครั้งหลังหยอดเงินแล้ว
        myBank.showMoney();
    }
}