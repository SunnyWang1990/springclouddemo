package provider;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import provider.impl.ProviderServiceImpl;

@Configuration
public class ProviderCfg {
	@Bean
	public ProviderService providerService(){
		
		return new ProviderServiceImpl();
	}

}
