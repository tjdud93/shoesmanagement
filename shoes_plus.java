// 2018141026 최명규 21.06.03
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;
import java.util.Scanner;

public class Shoes_Plus {
	//입고상품을 json 형태로 저장
	public void shoes_Plus() {
	Scanner scan = new Scanner(System.in);
	int num; // 스캐너 변수
	int num2; // 스캐너 변수2
	int s_sneakers = 0;
	int s_running = 0;
	int s_loafer = 0;
	int s_slipper = 0;
	JSONObject json = new JSONObject(); // json 오브젝트 

	
	System.out.print("입고할 신발의 종류를 선택하세요\n");
	System.out.print("1.운동화 2.러닝화 3.구두 4.슬리퍼 : ");
	num = scan.nextInt(); 
	
	// num이 1,2,3,4 중 하나일때
	switch(num)
	{
	case 1:
		System.out.print("\n입고할 수량 입력 : ");
		num2 = scan.nextInt(); // 입고 수량 Int 스캔
		s_sneakers += num2; // 스캔한 값 변수에 더해줌
		json.put("Sneakers", s_sneakers); // 변수값을 json 데이터에 저장
		break;
		
	case 2:
		System.out.print("\n입고할 수량 입력: ");
		num2 = scan.nextInt();
		s_running += num2;
		json.put("running", s_running);
		break;
		
	case 3:
		System.out.print("\n입고할 수량 입력: ");
		num2 = scan.nextInt();
		s_loafer += num2;
		json.put("loafer", s_loafer);
		break;
	
	case 4:
		System.out.print("\n입고할 수량 입력: ");
		num2 = scan.nextInt();
		s_slipper += num2;
		json.put("slipper", s_slipper);
		break;
	}
	
	
	}
}