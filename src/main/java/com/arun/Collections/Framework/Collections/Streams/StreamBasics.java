package com.arun.Collections.Framework.Collections.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamBasics {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        long count = list.stream().filter((Integer val) -> val >= 30).count();
        System.out.println(count);

//        Intermediate Operations
        List<Integer> collect = list.stream().map((Integer val) -> val * 10).collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> distinctElements= list
                .stream()
                .distinct()
                .peek((Integer val)->System.out.println(val))
                .toList();
        System.out.println(distinctElements);


        List<Integer> sortedlist = list.stream().sorted().toList();
        System.out.println(sortedlist);

        ArrayList<Integer> list5 = new ArrayList<>();
        list5.add(10);
        list5.add(40);
        list5.add(20);
        list5.add(30);

        List<Integer> limitedList = list5.stream().limit(2).toList();
        System.out.println(limitedList);


        ArrayList<Integer> list6 = new ArrayList<>();
        list6.add(10);
        list6.add(40);
        list6.add(20);
        list6.add(30);

        List<Integer> skippedList = list6.stream().skip(2).toList();
        System.out.println(skippedList);

        List<List<Integer>> nestedList= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
                );

        List<Integer> allElements = nestedList.stream().flatMap((List<Integer> values) -> values.stream()).collect(Collectors.toList());
        System.out.println(allElements);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(8);
        numbers.add(3);
        numbers.add(20);
        numbers.add(50);

        List<Integer> streamProcessed = numbers.stream()
                .map((Integer intValue) -> intValue * 10)
                .peek((Integer a) -> System.out.println(a))
                .filter((Integer d) -> d > 30)
                .peek((Integer e) -> System.out.println(e))
                .sorted()
                .peek((Integer f) -> System.out.println(f))
                .collect(Collectors.toList());
        System.out.println(streamProcessed);

        ArrayList<Integer> list7 = new ArrayList<>();
        list7.add(10);
        list7.add(40);
        list7.add(20);
        list7.add(30);

        list7.stream().forEach((Integer k)->System.out.println(k));

        Optional<Integer> min = list7.stream().min((Integer value1,Integer value2)->value1-value2);
        System.out.println(min.get());

    }
}
