package ver01;

/*
 1단계[Class생성] : BankingSystemVer01.java
기능설명 : 최초실행시 다음과 같은 메뉴가 출력된다.
계좌계설
입금
출금
전체계좌정보출력
프로그램종료
 
제약조건 :
계좌계설시 통장의 계좌번호는 중복되지 않는다.(중복검사를 하지 않는다.)
입금 및 출금의 금액은 무조건 0원 이상이다.(금액에 대한 오류검사를 하지않는다.)
고객의 계좌정보는 계좌번호(String형), 이름(String형), 잔액(int형) 3가지만 저장 및 관리한다.
둘 이상의 고객 정보 저장을 위해서 배열을 사용한다.(객체배열)
계좌번호는 검색, 삭제등의 기능적 편의상 하이픈(-) 기호가 없는 정수의 형태이다.
 
구현방법 :
계좌정보를 표현할수 있는 Account 라는 클래스를 정의한다.
여러 계좌정보를 저장하기 위해 인스턴스(객채)배열을 이용한다.
계좌정보는 최대 50개까지만 저장할 수 있도록 정의한다. 차후 변경될수있다.
메소드(함수)명은 아래와 같이 정의한다.
void showMenu();       // 메뉴출력
void makeAccount();    // 계좌개설을 위한 함수
void depositMoney();    // 입    금
void withdrawMoney(); // 출    금
void showAccInfo();  // 전체계좌정보출력

계좌개설, 입금, 출금, 전체계좌정보출력, 종료 선택을 위해 interface형 상수를 사용한다.

 */




public class BankingSystemVer01
{

	public static void main(String[] args)
	{
	

	}

}
