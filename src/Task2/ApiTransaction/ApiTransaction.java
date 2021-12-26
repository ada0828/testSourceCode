package Task2.ApiTransaction;

import Task2.ApiImplementation.*;

public class ApiTransaction {
    public ChanceTminSC getChanceTminSC(){
        return new ChanceTminSC();
    }
    public ChanceMslpSC getChanceMslpSC(){
        return new ChanceMslpSC();
    }
    public ChanceTmaxSC getChanceTmaxSC(){
        return new ChanceTmaxSC();
    }
    public FlwWxiconsC getFlwWxiconsC(){
        return new FlwWxiconsC();
    }
    public FndUC getFndUC(){
        return new FndUC();
    }
}
