package baekjoon;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order od = new Order();
		
		od.orderNumber = "201907210001";
		od.ID = "abc123";
		od.date = "2019년 7월 21일";
		od.name = "홍길순";
		od.number = "PD0345-12";
		od.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + od.orderNumber);
		System.out.println("주문자 아이디 : " + od.ID);
		System.out.println("주문 날짜 : " + od.date);
		System.out.println("주문자 이름 : " + od.name);
		System.out.println("주문 상품 번호 : " + od.number);
		System.out.println("배송 주소 : " + od.address);
	}

}
