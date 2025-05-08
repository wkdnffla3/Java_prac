package ch13.order_system.admin;

import ch13.order_system.system.OrderSystem;

public class AdminApp extends OrderSystem {
  public static void main(String[] args) {
    // 매장명 확인
//    this.storeName;
    AdminApp aa = new AdminApp();// 참조변수
    
    // 피자 주문
    aa.placeOrder("피자");
    
    // 햄버거 주문
    aa.placeOrder("햄버거");
    // 주문량 확인
    System.out.println(aa.getOrderCount());

    // 주문량 초기화
    aa.resetOrders();
  }
}
