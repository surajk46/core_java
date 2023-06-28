package p4_comparer;

public class NameComparer implements Comparer {
	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		String str1=s1.getName();
		String str2=s2.getName();
		return  (str1.compareTo(str2));
	}
}
