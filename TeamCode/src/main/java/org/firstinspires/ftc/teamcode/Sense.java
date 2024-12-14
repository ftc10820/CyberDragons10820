package org.firstinspires.ftc.teamcode;

import java.util.HashMap;

public class Sense {
    private HashMap<String, Object> senseData = new HashMap<>();

    //Since there are doubles, ints, bools aren't objects, you need to turn them into
    //objects using new dataType() with overloaded functions.
    public void setSense(String key, Object value) {
        senseData.put(key, value);
    }
    public void setSense(String key, double value){
        setSense(key, new Double(value));
    }
    public void setSense(String key, int value){
        setSense(key, new Integer(value));
    }
    public void setSense(String key, boolean value){
        setSense(key, new Boolean(value));
    }

    public Object getSense(String key){
        return senseData.get(key);
    }
}