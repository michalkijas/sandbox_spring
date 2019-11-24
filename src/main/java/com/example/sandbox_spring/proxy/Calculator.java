package com.example.sandbox_spring.proxy;

interface Calculator<T> {
   T sum(T left, T right);
}
