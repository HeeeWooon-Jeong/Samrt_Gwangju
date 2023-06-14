package ex_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Explain {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
				
				Connection conn = null;
				PreparedStatement psmt = null;
				try {
					
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 런타임 시 오라클 JDBC 드라이버 클래스를 동적으로 로드하는 것을 의미합니다.
					//"oracle.jdbc.driver.OracleDriver"는 오라클 JDBC 드라이버의 클래스 이름입니다. 
					//드라이버 클래스를 로드함으로써 자바 프로그램이 Oracle 데이터베이스와 연결을 수립하는 데 필요한 JDBC 드라이버가 사용 가능하게 됩니다.
					//이 코드가 작동하려면 Oracle JDBC 드라이버 JAR 파일이 자바 클래스 패스에 포함되어 있는지 확인해야 합니다.
					
					String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
					// jdbc:oracle:thin: = jdbc드라이버의 접두사  // 프로토콜
					// @localhost =  ip주소 //데이터베이스가 로컬 호스트에 있는 것을 나타냅니다. 로컬 호스트는 현재 실행 중인 컴퓨터를 가리킵니다.
					// 1521 = Oracle 데이터베이스의 포트 번호입니다. 포트 번호 1521은 Oracle 데이터베이스의 기본 포트 번호입니다.
					// xe = DB 이름  /Oracle 데이터베이스의 SID (System Identifier) 또는 서비스 이름 SID는 데이터베이스의 고유 식별자입니다.
					String db_user = "hr";
					String db_pw = "12345";
					
					conn = DriverManager.getConnection(db_url, db_user, db_pw);
					//이 코드는 JDBC의 DriverManager 클래스를 사용하여 데이터베이스 연결을 설정합니다. 
					//DriverManager.getConnection() 메서드를 호출하여 데이터베이스 연결 객체인 Connection을 반환합니다.
					//사용자명 및 암호를 사용하여 데이터베이스에 연결하고, 연결된 Connection 객체를 conn 변수에 할당하는 역할을 수행합니다.
					
					if(conn != null ) {
						//conn 변수에 데이터가 들어갔을경우
						System.out.println("DB 연결 성공");
					} else {
						System.out.println("DB 연결 실패");
					}
					
					System.out.print("아이디 >> ");
					String id = sc.next();

					System.out.print("비밀번호 >> ");
					String pw = sc.next();

					System.out.print("나이 >> ");
					int age = sc.nextInt();

					// ('"+변수+"') 로 변수 설정해야하는 번거러움을 줄이는게 ? 이다

					String sql = "insert into member values(? , ? , ?)";
					
					psmt = conn.prepareStatement(sql);
					//SQL 문을 실행하기 위해 준비된 문을 생성하는 코드입니다.
					//Connection 객체인 conn을 사용하여 PreparedStatement 객체를 생성합니다.
					//PreparedStatement는 미리 컴파일된 SQL 문을 나타내는 객체로, 특정 매개변수를 가진 SQL 문을 실행할   
//		수 있습니다.
					//이후에는 psmt 객체를 사용하여 매개변수를 설정하고 SQL 문을 실행할 수 있습니다.
					
					
					psmt.setString(1, id);
					psmt.setString(2, pw);
					psmt.setInt(3, age);
					
					int result = psmt.executeUpdate();
					// SQL 문을 데이터베이스에서 실행하고, 데이터베이스에 영향을 미친 행의 수를 반환합니다. 이를 result 변수에 할당합니다.
					// executeUpdate() 메서드는 INSERT, UPDATE 또는 DELETE와 같이 데이터베이스의 데이터를 변경하는 SQL 문에 사용됩니다.
					
					// 예를 들어, result 값이 1이면 SQL 문이 성공적으로 실행되어 데이터베이스에 1개의 행이 영향을 받았음을 의미합니다. 
					// 0이 반환되면 SQL 문이 실행되었지만 데이터베이스에 영향을 미친 행이 없음을 의미합니다.
					
					if (result > 0) {
						System.out.println("회원 가입 성공!");
					} else {
						System.out.println("회원 가입 실패!");
					}
					
					
				} catch (ClassNotFoundException e) {
					// TODO 자동 생성된 catch 블록
					System.out.println("드라이버 로딩 오류");
					e.printStackTrace();
					// 1. 프로젝트에 ojdbc6.jar가 없는 경우
					// 2. Class.forName()의 경로가 오타가 났을 경우
					
				} catch (SQLException e) {
					// TODO 자동 생성된 catch 블록
					System.out.println("데이터베이스 오류");
					e.printStackTrace();
				}
				// 5. 자원반납 -> catch문이 끝난 이후에 가장 마지막으로 진행
				// 중간에 오류 발생하더라도 결과를 마지막에 도출될수 있도록 하는 키워드
				finally {
					// 에러가 발생하거나 발생하지 않더라도 마지막에 꼭 실행되어야 하는 부분!
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
		```
		
		
	}

}
