package com.example.sandbox_spring.proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class Auditor {
   void audit(String service, String extraData) {
      log.debug("Service=" + service + " extraData=" + extraData);
   }
}
