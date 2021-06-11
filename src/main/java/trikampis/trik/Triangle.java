package trikampis.trik;

public class Triangle {

	int a;
	int b;
	int c;
	
	double area;
	
	public Triangle() {
		this.a = -1;
		this.b = -1;
		this.c = -1;
		
		area = 0;
	}
	
	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		double s = (a+b+c)/2;
		this.area =  Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}
	
	public boolean equals(Object other){
		Triangle triang = (Triangle) other;
		boolean vienodi = false;
		
		if((a == triang.a) && (b == triang.b) && (c == triang.c)){
			vienodi = true;
		}
		
		return vienodi;
	}
}
