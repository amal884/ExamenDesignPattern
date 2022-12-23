package strategyPattern;

import strategyPattern.IExporterStrategy;

public class IExporterStrategySVG implements IExporterStrategy {
    @Override
    public void exporterDiagram() {

        System.out.println(" Exporting SVG format....");

    }
}
