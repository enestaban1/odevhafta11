package swichdemo;

public class Main {


	public static void main(String[] args) {
		char grade =  'A';

		switch (grade) { 
		   case 'A' :
		   System.out.println("Mükemmel : Geçtiniz");
		      break; // DURUMU, KODU BİTİREN
		   case 'B' :
			   System.out.println("Çok Güzel : Geçtiniz");
		      break;
		   case 'C' :
			   System.out.println("iyi : Geçtiniz");
			   break;
		   case 'D' :
			   System.out.println("Fena Değil : Geçtiniz");
			   break;
		   case 'F' :
			   System.out.println("Maalesef Kaldınız");
			   break;
			   default : // BUNLARIN HARİCİNDE DEMEK
				   System.out.println("Geçersiz Not");
				   
		      
		}

	}

}
