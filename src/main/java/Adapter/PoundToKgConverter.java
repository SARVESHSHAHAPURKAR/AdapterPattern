package Adapter;

import Adaptee.WeighingMachine;
import Adaptee.WeighingMachineInterface;

public class PoundToKgConverter implements PoundToKgConverterInterface{

    WeighingMachineInterface weighingMachine = new WeighingMachine();


    @Override
    public double convertPoundToKg() {
        return weighingMachine.weighInPounds() * 0.45;
    }
}
