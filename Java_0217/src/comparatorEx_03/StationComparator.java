package comparatorEx_03;

import java.util.Comparator;

public class StationComparator implements Comparator<Station>{
	@Override
	public int compare(Station o1, Station o2) {
		//�̸���
		return o1.getStationName().compareTo(o2.getStationName());
	}
	
}
