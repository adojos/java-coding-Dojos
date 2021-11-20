package com.testoxide.dojo.kyu8;
/* Each day a plant is growing by upSpeed meters. Each night that plant's height decreases by downSpeed
meters due to the lack of sun heat. Initially, plant is 0 meters tall. We plant the seed at the beginning
of a day. We want to know when the height of the plant will reach a certain level.*/

public class PlantGrowth {
    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight){
        int i = 0;
        for (int startHeight = 0; startHeight <= desiredHeight; startHeight += upSpeed, i++){
            if (startHeight != 0){
            System.out.println("After day " + i + " --> " + startHeight);
            if (startHeight==desiredHeight) break;
            startHeight = startHeight-=downSpeed;
            System.out.println("After night " + i + " --> " + startHeight);
        }
        }
        return i;
    }

    public static void main (String args[]) {
        //kyu8.PlantGrowth pg = new kyu8.PlantGrowth();
        int x = PlantGrowth.growingPlant(100,10,910);
        System.out.println(x);
    }

}
