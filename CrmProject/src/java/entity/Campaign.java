package entity;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
public class Campaign extends BaseEntity {
    
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean isActive;

    @ManyToMany(mappedBy = "campaigns")
    private List<Company> companies;
    
}