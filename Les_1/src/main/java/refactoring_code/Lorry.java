package refactoring_code;

class Lorry extends Car implements Moveable, Stopable// extends Car, Moveable, Stopable -> extends Car implements Moveable, Stopable
{
    public void move(){
        System.out.println("Car is moving");// Car -> Lorry
    }
    public void stop(){
        System.out.println("Car is stop");// Car -> Lorry
    }

    @Override
    void open() {

    }
}

