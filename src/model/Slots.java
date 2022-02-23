package model;

import java.util.Objects;

public class Slots {
    int start;
    int end;
    boolean status;

    public Slots(int start, int end) {
        this.start = start;
        this.end = end;
        this.status=false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slots slots = (Slots) o;
        return start == slots.start && end == slots.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }
}
