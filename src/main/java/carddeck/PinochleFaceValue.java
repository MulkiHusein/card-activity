package carddeck;

public class PinochleFaceValue implements FaceValue {


    static final FaceValue NINE = new PinochleFaceValue("nine" , 9);
    public static final FaceValue JACK = new PinochleFaceValue("jack" , 2);
    public static final FaceValue QUEEN = new PinochleFaceValue("queen" , 3);
    public static final FaceValue TEN = new PinochleFaceValue("ten" , 4);
    public static final FaceValue ACE = new PinochleFaceValue("ace" , 5);
    public static final FaceValue KING = new PinochleFaceValue("king, 6");
    private boolean ordinal;

    public PinochleFaceValue(String nine, int i) {

    }

    public PinochleFaceValue(String name) {
    }


    @Override
    public int ordinal() {
        return 0;
    }


    public int compareTo(PinochleFaceValue that) {
        if (this.ordinal) {

        } else if (this.ordinal ) {
            return -1;
        } else {
            return 0;
        }
return 0;

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PinochleFaceValue{");
        sb.append("ordinal=").append(ordinal);
        sb.append('}');
        return sb.toString();
    }

    public void setOrdinal(boolean ordinal) {
        this.ordinal = ordinal;
    }
}
