package LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P01 {
    /*
    ISINMA (10 Dakika)
         1) Bir paket oluşturun ve "LambdaPractic" olarak adlandırın.
         2) "P01" olarak adlandırılan bir sınıf oluşturun
         3) 5 String öğesi içeren bir String listesi oluşturun.
         4) 3 tanesi "A" harfi ile başlayacak
         5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunluğu
            5'ten küçükse, konsoldaki bir listede büyük harflerle yazdırın.*/
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Angie");
        list.add("Andy");
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");

        System.out.println(list.stream()
                .filter(t -> t.startsWith("A"))
                .filter(t -> t.length() < 5)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));
    }
}







