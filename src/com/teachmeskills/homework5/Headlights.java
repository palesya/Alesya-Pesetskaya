package com.teachmeskills.homework5;

public class Headlights {
Enum HeadlightType;
boolean headlightsOn;


    public Headlights(Enum headlightType, boolean headlightsOn) {
        HeadlightType = headlightType;
        this.headlightsOn = headlightsOn;
    }

    public void turnHeadlightsOn(){
    if (!headlightsOn){
        headlightsOn=true;
    }
}

    public void turnHeadlightsOff(){
        if (headlightsOn){
            headlightsOn=false;
        }
    }

    @Override
    public String toString() {
        return "Headlights{" +
                "HeadlightType=" + HeadlightType +
                ", headlightsOn=" + headlightsOn +
                '}';
    }
}
