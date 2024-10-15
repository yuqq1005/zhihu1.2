package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest//如果在测试类上添加了这个注解，那么将来单元测试方法执行之前，会先初始化Spring容器
public class RedisTest {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void testSet(){
//往redis中存储一个键值对，StringRedisTemplate
        ValueOperations<String,String> operations=stringRedisTemplate.opsForValue();
        operations.set("username","zhangsan");
    }
    @Test
    public void TestGet(){
        ValueOperations<String,String> operations=stringRedisTemplate.opsForValue();
        System.out.println(operations.get("username"));
    }
}
