import java.util.Scanner;


public class Principale {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyDate md = new MyDate();
		int giorno,mese,anno;
	    System.out.println("Scrivi una data seguendo questo schema: giorno/mese/anno");
	    giorno=sc.nextInt();
	    mese=sc.nextInt();
	    anno=sc.nextInt();
		md.setMese(mese);
	    md.setGiorno(giorno);
	    md.setAnno(anno);
	    System.out.println(md);
	    
	}
}
