package RedDeAlumbrado.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Farola {
	
	private boolean on = false;
	private List<Farola>farolas = new ArrayList<>();
	
	Farola (){
		
	}
	
	public void pairWithNeighbor(Farola farola) {
		farolas.add(farola);
		farola.getNeighbors().add(this);
	}
	
	public  List<Farola> getNeighbors (){
		return this.farolas;
	}
	//farolas.stream().Collect(collectors.toList());
	
	public void turnOn(){
		if (!this.on) {
			this.on = true;
			farolas.stream().forEach(farolas -> farolas.turnOn());
		}
	}
	
	public void turnOff() {
		if (this.on) {
			this.on = false;
			farolas.stream().forEach(farolas -> farolas.turnOff());
		}
	}
	
	public boolean isOn() {
		if (this.on) {
			return true;
		}
		return false;
	}
	
	public boolean isOff() {
		if (!this.on) {
			return true;
		}
		return false;
	}
}
