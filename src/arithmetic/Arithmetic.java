package arithmetic;
public class Arithmetic<T extends Number, U extends Number> {
    private final T number1;
    private final U number2;

    Number result;
    public Arithmetic(T number1, U number2){
        this.number1 = number1;
        this.number2 = number2;
    }
    // Conditional Statements of Madness! (> . _ . <)
    // If it twerks, it twerks.
    public Number add(){
        if(number1 instanceof Double){
            if(number2 instanceof Double){
                result = number1.doubleValue() + number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.doubleValue() + number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.doubleValue() + number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.doubleValue() + number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.doubleValue() + number2.longValue();
            }
        } else if (number1 instanceof Float) {
            if(number2 instanceof Double){
                result = number1.floatValue() + number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.floatValue() + number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.floatValue() + number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.floatValue() + number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.floatValue() + number2.longValue();
            }
        } else if (number1 instanceof Integer) {
            if(number2 instanceof Double){
                result = number1.intValue() + number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.intValue() + number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.intValue() + number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.intValue() + number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.intValue() + number2.longValue();
            }
        } else if (number1 instanceof Short) {
            if(number2 instanceof Double){
                result = number1.shortValue() + number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.shortValue() + number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.shortValue() + number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.shortValue() + number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.shortValue() + number2.longValue();
            }
        } else if (number1 instanceof Long) {
            if(number2 instanceof Double){
                result = number1.longValue() + number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.longValue() + number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.longValue() + number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.longValue() + number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.longValue() + number2.longValue();
            }
        }
        return result;
    }
    public Number subtract(){
        if(number1 instanceof Double){
            if(number2 instanceof Double){
                result = number1.doubleValue() - number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.doubleValue() - number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.doubleValue() - number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.doubleValue() - number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.doubleValue() - number2.longValue();
            }
        } else if (number1 instanceof Float) {
            if(number2 instanceof Double){
                result = number1.floatValue() - number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.floatValue() - number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.floatValue() - number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.floatValue() - number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.floatValue() - number2.longValue();
            }
        } else if (number1 instanceof Integer) {
            if(number2 instanceof Double){
                result = number1.intValue() - number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.intValue() - number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.intValue() - number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.intValue() - number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.intValue() - number2.longValue();
            }
        } else if (number1 instanceof Short) {
            if(number2 instanceof Double){
                result = number1.shortValue() - number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.shortValue() - number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.shortValue() - number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.shortValue() - number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.shortValue() - number2.longValue();
            }
        } else if (number1 instanceof Long) {
            if(number2 instanceof Double){
                result = number1.longValue() - number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.longValue() - number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.longValue() - number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.longValue() - number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.longValue() - number2.longValue();
            }
        }
        return result;
    }
    public Number multiply(){
        if(number1 instanceof Double){
            if(number2 instanceof Double){
                result = number1.doubleValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.doubleValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.doubleValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.doubleValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.doubleValue() * number2.longValue();
            }
        } else if (number1 instanceof Float) {
            if(number2 instanceof Double){
                result = number1.floatValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.floatValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.floatValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.floatValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.floatValue() * number2.longValue();
            }
        } else if (number1 instanceof Integer) {
            if(number2 instanceof Double){
                result = number1.intValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.intValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.intValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.intValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.intValue() * number2.longValue();
            }
        } else if (number1 instanceof Short) {
            if(number2 instanceof Double){
                result = number1.shortValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.shortValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.shortValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.shortValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.shortValue() * number2.longValue();
            }
        } else if (number1 instanceof Long) {
            if(number2 instanceof Double){
                result = number1.longValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.longValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.longValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.longValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.longValue() * number2.longValue();
            }
        }
        return result;
    }
    public Number divide(){
        if(number1 instanceof Double){
            if(number2 instanceof Double){
                result = number1.doubleValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.doubleValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.doubleValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.doubleValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.doubleValue() * number2.longValue();
            }
        } else if (number1 instanceof Float) {
            if(number2 instanceof Double){
                result = number1.floatValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.floatValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.floatValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.floatValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.floatValue() * number2.longValue();
            }
        } else if (number1 instanceof Integer) {
            if(number2 instanceof Double){
                result = number1.intValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.intValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.intValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.intValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.intValue() * number2.longValue();
            }
        } else if (number1 instanceof Short) {
            if(number2 instanceof Double){
                result = number1.shortValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.shortValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.shortValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.shortValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.shortValue() * number2.longValue();
            }
        } else if (number1 instanceof Long) {
            if(number2 instanceof Double){
                result = number1.longValue() * number2.doubleValue();
            } else if (number2 instanceof Float) {
                result = number1.longValue() * number2.floatValue();
            } else if (number2 instanceof Integer) {
                result = number1.longValue() * number2.intValue();
            } else if (number2 instanceof Short) {
                result = number1.longValue() * number2.shortValue();
            } else if (number2 instanceof Long) {
                result = number1.longValue() * number2.longValue();
            }
        }
        return result;
    }
    public Number getMin(){
        return (number1.doubleValue() < number2.doubleValue()) ? number1 : number2;
    }
    public Number getMax(){
        return (number1.doubleValue() > number2.doubleValue()) ? number1 : number2;
    }
}
