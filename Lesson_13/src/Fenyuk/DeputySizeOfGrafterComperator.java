package Fenyuk;

import java.util.Comparator;

public class DeputySizeOfGrafterComperator implements Comparator<Deputy>{

	@Override
	public int compare(Deputy o1, Deputy o2) {
		return o1.getGrafterSize() > o2.getGrafterSize() ? 1: -1;
	}
	
	

}
