package com.teachmeskills.homework5;

public class Headlights {
Enum HeadlightType;
boolean headlightsOn;


    public Headlights(HeadlightType headlightType, boolean headlightsOn) {
        this.HeadlightType = headlightType;
        this.headlightsOn = headlightsOn;
    }

    public void turnHeadlightsOn(){
    if (!this.headlightsOn){
        this.headlightsOn=true;
    }
}

    public void turnHeadlightsOff(){
        if (this.headlightsOn){
            this.headlightsOn=false;
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
