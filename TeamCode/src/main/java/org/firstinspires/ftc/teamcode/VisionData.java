package org.firstinspires.ftc.teamcode;

import java.util.HashMap;

public class VisionData {
    private HashMap<String, Object> visionData = new HashMap<>();

    //Since there are doubles, ints, bools aren't objects, you need to turn them into
    //objects using new dataType() with overloaded functions.
    public void setVisionData(String key, Object value) {
        visionData.put(key, value);
    }
    public void setVisionData(String key, double value){
        setVisionData(key, new Double(value));
    }
    public void setVisionData(String key, int value){
        setVisionData(key, new Integer(value));
    }
    public void setVisionData(String key, boolean value){
        setVisionData(key, new Boolean(value));
    }

    public Object getVisionData(String key){
        return visionData.get(key);
    }
}
