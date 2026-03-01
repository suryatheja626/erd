package your.package.entities;

import javax.persistence.*;

@Entity
public class EntityName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fieldOne;

    @Column
    private String fieldTwo;

    
    public EntityName() {}

    public EntityName(String fieldOne, String fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

   
    public Long getId() {
        return id;
    }

    
    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

   
    public void setFieldOne(String fieldOne) {
        this.fieldOne = fieldOne;
    }

    public void setFieldTwo(String fieldTwo) {
        this.fieldTwo = fieldTwo;
    }
}
