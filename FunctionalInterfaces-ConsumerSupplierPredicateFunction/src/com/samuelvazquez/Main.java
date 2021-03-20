import com.samuelvazquez.Employee;

import javax.management.relation.RelationNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;


public class Main {
	public static void main(String[] args) {
		Employee samuel = new Employee("Samuel Vazquez", 30);
		Employee michael = new Employee("Michael Scott", 37);
		Employee jim = new Employee("Jim Halpert", 31);
		Employee pam = new Employee("Pam Beesley", 29);
		Employee stanley = new Employee("Stanley Hudson", 45 );
		Employee oscar = new Employee("Oscar Martinez", 32);
		Employee erin = new Employee("Erin Hannon",28);

		List<Employee> employees = new ArrayList<>();
		employees.add(samuel);
		employees.add(michael);
		employees.add(jim);
		employees.add(pam);
		employees.add(stanley);
		employees.add(oscar);
		employees.add(erin);

		Function<Employee,String> getLastName = (Employee employee) -> {
			return employee.getName().substring(employee.getName().indexOf(' ') + 1);
		};

		Function<Employee,String> getFirstName = (Employee employee) -> {
			return employee.getName().substring(employee.getName().indexOf(' '));
		};

		String lastNameB = getLastName.apply(employees.get(0));
		System.out.println(lastNameB);

		//printEmployeesByAge(employees,"Employees over 30", employee -> employee.getAge() > 30);
		printEmployeesByAge(employees,"Employees over 30",employee -> employee.getAge() > 30);
		printEmployeesByAge(employees,"Employees 30 and under", employee -> employee.getAge() <= 30);
		printEmployeesByAge(employees, "Employees older than 40", new Predicate<Employee>() {
			@Override
			public boolean test(Employee employee) {
				return employee.getAge() > 40;
			}
		});

		IntPredicate greaterThan15 = i -> i > 15;
		IntPredicate lessThan100 = i -> i < 100;
		System.out.println(greaterThan15.test(10));
		int a  = 20;
		System.out.println(greaterThan15.test(a+5));

		System.out.println(greaterThan15.and(lessThan100).test(500));

		Random random = new Random();
		Supplier<Integer> randomSupplier = () -> random.nextInt(100);
		for(int i = 0; i < 10; i++) {
			System.out.println(randomSupplier.get());
		}

		employees.forEach(employee -> {
			String lastName = employee.getName().substring(employee.getName().indexOf(' ') + 1);
			System.out.println("Last Name is: " + lastName);
		});

		Random random1 = new Random();
		for(Employee employee: employees) {
			if(random1.nextBoolean()) {
				System.out.println(getAName(getFirstName,employee));
			} else {
				System.out.println(getAName(getLastName, employee));
			}
		}

		Function<Employee,String> upperCase = employee -> employee.getName().toUpperCase();
		Function<String,String> firstName = name -> name.substring(0,name.indexOf(' ' ));
		Function chainedFunction = upperCase.andThen(firstName);
		System.out.println(chainedFunction.apply(employees.get(0)));
	}

	private static String getAName(Function<Employee,String> getName, Employee employee) {
		return getName.apply(employee);
	}

	private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
		System.out.println(ageText);
		System.out.println("==============");
		for(Employee employee : employees) {
			if(ageCondition.test(employee)){
				System.out.println(employee.getName());
			}
		}
	}
}
