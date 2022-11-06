package sn.mendel.techpal.entities;

import javax.persistence.*;

@Entity
public class BusinessEmp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long idBusiness;
    @Column
    private String series_reference;
    @Column
    private String period;

    @Column(nullable = true)
    private String data_value;

    @Column
    private String suppressed;
    @Column
    private String status;
    @Column
    private String units;
    @Column
    private String magnitude;
    @Column
    private String subject;
    @Column
    private String groupe;
    @Column
    private String series_title_1;
    @Column
    private String series_title_2;
    @Column
    private String series_title_3;


    public BusinessEmp() {
    }

    public Long getIdBusiness() {
        return idBusiness;
    }

    public void setIdBusiness(Long idBusiness) {
        this.idBusiness = idBusiness;
    }

    public String getSeries_reference() {
        return series_reference;
    }

    public void setSeries_reference(String series_reference) {
        this.series_reference = series_reference;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getData_value() {
        return data_value;
    }

    public void setData_value(String data_value) {
        this.data_value = data_value;
    }

    public String getSuppressed() {
        return suppressed;
    }

    public void setSuppressed(String suppressed) {
        this.suppressed = suppressed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public String getSeries_title_1() {
        return series_title_1;
    }

    public void setSeries_title_1(String series_title_1) {
        this.series_title_1 = series_title_1;
    }

    public String getSeries_title_2() {
        return series_title_2;
    }

    public void setSeries_title_2(String series_title_2) {
        this.series_title_2 = series_title_2;
    }

    public String getSeries_title_3() {
        return series_title_3;
    }

    public void setSeries_title_3(String series_title_3) {
        this.series_title_3 = series_title_3;
    }
}