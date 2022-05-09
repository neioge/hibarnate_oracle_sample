package main;

public class Olympic {
    private int ID;
    private int RANK;
    private String TEAM;
    private int GOLDMEDAL;
    private int SILVERMEDAL;
    private int BRONZEMEDAL;
    private int TOTAL;
    private int RANKBYTOTAL;
    private String NOCCODE;

    public Olympic(){

    }

    public Olympic(int ID, int RANK, String TEAM, int GOLDMEDAL, int SILVERMEDAL, int BRONZEMEDAL, int TOTAL, int RANKBYTOTAL, String NOCCOE){

    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getRANK() {
        return RANK;
    }

    public void setRANK(int rANK) {
        RANK = rANK;
    }

    public String getTEAM() {
        return TEAM;
    }

    public void setTEAM(String tEAM) {
        TEAM = tEAM;
    }

    public int getGOLDMEDAL() {
        return GOLDMEDAL;
    }

    public void setGOLDMEDAL(int gOLDMEDAL) {
        GOLDMEDAL = gOLDMEDAL;
    }

    public int getSILVERMEDAL() {
        return SILVERMEDAL;
    }

    public void setSILVERMEDAL(int sILVERMEDAL) {
        SILVERMEDAL = sILVERMEDAL;
    }

    public int getBRONZEMEDAL() {
        return BRONZEMEDAL;
    }

    public void setBRONZEMEDAL(int bRONZEMEDAL) {
        BRONZEMEDAL = bRONZEMEDAL;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int tOTAL) {
        TOTAL = tOTAL;
    }

    public int getRANKBYTOTAL() {
        return RANKBYTOTAL;
    }

    public void setRANKBYTOTAL(int rANKBYTOTAL) {
        RANKBYTOTAL = rANKBYTOTAL;
    }

    public String getNOCCODE() {
        return NOCCODE;
    }

    public void setNOCCODE(String nOCCODE) {
        NOCCODE = nOCCODE;
    }
}
