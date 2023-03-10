package streamEx_04;

import java.util.Arrays;
import java.util.stream.LongStream;

public class MapExample02 {

	public static void main(String[] args) {
		// long ¹è¿­ -> double
		long[] longArray = {1L, 2L, 3L, 4L, 5L};
		
		LongStream longStream = Arrays.stream(longArray);
		longStream.asDoubleStream().map(d -> d * 3.14).forEach(d -> System.out.println(d));
		System.out.println();
		
		longStream = Arrays.stream(longArray);
		longStream.boxed().forEach(obj -> System.out.println(obj.longValue()));
	}

}
