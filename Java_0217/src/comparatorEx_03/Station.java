package comparatorEx_03;

public class Station {
	
	private String stationName; //������ ������
	private int stationNum; //������ ��
	
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
