package com.ordertracking.bean;

/**
 * Created by chlei on 2016/3/6.
 */
public class Warehouse {
    private String MTSMTO;
    private String MO;
    private String Priority;
    private String Reference;
    private String Quantity;
    private String Family;
    private String DCCoverageDay;
    private String MOCreateDate;
    private String BasicFinishDate;
    private String DC;
    private String DCEstimatedGRDate;
    private String InhouseSubcon;
    private String TestLine;
    private String Status;
    private String RecordTime;
    private String QuantityRemain;
    private String WarehouseBin;

    public Warehouse(String MTSMTO, String MO, String Priority,String Reference,String Quantity, String Family, String DCCoverageDay, String MOCreateDate, String BasicFinishDate, String DC, String DCEstimatedGRDate, String InhouseSubcon, String TestLine, String Status, String RecordTime, String QuantityRemain, String WarehouseBin) {
        this.MTSMTO= MTSMTO;
        this.MO=MO;
        this.Priority=Priority;
        this.Reference=Reference;
        this.Quantity=Quantity;
        this.Family=Family;
        this.DCCoverageDay=DCCoverageDay;
        this.MOCreateDate=MOCreateDate;
        this.BasicFinishDate=BasicFinishDate;
        this.DC=DC;
        this.DCEstimatedGRDate=DCEstimatedGRDate;
        this.InhouseSubcon=InhouseSubcon;
        this.TestLine=TestLine;
        this.Status=Status;
        this.RecordTime=RecordTime;
        this.QuantityRemain=QuantityRemain;
        this.WarehouseBin=WarehouseBin;
    }

    public Warehouse() {
        super();
    }

    public String getMTSMTO() {
        return MTSMTO;
    }

    public void setMTSMTO(String MTSMTO) {
        this.MTSMTO = MTSMTO;
    }

    public String getMO() {
        return MO;
    }

    public void setMO(String MO) {
        this.MO = MO;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getReference() {
        return Reference;
    }

    public void setReference(String reference) {
        Reference = reference;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String family) {
        Family = family;
    }

    public String getDCCoverageDay() {
        return DCCoverageDay;
    }

    public void setDCCoverageDay(String DCCoverageDay) {
        this.DCCoverageDay = DCCoverageDay;
    }

    public String getMOCreateDate() {
        return MOCreateDate;
    }

    public void setMOCreateDate(String MOCreateDate) {
        this.MOCreateDate = MOCreateDate;
    }

    public String getBasicFinishDate() {
        return BasicFinishDate;
    }

    public void setBasicFinishDate(String basicFinishDate) {
        BasicFinishDate = basicFinishDate;
    }

    public String getDC() {
        return DC;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public String getDCEstimatedGRDate() {
        return DCEstimatedGRDate;
    }

    public void setDCEstimatedGRDate(String DCEstimatedGRDate) {
        this.DCEstimatedGRDate = DCEstimatedGRDate;
    }

    public String getInhouseSubcon() {
        return InhouseSubcon;
    }

    public void setInhouseSubcon(String inhouseSubcon) {
        InhouseSubcon = inhouseSubcon;
    }

    public String getTestLine() {
        return TestLine;
    }

    public void setTestLine(String testLine) {
        TestLine = testLine;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRecordTime() {
        return RecordTime;
    }

    public void setRecordTime(String recordTime) {
        RecordTime = recordTime;
    }

    public String getQuantityRemain() {
        return QuantityRemain;
    }

    public void setQuantityRemain(String quantityRemain) {
        QuantityRemain = quantityRemain;
    }

    public String getWarehouseBin() {
        return WarehouseBin;
    }

    public void setWarehouseBin(String warehouseBin) {
        WarehouseBin = warehouseBin;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "MTSMTO='" + MTSMTO + '\'' +
                ", MO='" + MO + '\'' +
                ", Priority='" + Priority + '\'' +
                ", Reference='" + Reference + '\'' +
                ", Quantity='" + Quantity + '\'' +
                ", Family='" + Family + '\'' +
                ", DCCoverageDay='" + DCCoverageDay + '\'' +
                ", MOCreateDate='" + MOCreateDate + '\'' +
                ", BasicFinishDate='" + BasicFinishDate + '\'' +
                ", DC='" + DC + '\'' +
                ", DCEstimatedGRDate='" + DCEstimatedGRDate + '\'' +
                ", InhouseSubcon='" + InhouseSubcon + '\'' +
                ", TestLine='" + TestLine + '\'' +
                ", Status='" + Status + '\'' +
                ", RecordTime='" + RecordTime + '\'' +
                ", QuantityRemain='" + QuantityRemain + '\'' +
                ", WarehouseBin='" + WarehouseBin + '\'' +
                '}';
    }
}


