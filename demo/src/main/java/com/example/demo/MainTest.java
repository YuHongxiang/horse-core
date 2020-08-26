package com.example.demo;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;
import java.util.Arrays;
import java.util.Objects;
import org.springframework.data.redis.core.RedisTemplate;

public class MainTest {

    public static void main(String[] args) throws Exception {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        String express = "if('t1' == (searchType) && (b) > '1'){ return 'custName'; }else if('t2'.equals(searchType)){       return   'certiNum';}else\n" +
                "            if('t3'.equals(searchType)){       return   'custId';}";
        context.put("custLevel","1");
        String expressA = "if(( (('1'.equals(custLevel))) )){ return 'defaultBizId1';}else if(( ('2'.equals(custLevel)) )){ return 'defaultBizId2';}";
        Object r = runner.execute(expressA, context,null, true, false);
        System.out.println(r);

    }
}
