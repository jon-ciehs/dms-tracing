package tracing.dev.stocks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
public class StocksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StocksApplication.class, args);
	}

}
