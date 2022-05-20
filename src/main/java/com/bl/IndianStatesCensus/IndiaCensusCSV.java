package com.bl.IndianStatesCensus;
import com.opencsv.bean.CsvBindByName;
public class IndiaCensusCSV {
    @CsvBindByName(column = "FREQUENCY", required = true)
    public String FREQUENCY;

    @CsvBindByName(column = "DATE", required = true)
    public int DATE;

    @CsvBindByName(column = "LOCATION_NAME", required = true)
    public String LOCATION_NAME;

    @CsvBindByName(column = "LOCATION_F5", required = true)
    public int LOCATION_F5;

    @CsvBindByName(column = "LOCATION_ID", required = true)
    public int LOCATION_ID;

    @CsvBindByName(column = "LOCATION_REGIONID", required = true)
    public int LOCATION_REGIONID;

    @CsvBindByName(column = "VARIABLE_NAME", required = true)
    public String VARIABLE_NAME;

    @CsvBindByName(column = "VALUE", required = true)
    public int VALUE;

    @CsvBindByName(column = "VARIABLE_ID", required = true)
    public int VARIABLE_ID;

   // FREQUENCY;DATE;LOCATION_NAME;LOCATION_F5;LOCATION_ID;LOCATION_REGIONID;VARIABLE_NAME;VALUE;VARIABLE_ID

    @Override
    public String toString() {
        return "IndiaCensusCSV{" +
                "FREQUENCY='" + FREQUENCY + '\'' +
                ", DATE=" + DATE +
                ", LOCATION_NAME='" + LOCATION_NAME + '\'' +
                ", LOCATION_F5=" + LOCATION_F5 +
                ", LOCATION_ID=" + LOCATION_ID +
                ", LOCATION_REGIONID=" + LOCATION_REGIONID +
                ", VARIABLE_NAME='" + VARIABLE_NAME + '\'' +
                ", VALUE=" + VALUE +
                ", VARIABLE_ID=" + VARIABLE_ID +
                '}';
    }
}
