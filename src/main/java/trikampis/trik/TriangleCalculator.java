package trikampis.trik;

import java.util.ArrayList;

public class TriangleCalculator {
	Lines lines;
	
	int timeCount = 0;
	
	TriangleCalculator(){}
	
	TriangleCalculator(int[] lines){
		this.lines = new Lines();
		
		for(int i = 0; i < lines.length; i++) {
			this.lines.addLine(lines[i]);
		}
	}
	
	TriangleCalculator(Lines lines){
		this.lines = lines;
	}
	
	TriangleCalculator(LinesFromFile lines){
		this.lines = lines;
	}
	
	TriangleCalculator(LinesFromInput lines){
		this.lines = lines;
	}
	
	public boolean isTriangle(int a, int b, int c) {
		return ((a < b+c) && (b < a+c) && (c < a+b));
	}
	
	public void removeUsedPositions(TrianglePosition triangle) {
		if(triangle.a != -1) {
			lines.removeLine(triangle.c_pos);
			lines.removeLine(triangle.b_pos);
			lines.removeLine(triangle.a_pos);
		}
	}
	
	public TrianglePosition findLargestTriangle() {
		TrianglePosition triangle = new TrianglePosition();
		TrianglePosition new_triangle = new TrianglePosition();
		
		int a, b, c;
		
		for(int i = 0; i < lines.size(); i++) {	
			for(int j = i; j < lines.size(); j++) {
				for(int z = j; z < lines.size(); z++) {
					timeCount++;
					
					if(((i == j) || (i == z)) && lines.lineCount.get(i) < 2) {
						continue;
					}
					if((j == z) && lines.lineCount.get(j) < 2) {
						continue;
					}
					if(((i == j) && (i == z)) && lines.lineCount.get(i) < 3) {
						continue;
					}
					
					a = lines.getLine(i); 
					b = lines.getLine(j);
					c = lines.getLine(z);
					
					
					
					if(a == -1 || b== -1 || b == -1) {
						continue;
					}
							
					if(isTriangle(a, b, c)) {
						new_triangle = new TrianglePosition(a, i, b, j, c, z);
						
						if(new_triangle.area > triangle.area) {
							triangle = new_triangle;
						}
					}
				}	
			}
		}
		
		removeUsedPositions(triangle);
		return triangle;
	}
}
