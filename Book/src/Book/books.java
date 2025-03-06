package Book;

public class books {
	private String cim;
	private String szerzo;
	private int megjelenes;
	private int ar;
	
	public int increaseCost(int percentage) {
		return this.ar+=(this.ar*percentage)/100;
	}
	
	
	public String setCim(String newCim) {
		return this.cim=newCim;
	}
	
	public String setSzerzo(String newSzerzo) {
		return this.szerzo=newSzerzo;
	}
	
	public int setMegjelenes(int newMegjelenes) {
		return this.megjelenes=newMegjelenes;
	}
	
	public int setAr(int newAr) {
		return this.ar=newAr;
	}
	
	public String getCim() {
		return this.cim;
	}
	
	public String getSzerzo() {
		return this.szerzo;
	}
	
	public int getMegjelenes() {
		return this.megjelenes;
	}
	
	public int getAr() {
		return this.ar;
	}
	
	public String getInformations() {
		return "Cím: "+this.cim+" Szerző: "+this.szerzo+" Megjelenés: "+this.megjelenes+" Ár: "+this.ar;
	}

}
