package day1.review;

public class Main {

	public static void main(String[] args) {
		
		//controller 클래스 테스트 
		BuyDao dao = new BuyDao("Mybatis");
		BuyService service = new BuyService(dao);
		BuyController shop = new BuyController(service);
		shop.buy();
		
		/*애플리케이션 실행은 여러환경에서 실행하게 됩니다. 그리고 데이터베이스 연결도 다른서버 다른계정들을
		사용하면서 실행이 됩니다.*/
		/*Controller에서 사용하는 service 클래스를 변경해야한다거나
		  service에서 아용하는 dao클래스를 변경해야하는 상황들이 많이 생기는데
		  이럴때 기본방법은 코드를 수정 - > 비효율적*/
		
		//spring 프레임웍은 의존관계 주입을 spring에서 관리 하는 방법으로 합니다.(IoC)
		
		
		
	}

}

