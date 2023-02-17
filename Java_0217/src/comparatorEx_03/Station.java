package comparatorEx_03;

public class Station {
	
	private String stationName; //정류장 목적지
	private int stationNum; //정류장 수
	
	public Station(String stationName, int stationNum) {
		this.stationName = stationName;
		this.stationNum = stationNum;
	}

	
	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public int getStationNum() {
		return stationNum;
	}

	public void setStationNum(int stationNum) {
		this.stationNum = stationNum;
	}
	
}
