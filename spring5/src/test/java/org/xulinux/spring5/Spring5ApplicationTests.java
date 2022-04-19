package org.xulinux.spring5;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;

@SpringBootTest
class Spring5ApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private DataSource dataSource;

	@Test
	void contextLoads() {
		try {
			System.out.println(dataSource.getConnection());
			Executor executor = Executors.newSingleThreadExecutor();
			ThreadPoolExecutor
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
