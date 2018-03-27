package groovybench
import org.openjdk.jmh.annotations.*

/**
 * Created by Bogdan Mart on 27.03.2018.
 */

@State(Scope.Benchmark)
@Fork(1)
@Warmup(iterations = 0)
@Measurement(iterations = 1)
public class GroovyBenchmark {
    String value;

    @Setup
    void setUp() {
        value = "aaa"
    }

    @Benchmark
    public List<Dto> constructor() {
        def lst = [];
        for (int i=0; i<4000;  i++){
            def dto = new Dto(
                    prop1: value,
                    prop2: value,
                    prop3: value,
                    prop4: value,
                    prop5: value,
                    prop6: value,
                    prop7: value,
                    prop8: value,
                    prop9: value,
                    prop10: value,
            )
            lst.add(dto);
        }

        return lst;
    }

    @Benchmark
    public List<Dto> props() {
        def lst = [];
        for (int i=0; i<4000;  i++){
            def dto = new Dto();
            dto.prop1= value;
            dto.prop2= value;
            dto.prop3= value;
            dto.prop4= value;
            dto.prop5= value;
            dto.prop6= value;
            dto.prop7= value;
            dto.prop8= value;
            dto.prop9= value;
            dto.prop10= value;

            lst.add(dto);
        }

        return lst;
    }
}