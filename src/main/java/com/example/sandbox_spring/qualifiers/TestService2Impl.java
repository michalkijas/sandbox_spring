package com.example.sandbox_spring.qualifiers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@TestName2
class TestService2Impl implements TestService {
   @Override
   public void doSomething() {
      log.debug("service with TestName2");
   }
}
