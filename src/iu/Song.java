package iu;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//.오버로딩
	//하나의 클래스, 생성자.
	
	public Song(){
		//기본생성자
	} 
	
	public Song(
			String album, 
			String artist,
			String composer,
			String title,
			int track,
			int year){
		this.album = album;
		this.artist = artist;
		this.composer = composer;
		this.title  = title;
		this.track = track;
		this.year = year;
		System.out.println("새노래를 추가하였습니다.");
		//모든 필드를 초기화 해주는 생성자
	} 
	
	public Song(String artist,String title){
//		this.artist = artist;
//		this.title  = title;
//		System.out.println("새노래를 추가하였습니다.");
		this(null, artist, null, title, 0, 0);
		
	}
	
							//메소드 시그니쳐
	public String getTitle( ) {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void show(){
		System.out.println(
		artist + " " + title + " " + "(" + album + "," +
		year + "," + track +  "번 track" + "," + composer + "작곡" + ")"
				);
	}
	
}
