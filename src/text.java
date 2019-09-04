
import java.lang.reflect.Constructor;

import java.util.Arrays;
import java.util.Date;

public class text {
    public static void main(String[] args) {
        Class c1= Date.class;

       // Method [] methods= c1.getMethods();
        //Arrays.stream(methods).forEach(System.out::println);// [] fields= c1.getDeclaredFields();
        //Arrays.stream(fields).forEach(System.out::println);
        Constructor [] constructors= c1.getDeclaredConstructors();
        Arrays.stream(constructors).forEach(System.out::println);
         int i=3;
        switch (i){
            case 1:
                System.out.println("123");
        }



    }
    }


