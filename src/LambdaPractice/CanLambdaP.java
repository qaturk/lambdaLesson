package LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class CanLambdaP {
    /*
    Kullanıcıdan int öğelerini girmesini ve listeye öğe eklemesini istemek için kod yazın
        - Kullanıcıdan kaldırılacak öğeleri girmesini isteyin, ardından bu öğeyi listeden kaldırın.
        - Kullanıcıdan güncellemek için öğeyi girmesini isteyin, ardından güncelleyin
     */
    public static void main(String[] args) {
        List<Integer> son = new ArrayList<>();
        System.out.println("lutfen elemanlari giriniz.");
        List<Integer> sayi = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (sayi.size() < 5) {
            int i = s.nextInt();
            sayi.add(i);
        }
        System.out.println(sayi);
        System.out.println("lutfen silmek istediginiz elemani giriniz 2" );
        List<Integer> sil = new ArrayList<>();
        Scanner a = new Scanner((System.in));

        while (sil.size() < 1) {
            int j = a.nextInt();
            sil.add(j);
        }
        System.out.println(sil);
        for (Integer w : sayi) {
                if (!sil.contains(w)) {
                    son.add(w);
                }
            }System.out.println(son);
        }

    }



