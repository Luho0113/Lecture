package streamEx_05;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		// Optional 努贰胶
		
		//夸家啊 绝绰 府胶飘甫 积己
		List<Integer> list = new ArrayList<>();
		//list.add(10); list.add(20);
		
		//规过1
		OptionalDouble optional = list.stream().mapToInt(Integer::intValue).average();
		if(optional.isPresent()) {
			System.out.println("规过1) 乞闭 : " + optional.getAsDouble());
		} else {
			System.out.println("规过1) 乞闭 : 0.0");
		}
		
		//规过2
		double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("规过2) 乞闭 : " + avg);
		
		//规过3
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a->System.out.println("规过3) 乞闭 : " + a));

	}

}
