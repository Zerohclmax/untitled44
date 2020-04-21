package phone;

import java.util.Objects;

public class phonefirst {
    int size;
    String cpu;
    int men;
    public phonefirst(){
        this.cpu="i5";
        this.men=10000;
        this.size=20389;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        phonefirst that = (phonefirst) o;
        return size == that.size &&
                men == that.men &&
                Objects.equals(cpu, that.cpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, cpu, men);
    }
}
