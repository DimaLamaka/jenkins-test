package ru.clevertec.jenkins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringbootJenkinsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        Assertions.assertEquals(2,1+1);
    }

    @Test
    void test2(){
        Assertions.assertEquals(2,3);
    }

}
