package trikampis.trik;

public class TrianglePosition extends Triangle{
	
	int a_pos;
	int b_pos;
	int c_pos;
	
	TrianglePosition(){
		super();
	}
	
	TrianglePosition(int a, int a_pos, int b, int b_pos, int c, int c_pos){
		super(a, b, c);
		
		this.a_pos = a_pos;
		this.b_pos = b_pos;
		this.c_pos = c_pos;
	}
	
	TrianglePosition(int a, int b, int c){
		super(a, b, c);
	}
	
	
	public String toString() {
		return a + " " + b + " " + c + " " + area;
	}
}
