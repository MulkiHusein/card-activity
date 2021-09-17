package carddeck;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StandardFaceValue implements FaceValue, Comparable<StandardFaceValue> {


    public static final FaceValue ACE = new StandardFaceValue("ace", 1);
    public static final FaceValue TWO = new StandardFaceValue("two", 2);
    public static final FaceValue THREE = new StandardFaceValue("three", 3);
    public static final FaceValue FOUR = new StandardFaceValue("four", 4);
    public static final FaceValue FIVE = new StandardFaceValue("five", 5);
    public static final FaceValue SIX = new StandardFaceValue("six", 6);
    public static final FaceValue SEVEN = new StandardFaceValue("seven", 7);
    public static final FaceValue EIGHT = new StandardFaceValue("eight", 8);
    public static final FaceValue NINE = new StandardFaceValue("nine", 9);
    public static final FaceValue TEN = new StandardFaceValue("ten", 10);
    public static final FaceValue JACK = new StandardFaceValue("jack", 11);
    public static final FaceValue QUEEN = new StandardFaceValue("queen", 12);
    public static final FaceValue KING = new StandardFaceValue("king", 13);

    private String name;
    private int ordinal;


    public StandardFaceValue(String ace, int i) {
        this.name = name;
        this.ordinal = ordinal;

    }

    public static Set<FaceValue> values() {
        Set<FaceValue> set = new TreeSet<>();

        Field[] fields = StandardFaceValue.class.getFields();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                try {
                    set.add((StandardFaceValue) field.get(null));
                } catch (IllegalAccessException e) {

                }
            }

        }
        return set;
    }


    public int ordinal() {
        return ordinal;


    }

    public String toString() {
        return name;
    }

    @Override
    public int compareTo(StandardFaceValue that) {
        if (this.ordinal > that.ordinal) {

        } else if (this.ordinal < that.ordinal) {
            return -1;
        } else {
            return 0;
        }
return 0;

    }

}





