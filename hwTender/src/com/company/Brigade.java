package com.company;

import java.util.HashMap;
import java.util.Map;

public class Brigade {

    private String name;
    private int financialProposal;
    private Map<Skills, Integer> workers;

    public Brigade() {
    }

    public Brigade(String name, int financialProposal, Map<Skills, Integer> workers) {
        this.name = name;
        this.financialProposal = financialProposal;
        this.workers = workers;
    }

    public void setFinancialProposal(int financialProposal) {
        this.financialProposal = financialProposal;
    }

    public int getFinancialProposal() {
        return financialProposal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Skills, Integer> getWorkers() {
        return workers;
    }

    public void setWorkers(Map<Skills, Integer> workers) {
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Brigade{" + "name='" + name + '\'' + ", financialProposal=" + financialProposal + ", workers=" + workers + '}';
    }
}
