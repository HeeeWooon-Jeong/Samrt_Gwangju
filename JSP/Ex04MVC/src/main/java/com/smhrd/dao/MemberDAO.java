package com.smhrd.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;
import com.smhrd.entity.Member;

public class MemberDAO {

	// 1. SqlSessionManager의 sqlSessionFactory 받아오기
	// DBCP = SqlSessionFactory 
	private SqlSessionFactory factory= SqlSessionManager.getSqlSessionFactory();
	
	
	// 2. SQL문 실행 메서드
	
	public int join( Member member) {
		// 1) 연결을 빌려오기, true == auto commit 
		SqlSession session = factory.openSession(true);
		// http 자료형
		// 2) Mapper에 정의된 sql문을 실행
		// 메서드 이름 == SQL문의 키워드(단 select만 빼고)
		// 매개변수가 필수 1개 = id / 아래서는 id인 join, 
//				   선택 1개 = parameterType에 지정해준 데이터
		//				
		// i, d, u = 결과가 몇행 변경이 일어났는가 동일하게 나온다.
		
		int cnt = session.insert("join", member);
		
		
		// 3) 빌려온 연결 반납
		session.close();
		
		// 4) DAO ==> SQL문을 실행하고, 실행 결과를 리턴하는 메서드
		return cnt;
		
	}
	
	// 로그인 메서드
	public Member login( Member member ) {
		// 1. 연결 빌려오기
		SqlSession session = factory.openSession(true);
		// 2. sql문 실행
		// selectOne : 결과가 한개만 나올 때
		//			   >> resultType에 적은 DTO로 리턴
		// selectList : 결과가 여러개 나올 때
		//			   >> List<DTO>
		
		Member result = session.selectOne("login", member);
		// 3. 연결 반납
		session.close();
		// 4. 실행 결과 리턴
		return result;
	}
	
	// 업데이트 메서드
	public int update(Member member) {
		SqlSession seesion = factory.openSession(true);
		
		int result = seesion.update("update", member);
		
		seesion.close();
		
		return result;
	}
	
	public int delete(Member member) {
		SqlSession session = factory.openSession(true);
		
		int result = session.delete("delete", member);
		
		session.close();
		
		return result;
	}
	
	
	
	
	
	
	
	
}
