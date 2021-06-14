package com.advance_warn;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

//@ActiveProfiles("dev")
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class AdvanceWarnApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("111111111");
	}

}
