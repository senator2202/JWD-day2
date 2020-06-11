package by.kharitonov.task5;

public class FifthTaskMain {
    public static void main(String[] args) {
        TransformService transformService = new TransformService();
        int[] ms = transformService.toIntArray(args);
        OperationService operationService = new OperationService();
        int sumResult = operationService.sum(ms);
        long productResult = operationService.multiply(ms);
        OperationConsole operationConsole = new OperationConsole();
        operationConsole.printSumResult(sumResult);
        operationConsole.printProductResult(productResult);
    }
}
