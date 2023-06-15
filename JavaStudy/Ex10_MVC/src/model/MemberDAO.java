package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAO {
	
	
	private Connection conn = null;
	private ResultSet rs = null;
	private PreparedStatement psmt = null;
	Scanner sc = new Scanner(System.in);
	
	public int result = 0;
	// DAO
	// Data Access Object : 데이터에 접근하는 객체 [DB에 접근하는 객체]
	// DB에 접근해서 SQL 쿼리를 실행하는 코드(JDBC)를 정의(메서드)해놓은 클래스
	// 하나의 테이블당 하나씩 
	
	
	////* 각 메소드는 SQL문을 실행하고 , 실행한 결과를 리턴
	
	public void getCon() {
		// 드라이버 동적 로딩
		// 데이터베이스 연결 권한 체크!

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_user = "HR";
			String db_pw = "12345";
			conn = DriverManager.getConnection(db_url, db_user, db_pw);

		} catch (Exception e) {
			System.out.println("getCon() 오류");
			e.printStackTrace();
		}

	}
	//----------------------------------------------------------------------------------------
	public void Close() {
		// 자원을 반납할 수 있는 기능 -> psmt, conn, rs
		
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	//----------------------------------------------------------------------------------------
	// 모든 메소드에서 사용할 수 있는 결과값 변수!
	// 각 기능에 대한 메소드 구조 생성!
	public int insert(MemberDTO dto) {
		getCon();
		// insert() 호출시 필요한 데이터 전달!
		
		try {
			String sql = "INSERT INTO MEMBER VALUES(?, ?, ?)";
			psmt =conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setInt(3, dto.getAge());
			
			result = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			Close();
		}
		
		return result;
	}

	//----------------------------------------------------------------------------------------
	public MemberDTO select(MemberDTO dto) {
		getCon();
		
		MemberDTO rdto = null;
		
		String sql = "select * from member where id= ? and pw =?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			rs = psmt.executeQuery();
			
			// rs에 있는 조회결과를 옮겨 담기
			// 만약 rs안에 데이터가 있다면
			
			if (rs.next()) {
				// 컬럼은 0부터가 아니라 1부터
				String rid = rs.getString(1);
				String rpw = rs.getString(2);
				int rage = rs.getInt(3);
				// 하나로 묶어서 반환 해야만 함
//				MemberDTO rdto = new MemberDTO(rid, rpw );
				// if문 밖에서 선언해야함
				rdto = new MemberDTO(rid, rpw, rage);
				
			}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Close();
		}
		
		return rdto;
	}

	//----------------------------------------------------------------------------------------
	public int update(String id, int select) {
		getCon();
		if(select == 1) {
			System.out.println("변경할 비밀번호를 입력해 주세요.");
			String sql = "Update member set pw = ? where id = ?";
			String pw = sc.next();
			
			// 코드 다름
			// DTO로 묶어서 전달
			// MemberDTO dto = new MemberDTO();
			// dto.setPw(pw);
			// dto.setId(id);
			
			
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, pw);  //dto.Pw
				psmt.setString(2, id);  //dto.Pw
				result = psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}else if(select ==2) {
			System.out.println("변경할 나이를 입력해 주세요.");
			String sql = "Update member set age = ? where id = ?";
			int age = sc.nextInt();
			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, age);
				psmt.setString(2, id);
				result = psmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				Close();
			}
		}
		
		return result;
		
		
	}
	//----------------------------------------------------------------------------------------
	public int delete(MemberDTO dto) {
		getCon();

		String sql = "DELETE FROM MEMBER WHERE ID = ? AND PW = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			result = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			Close();
		}
		return result;
	}
	//----------------------------------------------------------------------------------------
	public ArrayList<MemberDTO> call() {
		getCon();
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		
		// 2. 실행결과 리턴
		
		// 1. JDBC코드로 SQL문 실행
		
		try {
			
			//SQL문 정의
			String sql = "select * from member";
			
			//실행준비
			psmt = conn.prepareStatement(sql);
			
			// 실행
						
			rs = psmt.executeQuery();
			// 실행결과로 rs는 부적합하다 
			// rs의 첫시작은 컬럼부터
			// 1번쨰 부터 데이터가 있음
			
			// 실행결과 만들기
			
			//로그인에서는 id 가 pk 라 
			while (rs.next()) {
				// 각 컬럼의 데이터 꺼내기 
				String rid = rs.getString(1);
				String rpw = rs.getString(2);
				int rage = rs.getInt(3);
				
				MemberDTO rdto = new MemberDTO(rid, rpw, rage);
				// 정보를 하나씩 빼와서 rdto 에 하나로 묶어 대입
				// 두번째 rdto  행이 여러개 나옴
				
				// 행이 열러개가 나와, 결과 dto가 여러개 생성 --> 묶어줄 필요가 생김
				// 가변배열을 사용하여 여러 dto 를 배열로 만든다
				
								
				list.add(rdto);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			Close();
		}
		return list;
				
	}
	
	
	
	
}
