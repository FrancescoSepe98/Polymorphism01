package it.develhope.polymorphism01;

public class Animal {
    public String animalName;

    public Animal(String name){
        this.animalName=name;
    }
    public String animalSound(){
        return "Roarr!";
    }
    public String animalSound(double intensityDecibel){
        if(intensityDecibel>=80){
            return "Roarrrrrrrr!";
        } if (intensityDecibel > 1 && intensityDecibel <80){
            return "Roar";
        } else {
            return "Cannot reproduce it properly";
        }
    }
}
