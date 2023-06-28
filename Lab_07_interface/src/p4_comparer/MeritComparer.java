package p4_comparer;

public class MeritComparer implements Comparer{
	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return (int) (s1.getMark()-s2.getMark());
	}
}
