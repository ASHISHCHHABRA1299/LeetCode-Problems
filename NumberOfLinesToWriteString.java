package leetcode;

public class NumberOfLinesToWriteString {

	public static void main(String[] args) {
		int[] widths = { 4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 };
		String s = "bbbcccdddaaa";
		int[] output = new int[2];
		int width = 0;
		int nooflines = 0;
		for (char c : s.toCharArray()) {
			width += widths[c - 97];
			if (width >= 100) {
				nooflines++;
				if (width == 100)
					width = 0;
				else {
					int val = width - widths[c - 97];
					width = width - val;
				}
			}
		}
		
		output[0]=nooflines+1;
		output[1]=width;
		System.out.println(output[0]+" "+output[1]);
	}

}
