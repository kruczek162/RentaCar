package model;

import javax.persistence.*;

@Entity
public class EquipmentVersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_version_id")
    private Long equipmentVersionId;

    @Column (name = "equipment_description")
    private String equipmentDescription;

    @Column (name = "equipment_name")
    private String equipmentName;

    public EquipmentVersion() {
    }

    public EquipmentVersion(String equipmentDescription, String equipmentName) {
        this.equipmentDescription = equipmentDescription;
        this.equipmentName = equipmentName;
    }

    public Long getEquipmentVersionId() {
        return equipmentVersionId;
    }

    public void setEquipmentVersionId(Long equipmentVersionId) {
        this.equipmentVersionId = equipmentVersionId;
    }

    public String getEquipmentDescription() {
        return equipmentDescription;
    }

    public void setEquipmentDescription(String equipmentDescription) {
        this.equipmentDescription = equipmentDescription;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }
}

