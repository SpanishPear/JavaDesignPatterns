package Structural.Decorator;

import Structural.Decorator.decorators.*;

public class Main {
 public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        DataSourceDecorator encoded = new CompressionDecorator(
                                         new EncryptionDecorator(
                                             new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource encodedOutput = new FileDataSource("out/OutputDemo.txt");


        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(encodedOutput.readData());
        System.out.println("- Decoded --------------");
        // this propogates down to the base class, which will decompress, decode the initial txt to file and print it to sout
        System.out.println(encoded.readData());
    }
}
