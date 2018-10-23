package JavaCode;

import java.util.TimeZone;

public class TimeExem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone tZone = TimeZone.getDefault();
		System.out.println(tZone.getID());
		System.out.println(System.getProperty("user.timezone"));
	}

	public class Pair {
		Object first;
		Object second;

		public Pair(Object first, Object second) {
			this.first = first;
			this.second = second;
		}

		public Object getFirst() {
			return first;
		}

		public Object getSecond() {
			return second;

		}
	}

}
