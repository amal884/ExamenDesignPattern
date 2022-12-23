package strategyPattern;

import strategyPattern.IExporterStrategy;

public class IExporterStrategyXML implements IExporterStrategy {
    @Override
    public void exporterDiagram() {
        System.out.println(" Exporting XML format....");
    }
}
