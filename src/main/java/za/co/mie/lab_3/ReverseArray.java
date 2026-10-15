package za.co.mie.lab_3;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseArray {
    String[] names;

    public ReverseArray(String[] p_names){
        this.names = p_names;
        reverse();
    }

    public void reverse(){
        LinkedList<String> reversed_names = new LinkedList<>();
        for (String name: this.names){
            reversed_names.addFirst(name);
        }
        this.names = reversed_names.toArray(new String[this.names.length]);
    }

    public void display_reverse(){
        System.out.println(Arrays.toString(this.names));
    }
}
