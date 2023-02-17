package comparatorEx_03;

import java.util.TreeSet;

public class StationExample {

	public static void main(String[] args) {
		// 
		TreeSet<Station> stationSet = new TreeSet<Station>(new StationComparator());
		
		stationSet.add(new Station("�溹��", 6));
		stationSet.add(new Station("��ȭ��", 3));
		stationSet.add(new Station("û��õ", 4));
		stationSet.add(new Station("�λ絿", 5));
		
		for(Station s : stationSet) {
			System.out.println(s.getStationName() + " : " + s.getStationNum());
		}

	}

}
