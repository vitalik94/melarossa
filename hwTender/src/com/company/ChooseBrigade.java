package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ChooseBrigade {

    public List<Brigade> choiceByTheNumberOfWorkers(List<Brigade> b) {
        //выбор на соотвествие по количеству рабочих на професию
        boolean bo = false;
        List<Brigade> brigade = new ArrayList<>();
        for (Brigade br : b) {
            for (Map.Entry<Skills, Integer> e : br.getWorkers().entrySet()) {
                if (e.getKey().equals(Skills.BUILDER) && e.getValue() > 2) {
                    bo = true;
                } else if (e.getKey().equals(Skills.FITTER) && e.getValue() > 1) {
                    bo = true;
                } else if (e.getKey().equals(Skills.CONCRETEWORKER) && e.getValue() > 3) {
                    bo = true;
                } else if (e.getKey().equals(Skills.WELDER) && e.getValue() > 2) {
                    bo = true;
                } else if (e.getKey().equals(Skills.INSTALER) && e.getValue() > 1) {
                    bo = true;
                } else {
                    bo = false;
                    break;
                }
            }
            if (bo) {
                brigade.add(br);
            }
        }
        return brigade;
    }

    public Brigade choiceByProposal(List<Brigade> b) {
        //выбор по низкому финансовому предложению
        Brigade brigade = new Brigade();
        int temp = Integer.MAX_VALUE;

        for (Brigade br : b) {
            if (br.getFinancialProposal() < temp) {
                temp = br.getFinancialProposal();
                brigade = br;
            }
        }
        return brigade;
    }
}
