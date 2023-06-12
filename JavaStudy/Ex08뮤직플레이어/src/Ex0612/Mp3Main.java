package Ex0612;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class Mp3Main {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		Scanner sc = new Scanner(System.in);
		// 1.
		// 노래 --> 경로 / 제목 / 장르 ...
		// 노래의 정보를 저장할 Class 설계

		// 2. 노래 정보를 포함한 객체 생성

		String folder = "C:\\\\Users\\\\smhrd\\\\Desktop\\\\JavaStudy\\\\player\\";

		// 생성자를 사용해서 객체 안에 데이터를 채우는 방법

		Music m1 = new Music("ANTIFRAGILE", "LE SSERAFIM", folder + "ANTIFRAGILE-LE SSERAFIM.mp3");
		// Music m2 = new Music("Cupid", "FIFTY FIFTY", folder +"Cupid-FIFTY
		// FIFTY.mp3");
		Music m3 = new Music("HypeBoy", "NewJeans", folder + "HypeBoy_NewJeans.mp3");
		Music m4 = new Music("I AM.mp3", "IVE", folder + "I AM_IVE.mp3");
		Music m5 = new Music("NIGHT DANCER", "imase", folder + "NIGHT DANCER_imase.mp3");

		// 생성자 사용방법 -- 유연성 낮음
		// 입력할 데이터가 2개라면 2개의 값을 입력받는 클래스 오버로딩을 하던지 없는 값에 null 을 부여
		// 필드가 많아지면 실수가 발생할 수 있다.

		///////////////////////////////////////////////////////////////////////

		// 기본생성자를 사용한 방법
		// 일일이 정보 집어 넣을 수 있음

		Music m2 = new Music();
		m2.setTitle("Cupid");
		m2.setSinger("FIFTY FIFTY");
		m2.setPath(folder + "Cupid-FIFTY FIFTY.mp3");

		// 3. 노래 정보를 ArrayList에 집어넣어 저장하기

		ArrayList<Music> li = new ArrayList<Music>();

		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);

		String a = new String();
		String b = new String();

		int idx = 0;

		while (true) {
			System.out.print("[1]노래재생 [2]다음곡 [3]이전곡 [4]정지 [5]종료 >> ");

			int in = sc.nextInt();

			if (in == 1) {

				// 노래 재생

				// music List 에서 하나 꺼내오기
				Music music = li.get(idx);

				String title = music.getTitle();
				String singer = music.getSinger();
				String path = music.getPath();

//				String title = music.getTitle();
//				String singer = music.getSinger();
//				String path = music.getPath();

				// 1. 재생중인 노래 제목, 가수 출력

//				System.out.println("==== 재생중인 노래 ====");
//				System.out.println("노래 제목		" + "가수");
//				System.out.println(title + "\t" + singer);

				a = music.getTitle();
				b = music.getSinger();

				// 2 . 노래 재생

				mp3.play(path);

			} else if (in == 2) {

				// 이전곡 정지
				mp3.stop();

				// 노래 5 곡 초과 하지 않는 동안 idx++
				if (idx < li.size() - 1) {
					idx++;

				} else {

					// 처음으로 돌아가기
					idx = 0;
					// 다음곡 재생

				}
				Music music = li.get(idx);

				String title = music.getTitle();
				String singer = music.getSinger();
				String path = music.getPath();

				mp3.play(path);

//				System.out.println("==== 재생중인 노래 ====");
//				System.out.println("노래 제목		" + "가수");
//				System.out.println(title + "\t" + singer);
			}
//				
			if (in == 3) {
				mp3.stop();

				if (idx > 0) {
					idx--;

				} else {

					// 처음으로 돌아가기
					idx = li.size() - 1;
				}

				Music music = li.get(idx);

				String title = music.getTitle();
				String singer = music.getSinger();
				String path = music.getPath();

				// 다음곡 재생
				mp3.play(path);

				a = music.getTitle();
				b = music.getSinger();

			} else if (in == 4) {

				System.out.println("/////노래정지/////");
				mp3.stop();
			}

			if (in == 5) {
				System.out.println("프로그램을 종료합니다.");
				mp3.stop();
				break;
			}

			System.out.println("==== 재생중인 노래 ====");
			System.out.println("노래 제목		" + "가수");
			System.out.println(a + "\t" + b);
			
			
			
			
			
		}
	}
}