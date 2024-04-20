import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MusicPlayer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List lst = new LinkedList<>();
		System.out.println("how  many songs you want to add in playlist");
		int n = sc.nextInt();
		for(int i=0 ; i<n  ;i++) {
			System.out.println("Enter the Music to the playelist");
			lst.add(sc.next());
		}
		
		System.out.println(lst);
		Iterator<String> itr = lst.iterator();
		System.out.println("Enter the song to be removed from the playlist");
		String song = sc.next();
		while(itr.hasNext()) {
			String element = itr.next();
			if(element.equalsIgnoreCase(song)) {
				itr.remove();
					
			}
			
		}
		System.out.println("Updated Song list");
		System.out.println(lst);
		
		
		
	}
}
