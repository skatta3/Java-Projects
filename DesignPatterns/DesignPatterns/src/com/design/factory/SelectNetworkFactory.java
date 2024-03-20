package com.design.factory;

public class SelectNetworkFactory {
    public CellularPlan getPlan(String planType){
         if(planType == null){
                 return null;
         }
         if(planType.equalsIgnoreCase("ANetwork")) {
                 return new ANetwork();
         }
         else if(planType.equalsIgnoreCase("VNetwork")){
                 return new VNetwork();
         }
         else if(planType.equalsIgnoreCase("SNetwork")) {
                 return new SNetwork();
         }
    return null;
    }

}
