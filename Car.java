interface Brake{
    void brake();
}
interface Engine{
    void start();
    void stop();
    void accelerate();
}
interface Media{
    
    void pause();
    void turnoff();
}

 class Car implements Brake,Engine,Media{
    public void start(){
        System.out.println("starting");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void accelerate(){
        System.out.println("accelerating");
    }
    public void brake(){
        System.out.println("break");
    }
    public void pause(){
        System.out.println("paused");
    }
    public void turnoff(){
        System.out.println("turned off");
    }
    public static void main(String[]args){
        Car c=new Car();
        c.start();
        c.stop();
        c.accelerate();
        c.brake();
        c.pause();
        c.turnoff();
    }



}
