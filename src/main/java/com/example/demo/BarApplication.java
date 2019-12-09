package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.jaegertracing.internal.JaegerTracer;

@SpringBootApplication
public class BarApplication {

	public static void main(String[] args) {
		SpringApplication.run(BarApplication.class, args);
	}
	
	@Bean
    public static JaegerTracer getTracer() {
        
        Configuration.Propagation propogateConfig =  Configuration.Propagation.B3;
        Configuration.CodecConfiguration codecConfig =  Configuration
        		.CodecConfiguration
        		.fromEnv()
        		.withPropagation(propogateConfig) ;
        Configuration config = Configuration.fromEnv();	
        config.withCodec(codecConfig);
        return config.getTracer();
	}
	
	/*@Bean
    public static JaegerTracer getTracer() {
        Configuration.SamplerConfiguration samplerConfig = Configuration
        		.SamplerConfiguration
        		.fromEnv()
        		.withType("const")
        		.withParam(1);
        Configuration.ReporterConfiguration reporterConfig = Configuration
        		.ReporterConfiguration
        		.fromEnv()
        		.withLogSpans(true);
        Configuration.Propagation propogateConfig =  Configuration.Propagation.B3;
        Configuration.CodecConfiguration codecConfig =  Configuration
        		.CodecConfiguration
        		.fromEnv()
        		.withPropagation(propogateConfig);
        
        Configuration config = new Configuration("Bar Service")
        		.withSampler(samplerConfig)
        		.withReporter(reporterConfig)
        		.withCodec(codecConfig);
        
        return config.getTracer();
	}*/
	
}
