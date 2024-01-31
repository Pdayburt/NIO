package com.anatkh.buffer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
class NioApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testSet() {
        //String[] res = {"aaa","b","bb","aaa","bbb"};
        HashMap<String, String> resultMap = new HashMap<>();
        String viewValue = "aaa,b,bb,aaa,bbb";

        if (StringUtils.isEmpty(viewValue)) {
            resultMap.put("C_S_B", "0");
        } else {
            String[] ss = viewValue.split(",");
            HashSet<String> strings = new HashSet<>(Arrays.asList(ss));
            resultMap.put("C_S_B", String.valueOf(strings.size()));
        }
        System.out.println(resultMap);

    }

    @Test
    void testStream(){
        Stu jack = new Stu(1, "jack", 19);
        Stu rose = new Stu(2, "rose", 20);
        Stu tome = new Stu(3, "tome", 22);
        Stu jack1 = new Stu(4, "jack", 25);
        Stu rose1 = new Stu(4, "rose", 30);


        ArrayList<Stu> stus = new ArrayList<>();
        stus.add(jack);
        stus.add(rose);
        stus.add(tome);
        stus.add(jack1);
        stus.add(rose1);
        System.out.println(stus);

        Map<String, Integer> collect = stus.stream().collect(Collectors.toMap(e -> e.getName(), e -> e.getAge(), (e1, e2) -> e2));
        System.out.println(collect);

        HashMap<String, Integer> result = new HashMap<>();
        for (Stu stu : stus) {
            String name = stu.getName();
            Integer age = stu.getAge();
            result.put(name,age);
        }
        System.out.println(result);

    }

}
@Data
@NoArgsConstructor
@AllArgsConstructor
class Stu{
    private Integer id;
    private String name;
    private Integer age;
}
