
import java.util.ArrayList;

class Manga {
	private String mangaName;
	private int mangaVolume;
	
	public Manga(String mangaName, int mangaVolume) {
		this.mangaName = mangaName;
		this.mangaVolume = mangaVolume;
		
	}
	
	public String getMangaName() {
		return mangaName;
		
	}
	
	public int getMangaVolume() {
		return mangaVolume;
				
	}
}

class MangaCollection {
	private ArrayList<Manga> mangas;
	
	public MangaCollection() {
		mangas = new ArrayList<>();
		
	}
	
	public void addManga(Manga manga) {
		mangas.add(manga);
		
	}
	
	public void displayMangas() {
		System.out.println("Manga in your collection: ");
		for (Manga manga : mangas) {
			System.out.println("Manga Name: " + manga.getMangaName());
			System.out.println("Manga Volume: " + manga.getMangaVolume());
			System.out.println("------------------------");
			
		}
	}

	public void inputMangas() {
	
		
	}

}

public class FinalProject {

	public static void main(String[] args) {
		MangaCollection mangaCollection = new MangaCollection();
		
		mangaCollection.inputMangas();
		mangaCollection.displayMangas();
		

	}

}
