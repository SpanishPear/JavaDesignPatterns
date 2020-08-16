package Behavioural.Visitor.Visitor;
import Behavioural.Visitor.Shapes.*;


public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}