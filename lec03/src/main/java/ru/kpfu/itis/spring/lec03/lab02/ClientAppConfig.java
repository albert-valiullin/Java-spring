package ru.kpfu.itis.spring.lec03.lab02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Created by Admin on 09.04.2015.
 */
@Configuration
public class ClientAppConfig {

    @Bean
    public RmiProxyFactoryBean rmiProxy(){
        RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
        rmiProxy.setServiceUrl("rmi://localhost:1199/Greeter");
        rmiProxy.setServiceInterface(Greeter.class);
        return rmiProxy;
    }
}
