package ru.Mkedonsky;
import java.util.ArrayList;
import java.util.HashMap;

public class NumBook {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Селиверсов", "+798789690");
        phoneBook.add("Шматько", "+79660040436");
        phoneBook.add("Сергеев", "+79678788797");
        phoneBook.add("Селиверсов", "+79869969600");
        phoneBook.add("Букамбаев", "+798596940436");
        phoneBook.add("Суворов", "+796758869697");
        phoneBook.add("Саженцев", "+79865783900");
        phoneBook.add("Мамуга", "+79453662617");
        phoneBook.add("Сергеев", "+79348788797");
        phoneBook.add("Панов", "+757866995736");
        phoneBook.add("Соврасов", "+7576885540");
        phoneBook.add("Узнов", "+7967686849400");
        phoneBook.add("Ребров", "+79665786995");
        phoneBook.add("Жуков", "+79758859999");
        phoneBook.add("Буаринов", "+79886969956");
        phoneBook.add("Земляк", "+765573738383");
        phoneBook.add("Кузьмин", "+79865777470");
        phoneBook.add("Мыц", "+794903662617");
        phoneBook.add("Сухарев", "+79678456797");
        phoneBook.add("Панович", "+75786698799");


        System.out.println(phoneBook);
        System.out.println();
        System.out.println(phoneBook.phoneBook.get("Сергеев"));

    }


    public static class PhoneBook {
            private HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

            public void add(String name, String num) {
                ArrayList<String> numList = phoneBook.get(name);
                if (numList == null) numList = new ArrayList<>();
                numList.add(num);
                phoneBook.put(name, numList);


            }

    }
}
