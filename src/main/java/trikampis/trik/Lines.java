package trikampis.trik;

import java.util.ArrayList;

public class Lines {
	ArrayList<Integer> lines;
	ArrayList<Integer> lineCount;
	
	Lines(){
		lines = new ArrayList<Integer>();
		lineCount = new ArrayList<Integer>();
	}
	
	Lines(ArrayList<Integer> lines, ArrayList<Integer> lineCount){
		this.lines = lines;
		this.lineCount = lineCount;
	}
	
	public int getLine(int pos) {
		return lines.get(pos);
	}
	
	public int size() {
		return lines.size();
	}
	
	void addLine(int line) {
		for(int i = 0; i < lines.size(); i++) {
			if(line == lines.get(i)) {
				lineCount.set(i, lineCount.get(i)+1);
				return;
			}
		}
		lines.add(line);
		lineCount.add(1);
	}
	
	void removeLine(int position) {
		//for(int i = 0; i < lines.size(); i++) {
		if(lineCount.get(position) == 1) {
			lines.remove(position);
			lineCount.remove(position);
		}else {
			lineCount.set(position, lineCount.get(position)-1);
		}
		//}
	}
}
