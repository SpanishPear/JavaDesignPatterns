package Structural.Decorator.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}