package threads;

import java.util.ArrayList;
import java.util.List;

public class BoundedBufferTest {

    public static void main(String[] args){


        BoundedBuffer<List<String>> buffer = new BoundedBuffer<>();
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        new ThreadPut<>(buffer,strings);
        new ThreadTake<>(buffer);




    }


}
