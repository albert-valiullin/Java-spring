package ru.kpfu.itis.spring.lec03.lab02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Created by Admin on 09.04.2015.
 */
@Configuration
public class ServerAppConfig {

    @Bean
    public  Greeter greeter(){
        return new GreeterImpl();
    }

    @Bean
    public RmiServiceExporter exporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setService(greeter());
        exporter.setServiceName("Greeter");
        exporter.setServiceInterface(Greeter.class);
        exporter.setRegistryPort(1199);
        return exporter;
    }
}
