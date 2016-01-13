package eu.icred.model.datatype;

import eu.icred.model.datatype.enumeration.AreaMeasurement;
import eu.icred.model.datatype.enumeration.AreaType;

public class Area {
    private Double          value;
    private AreaType        areaType;
    private AreaMeasurement areaMessurement;

    public Area() {
    }

    public Area(Double value, AreaMeasurement areaMessurement, AreaType areaType) {
        this.value = value;
        this.areaType = areaType;
        this.areaMessurement = areaMessurement;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public AreaType getAreaType() {
        return areaType;
    }

    public void setAreaType(AreaType areaType) {
        this.areaType = areaType;
    }

    public AreaMeasurement getAreaMessurement() {
        return areaMessurement;
    }

    public void setAreaMessurement(AreaMeasurement areaMessurement) {
        this.areaMessurement = areaMessurement;
    }

}
