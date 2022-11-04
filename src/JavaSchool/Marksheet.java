package JavaSchool;

import java.util.Map;
import java.util.Set;

public class Marksheet {
    Marksheet (Map<String, Double>markSheet){
        this.markSheet = markSheet;
    }


    private Map<String, Double> markSheet;

    public double getGpa(){
        Set<String> keySet = markSheet.keySet();
        double total = 0;

        for(String key: keySet) {
            total+= markSheet.get(key);
        }
        return total/markSheet.size();
    }


}
