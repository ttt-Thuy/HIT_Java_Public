package bttl;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] agrs){
        List<String> fruits = new ArrayList<>();

        fruits.add(" Tao ");
        fruits.add(" chuoi ");
        fruits.add(" cam ");

        System.out.println(" danh sach" + fruits);
        fruits.remove("chuoi");
        System.out.println(" sau xoa"+  fruits);
        System.out.println(" phan tu dau tien"+ fruits.get(0));
    }
}
