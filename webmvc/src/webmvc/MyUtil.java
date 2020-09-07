package webmvc;

public class MyUtil {
	//1-10까지의 총 합을 구하는 동작
	public int hap() {
		int sum = 0;
		for( int i=0; i<=10; i++) {
			sum+=i;
		}
		return sum;
	}
}
