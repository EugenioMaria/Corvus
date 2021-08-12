package main;

public class CorvusUtils {
    public static String IdentationBuilder(int index){
        int i = 0;
        String ident = "";
        for(i=0;i<index;i++){
            ident += "\t";
        }
        return ident;
    }
}
