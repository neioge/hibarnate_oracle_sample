package main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sys.Tokyo_Olympics_2021")
public class Olympic {

    @Id
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "RANK")
    private Integer RANK;

    @Column(name = "TEAM")
    private String TEAM;

    @Column(name = "GOLDMEDAL")
    private Integer GOLDMEDAL;

    @Column(name = "SILVERMEDAL")
    private Integer SILVERMEDAL;

    @Column(name = "BRONZEMEDAL")
    private Integer BRONZEMEDAL;

    @Column(name = "TOTAL")
    private Integer TOTAL;

    @Column(name = "RANKBYTOTAL")
    private Integer RANKBYTOTAL;

    @Column(name = "NOCCODE")
    private String NOCCODE;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRANK() {
        return RANK;
    }

    public void setRANK(int RANK) {
        this.RANK = RANK;
    }

    public String getTEAM() {
        return TEAM;
    }

    public void setTEAM(String TEAM) {
        this.TEAM = TEAM;
    }

    public int getGOLDMEDAL() {
        return GOLDMEDAL;
    }

    public void setGOLDMEDAL(int GOLDMEDAL) {
        this.GOLDMEDAL = GOLDMEDAL;
    }

    public int getSILVERMEDAL() {
        return SILVERMEDAL;
    }

    public void setSILVERMEDAL(int SILVERMEDAL) {
        this.SILVERMEDAL = SILVERMEDAL;
    }

    public int getBRONZEMEDAL() {
        return BRONZEMEDAL;
    }

    public void setBRONZEMEDAL(int BRONZEMEDAL) {
        this.BRONZEMEDAL = BRONZEMEDAL;
    }

    public int getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(int tOTAL) {
        this.TOTAL = tOTAL;
    }

    public int getRANKBYTOTAL() {
        return RANKBYTOTAL;
    }

    public void setRANKBYTOTAL(int RANKBYTOTAL) {
        this.RANKBYTOTAL = RANKBYTOTAL;
    }

    public String getNOCCODE() {
        return NOCCODE;
    }

}
