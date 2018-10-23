package giuf;

import java.util.ArrayList;
import java.util.Collections;

public class niuke010 {
	ArrayList<Integer> a1 = new ArrayList<Integer>();

	public void Insert(Integer num) {
		a1.add(num);
		Collections.sort(a1);
	}

	public Double GetMedian() {
		int mid = a1.size() / 2;
		if ((a1.size() & 1) == 0) {
			Integer n1 = a1.get(mid);
			Integer n2 = a1.get(mid - 1);
			double s = (Double.valueOf(n1 + "") + Double.valueOf(n2 + "")) / 2;
			return s;
		} else {
			double s = Double.valueOf(a1.get(mid) + "");
			return s;

		}

	}
}
