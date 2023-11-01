
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
public class Source {

	public static void main(String[] args) {
	Set<Employee> tsemp=new TreeSet<Employee>();
	Employee emp1=new Employee(102, "Haneesh", 22000, 20, "Developer");
	tsemp.add(emp1);
	tsemp.add(new Employee(103, "Navya", 21000, 19, "Java Developer"));
	tsemp.add(new Employee(101, "Varshitha", 23000, 21, "Sr. Developer"));
	tsemp.add(new Employee(104, "Likhitha", 22500, 22, "Team leader"));
	tsemp.add(new Employee(105, "Abirami", 22500, 22, "HR"));
	tsemp.add(new Employee(106, "Prabu", 23500, 22, "Team leader"));
	System.out.println("======== Stored default by ID======");
	for (Employee employee : tsemp) {
		System.out.println(employee);
	}
	System.out.println("========= Tree Set By Name==========");
	
	TreeSet<Employee> empName=new TreeSet<Employee>(new SortByName());
	empName.addAll(tsemp);
	for (Employee employee : empName) {
		System.out.println(employee);
	}
	
	System.out.println("============ Tree Set By Designation====");
	TreeSet<Employee> tsDes=new TreeSet<Employee>((o1,o2)->o1.getDesignation().compareTo(o2.getDesignation()));
	
	tsDes.addAll(tsemp);
	
	for(Employee employee : tsDes) {
		System.out.println(employee);
	}
	}
	}



