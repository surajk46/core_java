package p4_comparer;

public class RollComparer implements Comparer {

	@Override
	public int comparer(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.getRollNo()-s2.getRollNo();
	}

}
