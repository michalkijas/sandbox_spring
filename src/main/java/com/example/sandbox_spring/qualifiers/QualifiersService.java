package com.example.sandbox_spring.qualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @see https://dzone.com/articles/factory-pattern-1
 */
@Service
class QualifiersService {

   @TestName1
   @Autowired
   private TestService service1;

   @TestName2
   @Autowired
   private TestService service2;

   @PostConstruct
   void run() {
      service1.doSomething();
      service2.doSomething();
   }
}