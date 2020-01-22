package model;

import javax.persistence.*;

@Entity
@Table (name = "model")
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_ID")
    private Long id;

    private String name;

    private String generation;

    @Column (name = "foto_directory")
    private String fotoDirectory;

    private String type;

    @ManyToOne
    @JoinColumn(name="quipmentVersion_id", nullable=false)
    private EquipmentVersion equipmentVersionID;


    public Model() {
    }

    public Model(String name, String generation, String fotoDirectory, String type, EquipmentVersion equipmentVersionID) {
        this.name = name;
        this.generation = generation;
        this.fotoDirectory = fotoDirectory;
        this.type = type;
        this.equipmentVersionID = equipmentVersionID;
    }

    public EquipmentVersion getEquipmentVersionID() {
        return equipmentVersionID;
    }

    public void setEquipmentVersionID(EquipmentVersion equipmentVersionID) {
        this.equipmentVersionID = equipmentVersionID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public String getFotoDirectory() {
        return fotoDirectory;
    }

    public void setFotoDirectory(String fotoDirectory) {
        this.fotoDirectory = fotoDirectory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
