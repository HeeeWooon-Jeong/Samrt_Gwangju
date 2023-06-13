package ex_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		
		
		// 1. 드라이버 동적 로딩 -> Class.forName() 사용
		// 예외상황 catch 해 주기!
		
		// 2. 데이터베이스 연결 -> Connection 객체 사용
		// 		- db_url, db_user, db_pw 입력 -> DriverManage.getConnection() 사용
		
		// 3. 전송하고자 하는 sql 문장 생성 하기
		//    	- 어떤 내용으로 수정 할 것인지 수정 값 입력 (비밀번호 바꾸기)
//				+ test 라는 아이디를 가지고 있는 회원에 대한 비밀번호 수정!
		//		- 생성된 sql 문장 DB로 전달 -> PreparedStatement 객체 사용
		//		- 사용자로 부터 입력받은 수정값은 ? 을 사용하여 DB에 전달
		//		- 해당 sql문 실행하기 -> psmt.executeUpdate()
		//		- 실행 결과에 대한 값 저장하기 -> 성공 여부 파악!
		
		
		// 4. 다 사용된 객체들 역순으로 닫아주기! -> close() 사용
		
		Scanner sc = new Scanner(System.in);
		PreparedStatement psmt = null;
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 
			
			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			// jdbc:oracle:thin: = jdbc드라이버의 접두사
			// @localhost =  데이터베이스가 로컬 호스트에 있는 것을 나타냅니다. 로컬 호스트는 현재 실행 중인 컴퓨터를 가리킵니다.
			// 1521 = Oracle 데이터베이스의 포트 번호입니다. 포트 번호 1521은 Oracle 데이터베이스의 기본 포트 번호입니다.
			// xe = Oracle 데이터베이스의 SID (System Identifier) 또는 서비스 이름 SID는 데이터베이스의 고유 식별자입니다.
			
			String db_user = "hr";
			String db_pw = "12345";
			
			
			// 2.데이터베이스 연결
			conn = DriverManager.getConnection(db_url, db_user, db_pw);
			// conn =  DriverManager.getConnection() 메서드를 사용 ,데이터베이스에 연결된 Connection 객체를 저장하는 변수입니다
//			JDBC 드라이버를 사용하여 데이터베이스에 연결
			
			//데이터베이스 연결 확인
			
			if(conn != null ) {
				System.out.println("DB 연결 성공");
			} else {
				System.out.println("DB 연결 실패");
			}
			
			
			System.out.print("변경할 ID >> ");
			
			String id = sc.next();

			System.out.print("변경할 비밀번호 >> ");
			
			String pw = sc.next();

						
			
			// sql 형태 언어
			
			String sql = "update member set pw = ? where id = ? ";
			
			//psmt에 담아
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, pw);
			psmt.setString(2, id);
			
			//실행
			int result = psmt.executeUpdate();
		
			if(result > 0) {
				System.out.println("회원정보 수정 완료!");
			} else {
				System.out.println("회원정보 수정 실패!");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
		
			try {
				
			if(psmt != null) {
				
					psmt.close();
					
				}if (conn != null) {
					
					conn.close();
					
				}
						
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
