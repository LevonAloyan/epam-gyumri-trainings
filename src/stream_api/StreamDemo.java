package stream_api;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamDemo {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("120"));
        list.add(new Employee("150"));
        list.add(new Employee("150"));
        list.add(new Employee("30"));
        list.add(new Employee("1000"));

        Integer reduce = list.stream()
                .map(Employee::getSalary)
                .mapToInt(Integer::parseInt)
                .sum();

//        System.out.println(reduce);
// lazy eval
        Stream<Integer> stream = list.stream()
                .map(emp -> {
                    return emp.getSalary();
                })
                .map(Integer::parseInt)
                .sorted();

        System.out.println(stream.findFirst());
        System.out.println("-----------------");
        System.out.println(stream.collect(Collectors.toList()));

//
//
//
//        stream.stream().forEach(System.out::println);
//
//        Set<Integer> collect1 = list.parallelStream()
//                .map(Employee::getSalary)
//                .map(Integer::parseInt)
//                .filter(element -> element > 100)
//                .stream(Collectors.toSet());
//
//        collect1.stream().forEach(System.out::println);
//
//        Arrays.stream(new int[2]);

//        for(String s : list){
//            if (s.startsWith("L")){
//                System.out.println(s);
//            }
//        }

//       list.stream().filter(s -> s.startsWith("L"))
//               .forEach(System.out::println);
    }
}
