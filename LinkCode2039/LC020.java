package LinkCode2039;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LC020 {
	public List<Map.Entry<Integer, Double>> dicesSum(int n) {
		List<Map.Entry<Integer, Double>> result = new ArrayList<Map.Entry<Integer, Double>>();
		double[][] f = new double[n + 1][6 * n + 1];
		for (int i = 1; i <= 6; ++i)
			f[1][i] = 1.0 / 6;
		
		for (int i = 2; i <= n; ++i)
			for (int j = i; j <= 6 * n; ++j) {
				for (int k = 1; k <= 6; ++k)
					if (j > k)
						f[i][j] += f[i - 1][j - k];

				f[i][j] /= 6.0;
			}

		for (int i = n; i <= 6 * n; ++i)
			result.add(new AbstractMap.SimpleEntry<Integer, Double>(i, f[n][i]));

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC020 s=new LC020();
		List<Map.Entry<Integer, Double>> res = new ArrayList<Map.Entry<Integer, Double>>();
		res=s.dicesSum(1);
		System.out.println(res);
		
	}

}
