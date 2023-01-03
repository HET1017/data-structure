package çalışma;

public class Test {

	public static void main(String[] args) {
		ListeYapısı liste = new ListeYapısı();
		liste.info();
		liste.Ekle(20);
		liste.Ekle(45);
		liste.Ekle(50);
		
		liste.info();
		System.out.println("------------------------------------------------------------------------------------------------");
		TekYönlüListe list = new TekYönlüListe();
		list.başaEkle(15);
		list.başaEkle(14);
		list.başaEkle(20);
		list.başaEkle(75);
		list.sonaEkle(56);
		list.sonaEkle(78);
		list.yazdır();
		System.out.println("**********************************************************");
		list.arayaEkle(1, 200);
		list.arayaEkle(5, 510);
		list.yazdır();
		System.out.println("***************************************************************");
		list.baştanSil();
		list.sondanSil();
		list.aradanSil(2);
		
		list.yazdır();

	}

}
