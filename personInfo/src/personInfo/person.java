package personInfo;

public class person {
	private String name;
	private int weight;
	private int height;
	
	public double getTTIIndex() {
		double new_height=this.height/100.0;
		double TTI=this.weight/(new_height*new_height);
		
		return TTI;
	}

	public String getInformations() {
		return "Név: "+this.name+" - Súly: "+this.weight+" kg - Magasság: "+this.height+" cm - TTI: "+getTTIIndex()+"Alkat: "+getAppearance();
	}
	
	public String getAppearance() {
		double TTI=getTTIIndex();
		
		if(TTI<18.5) {
			return "Sovány";
		} else if (TTI>25) {
			return "Kövér";
		} else {
			return "Normál";
		}	
	}
	
	
	public int getWeight() {
		return this.weight;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setWeight(int newWeight) {
		this.weight=newWeight;
	}
	
	public void setHeight(int newHeight) {
		this.height=newHeight;
	}
	
	public void setName(String newName) {
		this.name=newName;
	}
	
}
