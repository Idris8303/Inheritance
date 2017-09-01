package com.tiy;

public class MountainBike extends bicycle {


        public int seatHeight;


        public MountainBike(int startHeight, int startSpeed, int startGear) {
            super( startSpeed, startGear);
            seatHeight = startHeight;
        }


        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

    }

