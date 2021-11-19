package immutable;

import java.util.HashMap;
import java.util.Map;

 final class Student {

        private final String name;
        private final int age;
        private final Map<String, String> metadata;


        public Student(String name, int age, Map<String, String> metadata)
        {

            this.name = name;
            this.age = age;


            Map<String, String> tempMap = new HashMap<>();

            for (Map.Entry<String, String> entry :
                    metadata.entrySet()) {
                tempMap.put(entry.getKey(), entry.getValue());
            }

            this.metadata = tempMap;
        }

        // Method 1
        public String getName() {
            return name;
        }

        // Method 2
        public int getAge() {
            return age;
        }

        // Note tha there should not be any setters

        // Method 3
        // User -defiened type
        // To get meta data
        public Map<String, String> getMetadata()
        {

            // Creating Map with HashMap reference
            Map<String, String> tempMap = new HashMap<>();

            for (Map.Entry<String, String> entry :
                    this.metadata.entrySet()) {
                tempMap.put(entry.getKey(), entry.getValue());
            }
            return tempMap;
        }
    }

    // Class 2
// Main class
    class  Scholar{

        public static void main(String[] args)
        {
            // Creating Map object with reference to HashMap
            Map<String, String> map = new HashMap<>();

            // Adding elements to Map object
            // using put() method
            map.put("1", "first");
            map.put("2", "second");

            Student s = new Student("ABC", 101, map);

            // Calling the above methods 1,2,3 of class1
            // inside main() method in class2 and
            // executing the print statement over them
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getMetadata());

            // Uncommenting below line causes error
            // s.regAge = 102;

            map.put("3", "third");
            // Remains unchanged due to deep copy in constructor
            System.out.println(s.getMetadata());
            s.getMetadata().put("4", "fourth");
            // Remains unchanged due to deep copy in getter
            System.out.println(s.getMetadata());
        }
    }


