package com.javarush.task.task08_Data_HashMap_сортировки.level08.lesson03.task05ВыводТолькоЗначенийMapCollection;

import java.util.HashMap;
import java.util.Map;

/* Вывести на экран список значений
Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
Вывести на экран список значений, каждый элемент с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printValues(map);
    }

    public static void printValues(Map<String, String> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String,String>entry : map.entrySet())
            System.out.println(entry.getValue());
    }

}
