package �al��ma;

public class Test {

	public static void main(String[] args) {
		ListeYap�s� liste = new ListeYap�s�();
		liste.info();
		liste.Ekle(20);
		liste.Ekle(45);
		liste.Ekle(50);
		
		liste.info();
		System.out.println("------------------------------------------------------------------------------------------------");
		TekY�nl�Liste list = new TekY�nl�Liste();
		list.ba�aEkle(15);
		list.ba�aEkle(14);
		list.ba�aEkle(20);
		list.ba�aEkle(75);
		list.sonaEkle(56);
		list.sonaEkle(78);
		list.yazd�r();
		System.out.println("**********************************************************");
		list.arayaEkle(1, 200);
		list.arayaEkle(5, 510);
		list.yazd�r();
		System.out.println("***************************************************************");
		list.ba�tanSil();
		list.sondanSil();
		list.aradanSil(2);
		
		list.yazd�r();

	}

}
