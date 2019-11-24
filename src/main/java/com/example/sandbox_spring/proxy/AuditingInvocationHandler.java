package com.example.sandbox_spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class AuditingInvocationHandler implements InvocationHandler {

   private final Object target;
   private final Auditor auditor;

   AuditingInvocationHandler(Object target, Auditor auditor) {
      this.target = target;
      this.auditor = auditor;
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

      auditor.audit(target.getClass().getName(), "before=" + method.getName());
      Object result = method.invoke(target, args);
      auditor.audit(target.getClass().getName(), "after=" + method.getName());

      return result;
   }
}