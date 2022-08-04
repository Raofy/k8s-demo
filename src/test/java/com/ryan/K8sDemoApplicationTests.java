package com.ryan;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
class K8sDemoApplicationTests {

    @Test
    void contextLoads() {
        List<Integer> all = Arrays.asList(1,2,3,4,5,7,8,9,10);
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(7, 2, 3, 4, 5, 6, 8);

        // 差集 l2 - l1
        List<Integer> collect = l2.stream().filter(item -> !l1.contains(item)).collect(Collectors.toList());
        System.out.println(collect);

        //
        List<Integer> collect1 = all.stream().filter(item -> collect.contains(item)).collect(Collectors.toList());
        System.out.println(collect1);

        List<Integer> collect2 = all.stream().filter(item -> {
            return l1.contains(item) && l2.contains(item);
        }).collect(Collectors.toList());

        System.out.println(collect2);
    }

}
