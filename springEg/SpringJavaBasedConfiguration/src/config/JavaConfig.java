package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.Address;
import com.Employee;
import com.HelloWorld;

@Configuration
@PropertySource("classpath:resources/MyProperty.properties")
@ComponentScan("com")
public class JavaConfig {
	
//	@Bean(name="hello")
//	@Scope("prototype")
//	public HelloWorld getHelloWorld() {
//		HelloWorld obj=new HelloWorld();
//		obj.setName("pavan");
//		return obj;
//	}
//	@Bean(name="emp")
//	public Employee getEmployee() {
////		Employee obj=new Employee();
////		obj.setAddress(getAddress());
//		return new Employee();
//	}
//	@Bean(name="add")
//	public Address getAddress() {
//		Address a= new Address();
//		a.setCity("chennai");
//		a.setCountry("india");
//		return a;
//	}
//	@Bean(name="add6")
//	public Address getAddress1() {
//		return new Address();
//		
//	}
}
