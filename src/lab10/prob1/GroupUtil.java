package lab10.prob1;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		return copyValue(group);
	}

	private static <T> Group<T> copyValue(Group<T> group){
		List<T> elements = group.getElements();
		return new Group<>(group.getSpecialElement(), elements);
	}
	
	//Test using this main method
	public static void main(String[] args) {
		System.out.println("LAB # 10 --- PROBLEM # 1");
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
