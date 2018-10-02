package spring.in.action.aop;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.in.action.aop.config.Config;
import spring.in.action.aop.model.Performance;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class AppTest {
	
	@Autowired
	private Performance performance;
	
	@Test
	public void shouldNotBeNull() {
		assertNotNull(performance);
	}
}
