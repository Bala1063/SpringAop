/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author BA391760
 */
public class CustomerWithdraw implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        boolean flag=true;
        double amount=0;
        for(Object money:os)
        {
            if(Double.parseDouble(money.toString().trim())>Banking.balance)
            {
                amount=Double.parseDouble(money.toString().trim());
                flag=false;
                break;
            }
         
        }
        if(flag)
        {
            System.out.println("Transaction Amount Accepted");
            
        }
        else
        {
            System.out.println("Sorry,Withdraw Amount"+" "+amount+" "+"Exceeded your Balance");
        }
    }
    
}
