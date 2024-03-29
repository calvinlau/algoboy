import java.util.HashMap;

/**
 * Given n points on a 2D plane, find the maximum number of points that lie on
 * the same straight line.
 * 
 * @author calvinliu
 * @Solution Use stack to save every level's smallest node
 */
public class MaxPointsonaLine {
	public int maxPoints(Point[] points) {
		if (points.length <= 0)
			return 0;
		if (points.length <= 2)
			return points.length;
		int result = 0;
		for (int i = 0; i < points.length; i++) {
			HashMap<Double, Integer> hm = new HashMap<Double, Integer>();
			int samex = 1;
			int samep = 0;
			for (int j = 0; j < points.length; j++) {
				if (j != i) {
					if ((points[j].x == points[i].x) && (points[j].y == points[i].y)) {
						samep++;
					}
					if (points[j].x == points[i].x) {
						samex++;
						continue;
					}
					double k = (double) (points[j].y - points[i].y) / (double) (points[j].x - points[i].x);
					if (hm.containsKey(k)) {
						hm.put(k, hm.get(k) + 1);
					} else {
						hm.put(k, 2);
					}
					result = Math.max(result, hm.get(k) + samep);
				}
			}
			result = Math.max(result, samex);
		}
		return result;
	}
}

class Point {
	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	}

	Point(int a, int b) {
		x = a;
		y = b;
	}
}