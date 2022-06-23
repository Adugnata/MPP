package lesson11.prob2;
import java.util.*;

public class GroupUtil {
	//Fix this code
	public static Group<?> copy(Group<?> group) {
		return (Group<?>) helper(group);

	}
	static <T> T helper(Group<T> group){
		List<T> elements = group.getElements();
        Group<T> grp = new Group(group.getSpecialElement(), elements);
		return (T) grp;
	}
	
	//Test using this main method
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4);
		Group<Integer> group = new Group<>(0, list);
		System.out.println(group);
		System.out.println(GroupUtil.copy(group));
	}
}
