package setEx_03;

public class ElecFee {
	private String houseNum; // 집 호수
	private int familyNum; //가족 수
	private int elecUse; //전기 사용량
	private int elecFee; //공동요금

	public ElecFee(String houseNum, int familyNum, int elecUse, int elecFee) {
		super();
		this.houseNum = houseNum;
		this.familyNum = familyNum;
		this.elecUse = elecUse;
		this.elecFee = elecFee;
	}

	@Override
	public int hashCode() {
		
		return houseNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ElecFee target) {
			//ElecFee target = (ElecFee) obj;
			return target.houseNum.equals(houseNum);
		} else {
			return false;
		}
	}
	
	//게터세터
	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public int getFamilyNum() {
		return familyNum;
	}

	public void setFamilyNum(int familyNum) {
		this.familyNum = familyNum;
	}

	public int getElecUse() {
		return elecUse;
	}

	public void setElecUse(int elecUse) {
		this.elecUse = elecUse;
	}

	public int getElecFee() {
		return elecFee;
	}

	public void setElecFee(int elecFee) {
		this.elecFee = elecFee;
	}

}
