package sec04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EtcDemo {

	public static void main(String[] args) {
		List<String> list1 = List.of("바나나", "사과", "키위", "포도", "사과");
		HashSet<String> set = new HashSet<>(list1);
		List<String> list2 = new ArrayList<>(set);
		Collections.sort(list2);
		for (String fruit : list2) {
			System.out.printf("%s : %d\n", fruit, Collections.frequency(list1, fruit));
		}

	}

}
