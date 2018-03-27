package groovybench;

import org.openjdk.jmh.annotations.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bogdan Mart on 27.03.2018.
 */
@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 1)
public class JavaBenchmark {
    String value;

    @Setup
    public void setUp() {
        value = "aaa";
    }

    @Benchmark
    public List<Dto> props() {
        List<Dto> lst = new ArrayList<>();
        for (int i=0; i<4000;  i++){
            Dto dto = new Dto();
            dto.setProp1(value);
            dto.setProp2(value);
            dto.setProp3(value);
            dto.setProp4(value);
            dto.setProp5(value);
            dto.setProp6(value);
            dto.setProp7(value);
            dto.setProp8(value);
            dto.setProp9(value);
            dto.setProp10(value);

            lst.add(dto);
        }

        return lst;
    }
}
