package anonyEx_02;

public class Shape {
	
	int width = 0; //가로
	int length = 0; //세로
	int height = 0; //높이
	
	void calc() {
		
	}

	void printS() {
		System.out.println("가로: " + width + " / 세로: " + length);
	}
	
	//게터세터
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	};
	
	
	
	
	
	
	
}
