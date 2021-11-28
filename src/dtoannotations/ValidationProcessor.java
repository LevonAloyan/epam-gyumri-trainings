package dtoannotations;

public interface ValidationProcessor {

    <V> String process(V object);
}
