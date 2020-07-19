package com.example.git.controller;

import com.example.git.pojo.Student;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * todo: Stream
 * @author xiaogong
 * @date 2020/07/16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamController {

    @Test
    public void testStream(){
        ArrayList<Student> students = Lists.newArrayList(
                new Student(id(), "杨幂", 25, "大幂幂"),
                new Student(id(), "迪丽热巴", 25, "胖迪"),
                new Student(id(), "Angelbaby", 20, "baby"),
                new Student(id(), "凑数的", 27, "凑凑"),
                new Student(id(), "古力娜扎", 23, null),
                new Student(id(),StringUtils.EMPTY, 24, "颖宝"));

//        filter:过滤   map:映射  .limit:取n个元素  .skip(2):跳过n个元素，截取剩余元素
        /*ArrayList<Integer> list = Lists.newArrayList(1,2,3,4,5);
        list.stream().filter(m -> m > 1).map(m -> m * 2).limit(2).forEach(m -> {
            System.out.println("我是m:  "+m);
        });*/

//                guava的transform
        /*Lists.transform(students, new Function<Student, String>() {
            @Override
            public String apply(Student student) {
                if(StringUtils.isBlank(student.getName())){
                    return student.getNickName();
                }
                return student.getName();
            }
        }).stream().forEach(name -> System.out.println("我是name:  "+name));*/

//        map:存在返回值
        /*students.parallelStream().map(student -> {
            if(StringUtils.isBlank(student.getName())){
                return student.getNickName();
            }
            return student.getName();
        }).forEach(name -> System.out.println("我也是name:   "+name));*/

//        forEach:无返回值
        /*students.stream().forEach(student -> {
            if(StringUtils.isBlank(student.getName())){
                System.out.println("我还是name:    "+student.getNickName());
                return;//等同于continue; 非结束方法
            }
            System.out.println("我还是name:    "+student.getName());
        });*/

//        filter:过滤不符合条件的，参数可以是表达式或函数，返回值必须是booler类型
//        map:映射，参数可以是表达式或函数，每个元素必须有返回值
//        sorted:排序 可实现comparator接口，自定义排序
//        distinct：去重
        /*students.stream()
                .filter(student -> StringUtils.isNotEmpty(student.getNickName()) && StringUtils.isNotBlank(student.getName()))
                .map(student -> student.getAge())//映射
                .sorted((o1, o2) -> o2-o1)//自定义排序 desc
                .distinct()//去重
                .forEach(age -> System.out.println(age));//遍历*/

//        数组转 Stream
        /*Integer[] nums = {1,2,3,4,5,6,7};
        Stream<Integer> stream = Arrays.stream(nums);*/

//        流的终止操作
//        Stream.of(1,2,2,3,4,5,6,7,9,8).skip(1).distinct().sorted().limit(7).forEach(num -> System.out.println(num));
//        allMatch：接收一个 Predicate 函数，当流中每个元素都符合该断言时才返回true，否则返回false
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).skip(1).distinct().sorted().limit(7).allMatch(m -> m > 1));
//        noneMatch：接收一个 Predicate 函数，当流中每个元素都不符合该断言时才返回true，否则返回false
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).skip(1).distinct().sorted().limit(7).noneMatch (m -> m > 10));
//        anyMatch：接收一个 Predicate 函数，只要流中有一个元素满足该断言则返回true，否则返回false
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).skip(1).distinct().sorted().limit(7).anyMatch (m -> m > 7));
//        findFirst：返回流中第一个元素
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).findFirst().get());
//        findAny：返回流中的任意元素
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).findAny().get());
//        count：返回流中元素的总个数
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).count());
//        max：返回流中元素最大值
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).max(Integer::compareTo).get());
//         min：返回流中元素最小值：返回流中元素最小值
//        System.out.println(Stream.of(1, 2, 2, 3, 4, 5, 6, 7, 9, 8).min(Integer::compareTo).get());

//        收集操作
        /*students.stream().filter(student -> student.getAge() > 0).collect(Collectors.toList());
        students.stream().filter(student -> student.getAge() > 0).collect(Collectors.toSet());*/

//        嵌套for循环
        /*students.stream().forEach(student -> {
            students.stream().forEach(stu -> {
                if(!student.getAge().equals(stu.getAge())){
                    return; //等同于continue;
                }
                System.out.println(stu.getName());
            });
        });*/

        /*for (Student student : students) {
            if(StringUtils.isBlank(student.getName())){
                continue;//跳过本次循环
//                return; 结束当前方法
            }
        }*/
    }

    public String id(){
        return UUID.randomUUID().toString();
    }
}
