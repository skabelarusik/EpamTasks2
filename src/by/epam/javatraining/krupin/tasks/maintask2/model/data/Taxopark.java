package by.epam.javatraining.krupin.tasks.maintask2.model.data;

import by.epam.javatraining.krupin.tasks.maintask2.model.logic.ClassChecker;

import java.util.Arrays;
import java.util.Objects;

public class Taxopark {
    public int massivSize = 10;
    Transport[] transports;

    public Taxopark() {
        transports = new Transport[massivSize];
    }

    public Taxopark(int count) {
        transports = new Transport[count];
    }

    public Taxopark(Transport[] tran){
        transports = new Transport[tran.length];
        for(int i = 0; i < tran.length; i++){
            if(tran[i] != null)
            transports[i] = new Transport(tran[i]);
        }
    }

    public Taxopark(Taxopark taxopark) throws Exception {
        if(taxopark.getTransport().length == 0){
            new Taxopark();
        }else{
            transports = new Transport[taxopark.getTransport().length];
            for(int i = 0; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) !=null){
                transports[i] = new Transport(taxopark.getTransportByIndex(i));
            }
            }
        }

    }

    public void add(Transport transport) {
        boolean check = false;
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) {
                transports[i] = new Transport(transport);
                check = true;
                break;
            }
        }

        if (check == false) {
            if (transports.length == 0) {
                transports = new Transport[massivSize];
                transports[0] = new Transport(transport);
            } else {
                Transport[] temp = new Transport[massivSize];{
                    for (int i = 0; i < temp.length; i++){
                        temp[i] = transports[i];
                    }
                }
                massivSize *= 1.5;
                transports = new Transport[massivSize];
                for (int i = 0; i < temp.length; i++) {
                    transports[i] = temp[i];
                }
                transports[temp.length] = new Transport(transport);
            }
        }
    }

    public void add(Taxopark taxopark) throws Exception {
        if(taxopark.getTransport().length != 0){
            for(int i = 0; i < taxopark.getTransport().length; i++){
                if(taxopark.getTransportByIndex(i) != null){
                add(taxopark.getTransportByIndex(i));
                }
            }
        }
    }

    public int size() {
        int count = 0;
        for (Transport x : transports) {
            count++;
        }
        return count;
    }


    public void setTransportByIndex(Transport transport, int index) throws Exception {
        ClassChecker.checkTaxoparkIndex(transports, index);
        transports[index] = transport;
    }

    public Transport getTransportByIndex(int i) throws Exception {
        ClassChecker.checkTaxoparkIndex(transports, i);
        return transports[i];
    }


    public Transport[] getTransport() {
        return transports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Taxopark taxopark = (Taxopark) o;
        return massivSize == taxopark.massivSize &&
                Arrays.equals(transports, taxopark.transports);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(massivSize);
        result = 31 * result + Arrays.hashCode(transports);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for(Transport x : transports){
            if(x != null){
            stringBuilder.append(x.toString());
            stringBuilder.append("\n");}
        }

        return stringBuilder.toString();
    }
}
