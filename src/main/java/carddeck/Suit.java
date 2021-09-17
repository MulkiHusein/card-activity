package carddeck;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Set;
import java.util.TreeSet;

public class Suit implements Comparable<Suit>{


    private static String name;
    private static int ordinal;
    public static final Suit Hearts = new Suit ("Hearts" , 1, name, ordinal);
    public static final Suit Clubs = new Suit("Clubs", 2, name, ordinal);
    public static final Suit DIAMONDS = new Suit("diamonds", 3, name, ordinal);
    public static final Suit SPADES = new Suit("spades", 4, name, ordinal);


    public Suit(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    public Suit(String spades, int i, String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }


    public static Set<Suit> values(){
        Set<Suit> set = new TreeSet<>();

        Field[] fields  =Suit.class.getFields();
        for(Field field : fields){
            if(Modifier.isStatic(field.getModifiers())){
                try{
                    set.add((Suit) field.get(null));
                } catch (IllegalAccessException e){

                }
            }

        }
        return set;
    }

    public int ordinal(){
        return ordinal;


    }
    @Override
    public String toString(){
        return name;
    }


    @Override
    public int compareTo(Suit that) {
        if (this.ordinal > that.ordinal) {

        } else if (this.ordinal < that.ordinal) {
            return -1;
        } else {
            return 0;
        }
return 0;

    }

}
