package trikampis.trik;

import java.util.ArrayList;

public class Triangles {
	ArrayList<TrianglePosition> triangles;
	
	public Triangles() {
		triangles = new ArrayList<TrianglePosition>();
	}
	
	public Triangles(ArrayList<TrianglePosition>  triangles) {
		
		this.triangles = triangles;
	}
	
	public void addTriangle(TrianglePosition triangle) {
		triangles.add(triangle);
	}
}
