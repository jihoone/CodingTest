package baekjoon;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order od = new Order();
		
		od.orderNumber = "201907210001";
		od.ID = "abc123";
		od.date = "2019�� 7�� 21��";
		od.name = "ȫ���";
		od.number = "PD0345-12";
		od.address = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + od.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + od.ID);
		System.out.println("�ֹ� ��¥ : " + od.date);
		System.out.println("�ֹ��� �̸� : " + od.name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + od.number);
		System.out.println("��� �ּ� : " + od.address);
	}

}
