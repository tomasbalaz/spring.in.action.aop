package spring.in.action.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Performance {
	
	public void perform() {
		System.out.println("Performing");
	}

}
