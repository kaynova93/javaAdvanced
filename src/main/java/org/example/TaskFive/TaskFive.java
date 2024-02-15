package org.example.TaskFive;

import java.text.Collator;
import java.util.*;

public class TaskFive {

    Map<String, Integer> countMap = new HashMap<>();

    /**
     * Сортировка списка
     * @param listString принимает список строк
     */
    public void sortList(List<String> listString){
        Collections.sort(listString, new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return Collator.getInstance().compare(s1, s2);
        }
    });
    }

    /**
     * Поиск дублей в списке
     * Для вывода статистики использована HashMap
     * Где ключ = слово, значение = кол-во повторений
     * @param listString - список слов
     */
    public void counterDuplicate(List<String> listString){
        List<Object> duplicates = new ArrayList<>();
        listString.forEach(n -> {
            if (countMap.containsKey(n)) {
                countMap.put(n, countMap.get(n) + 1);
            } else {
                countMap.put(n, 1);
            }
        });
        countMap.keySet().forEach(k -> {
            if(countMap.get(k)> 1) {
                duplicates.add(k);
            }
        });
        System.out.println("Статистика = \n"+countMap);
    }

    /**
     * Поиск максимального значения в HashMap
     * и вывод результатов
     */
    public void printResult(){
        int maxValue = Collections.max(countMap.values());
        String s = Collections.max(countMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("Итог \nСлово: "+ s +  ". Повторения: " +maxValue);
    }
}
