package model;

import javax.persistence.*;


@Entity
@Table (name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_ID")
    private Long id;

    @Column (name = "registration_number")
    private String registrationNumber;

    private String mark;

    @Column (name = "fuel_level")
    private Integer fuelLevel;

    @Column (name = "production_year")
    private Integer productionYear;

    @Column (name = "car_condition_note")
    private String carConditionNote;

    @ManyToOne
    @JoinColumn(name="model_id", nullable=false)
    private Model model;

    private String status;

    public Car(String registrationNumber, String mark, Integer fuelLevel, Integer productionYear, String carConditionNote, Model model, String status) {
        this.registrationNumber = registrationNumber;
        this.mark = mark;
        this.fuelLevel = fuelLevel;
        this.productionYear = productionYear;
        this.carConditionNote = carConditionNote;
        this.model = model;
        this.status = status;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Integer getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(Integer fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public String getCarConditionNote() {
        return carConditionNote;
    }

    public void setCarConditionNote(String carConditionNote) {
        this.carConditionNote = carConditionNote;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
