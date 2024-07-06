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
    
    public Campaign() {
    }

    public Campaign(String name, String description, LocalDateTime startDate, LocalDateTime endDate, boolean isActive, List<Company> companies) {
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
        this.companies = companies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.description);
        hash = 47 * hash + Objects.hashCode(this.startDate);
        hash = 47 * hash + Objects.hashCode(this.endDate);
        hash = 47 * hash + (this.isActive ? 1 : 0);
        hash = 47 * hash + Objects.hashCode(this.companies);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
    }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Campaign other = (Campaign) obj;
        if (this.isActive != other.isActive) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.startDate, other.startDate)) {
            return false;
        }
        if (!Objects.equals(this.endDate, other.endDate)) {
            return false;
        }
        return Objects.equals(this.companies, other.companies);
    }
    
  
    
    
}
