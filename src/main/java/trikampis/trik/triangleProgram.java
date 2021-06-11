package trikampis.trik;

public class triangleProgram {
	
	public Lines lines = new Lines();
	
	public triangleProgram() 
	{
		
		int[] lines = {5, 8, 6};
		
		TriangleCalculator triangle_calc = new TriangleCalculator(lines);
		
		Triangles triangles = new Triangles();
		TrianglePosition triangle = new TrianglePosition(0, 0, 0, 0, 0, 0);
				
		while(triangles == null || triangle.a != -1) {
			triangle = triangle_calc.findLargestTriangle();
			
			if(triangle.a != -1) {
				triangles.addTriangle(triangle);
			}
		}
		
		
		
		for(TrianglePosition tri : triangles.triangles) {
			System.out.println(tri);
		}
		System.out.println(triangle_calc.timeCount);
	}
	
	public triangleProgram(Lines lines) 
	{
		this.lines = lines;
		
	}
	
	public void runTriangleProgram() {
		TriangleCalculator triangle_calc = new TriangleCalculator(lines);
		
		Triangles triangles = new Triangles();
		TrianglePosition triangle = new TrianglePosition(0, 0, 0, 0, 0, 0);
				
		while(triangles == null || triangle.a != -1) {
			triangle = triangle_calc.findLargestTriangle();
			
			if(triangle.a != -1) {
				triangles.addTriangle(triangle);
			}
		}
		
		for(TrianglePosition tri : triangles.triangles) {
			System.out.println(tri);
		}
		System.out.println(triangle_calc.timeCount);
	}
	
	
}
