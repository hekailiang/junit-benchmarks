package com.carrotsearch.junitbenchmarks;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class TestRepository {
   
   private static Map<TestId,BenchmarkInvokeMethod> repository;
   
   static{
      repository = new ConcurrentHashMap<TestId, BenchmarkInvokeMethod>(8, 0.75f, 16);
   }

   public static void addTest(TestId id, BenchmarkInvokeMethod test){
      repository.put(id, test);
   }
   
   public static BenchmarkInvokeMethod getTest(TestId id){
      return repository.get(id);
   }
   
}
