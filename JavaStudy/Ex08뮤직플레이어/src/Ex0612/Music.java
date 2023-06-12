package Ex0612;

public class Music {

	// 필드

	private String title;
	private String singer;
	private String path;

	// 생성자
	
	public Music(String title, String singer, String path) {

		this.title = title;
		this.singer = singer;
		this.path = path;

	}
	
	// 기본 생성자
	public Music() {}
	
	

	// 메서드
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
