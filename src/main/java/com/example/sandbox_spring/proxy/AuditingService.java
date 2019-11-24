package com.example.sandbox_spring.proxy;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.lang.reflect.Proxy;


/**
 * @see https://dzone.com/articles/java-dynamic-proxies
 */
@Service
public class AuditingService {

   @PostConstruct
   void run() {

      Auditor auditor = new Auditor();
      DoubleCalculator calculator = new DoubleCalculator();
      AuditingInvocationHandler invocationHandler = new AuditingInvocationHandler(calculator, auditor);

      Calculator<Double> calculatorProxy = (Calculator<Double>) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Calculator.class}, invocationHandler);

      calculator.sum(10.0, 33.3);
      calculatorProxy.sum(12.5, 15.7);
   }
}
