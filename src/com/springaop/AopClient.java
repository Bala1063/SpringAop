/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author BA391760
 */
public class AopClient {
   public static void main(String[] args)
   {
       ApplicationContext context=new ClassPathXmlApplicationContext("newSpringXMLConfig.xml");
       IBanking banking=(IBanking)context.getBean("proxy");
       banking.deposit(2000);
   }
    
}
