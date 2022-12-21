package Java_Core_Classes.day40_FinalKeyword;

import Java_Core_Classes.Recap.ShapeTask.Circle;
import Java_Core_Classes.Recap.ShapeTask.Square;

import java.security.spec.RSAOtherPrimeInfo;

public class EncapsulationReview {
    private Circle circle;

    private Square square;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if (circle.getRadius() < 5){
            return;
        }
        this.circle = circle;
    }

    public Square getSquare() {
        return square;
    }

    public void setSquare(Square square) {
        this.square = square;
    }


}
