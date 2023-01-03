package �al��ma;

public class TekY�nl�Liste {
	Node head = null;
	Node tail = null;
	
	void ba�aEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		 if(head == null) {
			 eleman.next = null;
			 head = eleman;
			 tail = eleman;
		 }else {
			 eleman.next = head;
			 head = eleman;
			 
		 }
	}
	void ba�tanSil() {
		if(head == null) {
			System.out.println("Liste bo�, listede silinecek eleman yok");
		}else if(head.next == null) {
			head = null;
			tail = null;
		}else {
			head = head.next;
			System.out.println("Ba�taki eleman silindi.");
		}
	}
	
	void sonaEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		 if(head == null) {
			 eleman.next = null;
			 head = eleman;
			 tail = eleman;
		 }else {
			 eleman.next = null;
			 tail.next = eleman;
			 tail = eleman;
		 }
	}
	
	void sondanSil() {
		if(head == null) {
			System.out.println("Liste bo�, listede silinecek eleman yok");
		}else if(head.next == null) {
			head = null;
			tail = null;
			System.out.println("Listede kalan son eleman silindi");
		}else {
			Node temp = head;
			Node temp2 = head;
			while(temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = null; //ba�lant� koptu
			tail = temp2;
			System.out.println("Sondan eleman silindi");
		}
		
	}
	
	
	void arayaEkle(int indis, int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if(head == null && indis == 0) {
			eleman.next = null;
			head = eleman;
			tail = eleman;
			
		}
		else if(head != null && indis == 0) {
			eleman.next = head;
			head = eleman;
			System.out.println(indis+"indisinci s�raya eleman eklendi");
			}
		else {
				int n = 0;
				Node temp = head;
				Node temp2 = head;
				
				while(temp.next != null) {
					n++;
					temp2 = temp;
					temp = temp.next;
				 }//eleman say�s� bulma
				if(n == indis) {
					temp2.next = eleman;
					eleman.next = temp;//eleman eklendi
				}else {
					temp = head;
					temp2 = head;
					int i = 0;
					while(i != indis) {
					temp2 = temp;
					temp = temp.next;
					i++;
				}
			
				temp2.next = eleman ;
				eleman.next = temp;
				
		}}}
	
	void aradanSil(int indis) {
		if(head == null) {
			System.out.println("Liste bo�");
		}else if(head.next == null && indis == 0) {
			tail = null;
			System.out.println("Listede kalan son eleman silindi");
		}
		else if(head.next != null && indis == 0) {
			head = head.next;
			System.out.println("Ba�taki eleman silindi");
		}else {
			int i = 0;
			Node temp = head;
			Node temp2 = head;
			while(temp.next != null) {
				i++;
				temp = temp.next;
			}if(i == indis) {
				temp2.next = head;
				tail = temp2;
				System.out.println("Listedeki son eleman silindi");
			}else {
				temp = head;
				temp2 = head;
				int j = 0;
				while(j != indis) {
					temp2 = temp;
					temp = temp.next;
					j++;
				}
				temp2.next = temp.next;
				System.out.println("Aradaki nesne silindi");
			}
		}
		
	}
	
	
	void yazd�r() {
		if(head == null) {
			System.out.println("Liste bo�");
			
		}else {
			for(Node x = head; x != null; x=x.next) {
			System.out.println(x.data+" -> ");}
			//Node temp = head;
			//while(temp != null) {
				//System.out.println(temp.data+"->");
				//temp = temp.next;
				
			//}
		}
	}

}
