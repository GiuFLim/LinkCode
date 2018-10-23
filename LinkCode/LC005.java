package LinkCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC005 {

	public List<String> fizzBuzz(int n) {
		int i = 1;
		ArrayList<String> list = new ArrayList<String>();
		if (i <= n) {
			if (i % 15 == 0)
				list.add("fizz buzz");
			else if (i % 3 == 0)
				list.add("fizz");
			else if (i % 5 == 0)
				list.add("buzz");
			else
				list.add(String.valueOf(i));
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC005 s = new LC005();
		List<String> list = new ArrayList<String>();
		list=s.fizzBuzz(15);
		
		for (String tmp : list) {
			System.out.println(tmp);
		}
		
	}

}
