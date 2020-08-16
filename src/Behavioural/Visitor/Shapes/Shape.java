package Behavioural.Visitor.Shapes;

import Behavioural.Visitor.Visitor.Visitor;

public interface Shape {
    void move(int x, int y);

    void draw();

    String accept(Visitor visitor);
}
