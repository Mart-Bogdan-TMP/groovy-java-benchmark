

Sample project measures overhead of groovy when dealing with properties, 
compared to java. 

## Results

### Cold run
When code executed first time, without JITC optimizations/groovy optimizations
```
Benchmark                     Mode  Cnt     Score   Error  Units
GroovyBenchmark.constructor  thrpt         32.678          ops/s
GroovyBenchmark.props        thrpt         69.399          ops/s
JavaBenchmark.props          thrpt       3150.613          ops/s
```


### Warmed up results
When JVM was warmed up and optimized code
```
Benchmark                     Mode  Cnt     Score     Error  Units
GroovyBenchmark.constructor  thrpt   20   122.161 ±  21.067  ops/s
GroovyBenchmark.props        thrpt   20   138.942 ±   7.231  ops/s
JavaBenchmark.props          thrpt   20  3194.310 ± 271.967  ops/s
```

## How to run
Clone this repository, then change directory and type:

```./gradlew jmh```

