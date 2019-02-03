package com.rag.test;

import com.rag.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Ragesh on 2/3/2019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyServiceTest {
    @Autowired
    private MyService service1;

    @Test
    public void testCallMe(){
        service1.callMe();
    }
}
