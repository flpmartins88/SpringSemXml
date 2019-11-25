package io.github.flpmartins88.springsemxml;

import io.github.flpmartins88.springsemxml.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Felipe
 */
public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        
        Mensagem mensagem = context.getBean(Mensagem.class);
        
        System.out.println(mensagem.getMensagem());
    }

}
