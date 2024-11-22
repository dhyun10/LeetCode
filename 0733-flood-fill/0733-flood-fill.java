class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
		if(image[sr][sc] != color) {
			fill(image, sr, sc, color, image[sr][sc]);
		}
        return image;
    }
	
	public void fill(int[][] image, int sr, int sc, int newColor, int color) {
		if(image[sr][sc] == color) {
			image[sr][sc] = newColor;
			// image[sr-1][sc]
			// image[sr+1][sc]
			// image[sr][sc-1]
			// image[sr][sc+1]
			if(sr-1 >= 0) {
				fill(image, sr-1, sc, newColor, color);
			}
			if(sr+1 < image.length) {
				fill(image, sr+1, sc, newColor, color);
			}
			if(sc-1 >= 0) {
				fill(image, sr, sc-1, newColor, color);
			}
			if(sc+1 < image[0].length) {
				fill(image, sr, sc+1, newColor, color);
			}
		}
	}
}