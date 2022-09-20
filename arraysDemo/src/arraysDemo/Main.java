package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Engin";
		String ogrenci3="Engin";

		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		// yukarida olan tek tek manual yazmayı gerektiriyor altta olan for int yazan kod otomatik olarak çalışıyor

		System.out.println("--------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Yusuf";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
			
		}
		// en iyi kod bu aşağıda olan
		
		System.out.println("--------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
			
		}
	}

}
