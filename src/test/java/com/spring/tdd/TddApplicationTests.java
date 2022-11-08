package com.spring.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TddApplicationTests {

	@Test
	//Test that web is OK
	void testWebPageIsUp() {
		//assertThat(HttpStatus.OK);
	}

	//Test actuator status

}
