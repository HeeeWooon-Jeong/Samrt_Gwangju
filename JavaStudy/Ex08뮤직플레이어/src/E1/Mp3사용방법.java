package E1;

import javazoom.jl.player.MP3Player;

public class Mp3사용방법 {

	public static void main(String[] args) {
		
		//음악을 재생하기 위한 클래스를 프로젝트에 불러오기
		// jar / war -- > java의 클래스 파일들을 압축시킨 파일
		// 라이브러리 : 남이 만들어놓은 코드 묶음
		// 라이브러리 프로젝트에 적용
		// 프로젝트 우클릭 > build path > Configure build path > classs path > add External jars
		
		// MP3Player 클래스로 노래 재생하기
		
		// MP3Player
		// 클래스 기반으로 객체 생성 생성자
		MP3Player mp3 = new MP3Player();
		
		// 음악 재생
		// C:/users/smhrd
		String path = "C:\\Users\\smhrd\\Desktop\\JavaStudy\\player\\NIGHT DANCER_imase.mp3";
		mp3.play(path);
		
		// 음악 정지
		mp3.stop();
		
		// 음악이 재생중인지 여부 파악
		// true --> 현재 재생 중
		// false --> 재생x
		
		boolean isPlaying = mp3.isPlaying();
		
		
		
		
	}

}
