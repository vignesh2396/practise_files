// activity 15

package module;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class hashtotree {
    public static void main(String[] args){

        HashSet<String> hset = new HashSet<String>();
        hset.add("vignesh");
        hset.add("stanley");
        hset.add("shah hussain");
        hset.add("semicolon");
        System.out.println("Hash set = " + hset);

        Set<String> tset = new TreeSet<String>(hset);
        System.out.println("Tree set = " + tset);
        for(String temp:tset){
            System.out.println("Tree set = " + temp);
        }
    }
}
