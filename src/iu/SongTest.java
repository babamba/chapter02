package iu;

public class SongTest {
	public static void main(String[] args) {
		Song song = new Song();
		
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수");
		song.setTitle("좋은날");
		song.setTrack(3);
		song.setYear(2010);
		song.show();
		
		Song song2 = new Song("Real", "아이유" ,"이민수" ,"좋은 날", 3 ,2010);
		song2.show();
		
		Song song3 = new Song("임창정", "내가 저지른 사랑");
		song3.show();

		Song song4 = new Song("유재석EXO", "Dancing King");
		song4.show();
	}
}
