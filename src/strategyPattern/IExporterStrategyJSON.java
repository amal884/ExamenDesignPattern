package strategyPattern;

import strategyPattern.IExporterStrategy;

public class IExporterStrategyJSON implements IExporterStrategy {
    @Override
    public void exporterDiagram() {
        System.out.println(" Exporting JSON format....");

    }
}
