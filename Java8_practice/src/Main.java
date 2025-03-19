import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names=new ArrayList<>();
        List filteredName;
        names.add("Mohan Lal");
        names.add("Sabita");
        names.add("raju Lal");
        names.add("Lalitha");
        names.add(null);
        //filteredName = names.stream().filter(name -> !name.endsWith("Lal")).toList();
        filteredName = names.stream().filter(Objects::nonNull).filter(x->x.startsWith("Lal")).toList();

      var  r = names.stream().filter(s -> Optional.ofNullable(s).isPresent()).filter(s -> !s.endsWith("lal")).collect(Collectors.toList());

        System.out.println("filtered name is -->"+filteredName);
        System.out.println("filtered name is -->"+r);
    }
}

/*
import java.util.*;


class Main {


    public static void main(String[] args) {

        List<String> strList = Arrays.asList("Madhanlal", "Raju", "Ravi", "Mothilal", "Jawaharlal", null);

        strList.stream().filter(str -> (Optional.ofNullable(str).isPresent() && !str.endsWith("lal"))).forEach(

                System.out::println);

    }

}

import java.util.*;

        import java.util.stream.*;

class Main {
    public static void main(String[] args) {

        String arr[] = {"ramlal","sum","motilal",null};



        List<String> l = Arrays.asList(arr);

        List<String> r = new ArrayList<>();

//Optional<String> o = Optional<String>.ofNullable(l);

        r = l.stream().filter(s -> Optional.ofNullable(s).isPresent()).filter(s -> !s.endsWith("lal")).collect(Collectors.toList());

        System.out.println(r);
    }
}*/
