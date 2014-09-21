/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.flpmartins88.springsemxml;

import com.wordpress.flpmartins88.springsemxml.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Felipe
 */
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        
        Mensagem mensagem = context.getBean(Mensagem.class);
        
        System.out.println(mensagem.getMensagem());
    }

}
