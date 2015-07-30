import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections1 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1));
		list.add(new Employee(5));
		list.add(new Employee(2));
		list.add(new Employee(4));
		list.add(new Employee(1));
		System.out.println("**** LIST ****");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		System.out.println("**** SET ****");
		//Set<Employee> set = new HashSet<Employee>();
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(16));
		set.add(new Employee(1));
		set.add(new Employee(17));
		set.add(new Employee(5));
		set.add(new Employee(2));
		set.add(new Employee(4));
		set.add(new Employee(1));
		
		for (Employee employee : set) {
			System.out.println(employee);
		}
		
		System.out.println("**** MAP ****");
		
		//Map<Employee, Integer> map = new HashMap<>();
		//Map<Employee, Integer> map = new LinkedHashMap<>();
		Map<Employee, Integer> map = new TreeMap<>();
		map.put(new Employee(1), 1);
		map.put(new Employee(5), 2);
		map.put(new Employee(2), 3);
		map.put(new Employee(4), 1);
		map.put(new Employee(1), 0);
		Iterator itr = map.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Employee, Integer> pair = (Map.Entry)itr.next();
			System.out.println(pair.getKey() + ", " + pair.getValue());
		}
	}
}


class Employee implements Comparable<Employee>{
	public int id;

	public Employee(int id) {
		this.id = id;
	}
	
	public int hashCode(){
		return id;	
	}
	
	public boolean equals(Object obj){
		Employee another = (Employee)obj;
		return another.id == this.id;
	}

	@Override
	public int compareTo(Employee another) {
		// Sorting logic can be defined in this method
		//return another.id - this.id;
		return this.id - another.id;
	}
	
}