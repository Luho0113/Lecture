package comparatorEx_03;

import java.util.TreeSet;

public class StationExample {

	public static void main(String[] args) {
		// 
		TreeSet<Station> stationSet = new TreeSet<Station>(new StationComparator());
		
		stationSet.add(new Station("경복궁", 6));
		stationSet.add(new Station("광화문", 3));
		stationSet.add(new Station("청계천", 4));
		stationSet.add(new Station("인사동", 5));
		
		for(Station s : stationSet) {
			System.out.println(s.getStationName() + " : " + s.getStationNum());
		}

	}

}
