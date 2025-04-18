package poc.java.features;

import java.util.List;

public class Java21Features {
    public static void main(String[]args){

        if(" ".isEmpty()){

        }
        System.out.println("Prakash".repeat(5));


        List<String> names = List.of("Java", "Python", "C++");

        // ✅ Efficient and clean
        String result = String.join(", ", names);
        System.out.println(result); // Output: Java, Python, C++

        String result1 = String.join(", ", "Prakash Chandra Nayak".split(" "));
        System.out.println(result1);

        String text = "Java\nis\nawesome";
        System.out.println(text.indent(2));
    }
}

