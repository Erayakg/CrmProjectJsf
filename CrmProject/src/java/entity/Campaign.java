package entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Campaign implements BaseEntity {

    //product Many to many
    private long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private boolean isActive;

   @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public Campaign() {
    }

    public Campaign(long id, String name, String description, LocalDateTime startDate, LocalDateTime endDate, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isActive = isActive;
    }

    public Campaign(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + Objects.hashCode(this.startDate);
        hash = 53 * hash + Objects.hashCode(this.endDate);
        hash = 53 * hash + (this.isActive ? 1 : 0);
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
        if (this.id != other.id) {
            return false;
        }
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
        return Objects.equals(this.endDate, other.endDate);
    }

    @Override
    public String toString() {
        return "Campaign{" + "id=" + id + ", name=" + name + ", description=" + description + ", startDate=" + startDate + ", endDate=" + endDate + ", isActive=" + isActive + '}';
    }

   
}
