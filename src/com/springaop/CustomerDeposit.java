/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author BA391760
 */
public class CustomerDeposit implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object retValue, Method method, Object[] os, Object target) throws Throwable {
        System.out.println("Balance After Transaction:"+retValue);
        System.out.println("Method Name:"+method.getName());
    }
    
}
