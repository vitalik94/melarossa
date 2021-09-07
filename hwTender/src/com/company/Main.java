package com.company;

/*
 Тендер на строительство еще одной национальной библиотеки На контракт претендуют несколько бригад строителей.
В каждой бригаде есть некоторое количество работников, обладающих набором профессиональных навыков
(все навыки ограничены специально созданным вами перечисляемым типом(enum);
один работник может обладать несколькими навыками), и свое финансовое предложение.
 Для того чтобы получить контракт, надо соответствовать требованиям (столько-то людей с такими-то навыками, столько-то – с такими-то).
 Из подходящих бригад выбрать самую дешевую. Если подходящих не нашлось – закрыть проект строительства
Использовать коллекции (списки) для представления бригад.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Brigade> brigades = new ArrayList<>();
        Map<Skills, Integer> w1 = new HashMap<>();
        Map<Skills, Integer> w2 = new HashMap<>();
        Map<Skills, Integer> w3 = new HashMap<>();

        brigades.add(new Brigade("Строймонтаж", 3000, w1));
        w1.put(Skills.BUILDER, 2);
        w1.put(Skills.CONCRETEWORKER, 1);
        w1.put(Skills.FITTER, 3);
        w1.put(Skills.INSTALER, 1);
        w1.put(Skills.WELDER, 4);

        brigades.add(new Brigade("Проммонтаж", 4000, w2));
        w2.put(Skills.BUILDER, 3);
        w2.put(Skills.CONCRETEWORKER, 5);
        w2.put(Skills.FITTER, 2);
        w2.put(Skills.INSTALER, 4);
        w2.put(Skills.WELDER, 3);

        brigades.add(new Brigade("Промстрой", 2500, w3));
        w3.put(Skills.BUILDER, 4);
        w3.put(Skills.CONCRETEWORKER, 4);
        w3.put(Skills.FITTER, 2);
        w3.put(Skills.INSTALER, 3);
        w3.put(Skills.WELDER, 3);

        ChooseBrigade cb = new ChooseBrigade();

        List<Brigade> br = cb.choiceByTheNumberOfWorkers(brigades);

        if (!br.isEmpty()) {
            Brigade b = cb.choiceByProposal(br);
            System.out.println(b);
        } else {
            System.out.println("подходящей бригады не нашлось – закрыть проект строительства");
        }
    }
}
