package ca.ciccc.assignment7.problem5;

import java.util.Collection;

class RelativelyPrimePredicate implements UnaryPredicate<Integer> {
    public RelativelyPrimePredicate(Collection<Integer> c) {
        this.c = c;
    }

    public boolean test(Integer x) {
        for (Integer i : c)
            if (Algorithm5.gcd(x, i) != 1)
                return false;

        return c.size() > 0;
    }

    private Collection<Integer> c;
}
