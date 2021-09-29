package com.test;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
public class ControllerTest {
	
	@Test
	public void testDAO()
	{
		assertThat("Hello").isEqualTo("Hello");
	}

}
