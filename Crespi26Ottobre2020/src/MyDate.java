
public class MyDate {

	private int giorno=0;
	private int mese=0;
	private int anno=0;
	private String formato="it";

	public int getGiorno() {
		return giorno;
	}
	
	public void setGiorno(int giorno) {
		if ( giorno <1) {
			System.out.println("Il giorno deve essere >1");
			return;
		}
		if (mese==0) {
			System.out.println("Devi prima settare il mese");
			return;
		}
		switch (mese) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				if ( giorno >31 ) {
					System.out.println("il giorno deve essere <=31");
					return;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if ( giorno >30 ) {
					System.out.println("il giorno deve essere <=30");
					return;
				}
				break;
			case 2:
				if ( giorno >28 ) {
					System.out.println("il giorno deve essere <=28");
					return;
				}
				break;
 		}
		
		this.giorno = giorno;
	}
	
	
	public int getMese() {
		return mese;
	}
	
	 
	public void setMese(int mese) {
		if(mese<1){
			System.out.println("Non esiste un mese < 1");
			return;
		}
		if(mese>12){
			System.out.println("Non esiste un mese > 12");
			return;
		}
		this.mese=mese;
	}
	
	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		if(anno>8888){
			System.out.println("L'anno non esiste");
		}
		this.anno=anno;
	}
	
	public String toString() {
		if (formato.equalsIgnoreCase("it")) {
		return this.giorno+"/"+this.mese+"/"+this.anno;
		} else {
			return this.mese+"-"+this.giorno+"-"+this.anno;
		}
	}
}

