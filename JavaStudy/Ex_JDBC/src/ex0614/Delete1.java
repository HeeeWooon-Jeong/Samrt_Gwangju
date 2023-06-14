package ex0614;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터베이스 연결에 대한 권한

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "hr";
			String db_pw = "12345";

			// 2. 데이터베이스 연결 -- > Connection 객체 필요!
			conn = DriverManager.getConnection(db_url, db_user, db_pw);

			// 데이터베이스 연결 확인하기
			
			// 3. Query전송 --> PreparedStatement 객체 사용!
			

			
//			System.out.print("아이디 >> ");
//			String id = sc.next();
//
//			System.out.print("비밀번호 >> ");
//			String pw = sc.next();
//
//			System.out.print("나이 >> ");
//			int age = sc.nextInt();

			
			
			
			// ('"+변수+"') 로 변수 설정해야하는 번거러움을 줄이는게 ? 이다

			String sql = "DELETE FROM MEMBER WHERE ID = TEST";

			psmt = conn.prepareStatement(sql);

			// 실제 ? 에 연결 되어야 하는 값들 지정하기!
			// 1. ? -> String -> setString(순서, 데이터)
//			psmt.setString(1, id);
//			// 1. ? -> String
//			psmt.setString(2, pw);
//			// 1. ? -> int
//			psmt.setInt(3, age);

			// sql 실행하기!
			// 4. 결과를 이용한 작업처리

			int result = psmt.executeUpdate();

			if (result > 0) {
				System.out.println("성공!");
			} else {
				System.out.println("실패!");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// 1. 프로젝트에 ojdbc6.jar가 없는 경우
			// 2. Class.forName()의 경로가 오타가 났을 경우
			System.out.println("드라이버 로딩 오류");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("데이터베이스 오류");
			e.printStackTrace();
		}

		// 5. 자원반납 -> catch문이 끝난 이후에 가장 마지막으로 진행
		// 중간에 오류 발생하더라도 결과를 마지막에 도출될수 있도록 하는 키워드
		finally {
			// 에러가 발생하던지 발생하지 않더라도 마지막에 꼭 실행되어야 하는 부분!
			// 자원 반납 순서 -> 사용한 객체들의 역순으로 닫아주기!
			// 생성의 순서 1. conn -> 2. psmt
			// 반납의 순서 1. psmt -> 2. conn

			// 둘다 if문으로 닫아줘야한다 if else는 둘중 한가지
			try {
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
