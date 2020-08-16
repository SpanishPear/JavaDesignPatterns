package Structural.Adapter.Adapters;

import Structural.Adapter.Round.RoundPeg;
import Structural.Adapter.Square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // we don't want to edit SquarePeg directly
    // we want to create an adaptor that allows roundHole to get the radius of a square peg!
    // hence we override the RoundPeg radius function
    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}