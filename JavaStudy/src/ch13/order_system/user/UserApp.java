package ch13.order_system.user;

import ch13.order_system.system.OrderSystem;
//import order

public class UserApp {
  public static void main(String[] args) {
    // 매장명 확인
    OrderSystem os = new OrderSystem();
    System.out.println(os.storeName);
    // 치킨 주문
    os.placeOrder("양치");
  }
}
