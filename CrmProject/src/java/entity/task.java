/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author baran
 */
public class Task implements BaseEntity{
    
    private Long id;
    private  String title;
    private  String descirption;
    private LocalDateTime duaDate;
    private  LocalDateTime lastUpdate;

    @Override
    public long getId() {
     return  id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    public LocalDateTime getDuaDate() {
        return duaDate;
    }

    public void setDuaDate(LocalDateTime duaDate) {
        this.duaDate = duaDate;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Task(Long id, String title, String descirption, LocalDateTime duaDate, LocalDateTime lastUpdate) {
        this.id = id;
        this.title = title;
        this.descirption = descirption;
        this.duaDate = duaDate;
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.descirption);
        hash = 37 * hash + Objects.hashCode(this.duaDate);
        hash = 37 * hash + Objects.hashCode(this.lastUpdate);
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
        final Task other = (Task) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.descirption, other.descirption)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.duaDate, other.duaDate)) {
            return false;
        }
        return Objects.equals(this.lastUpdate, other.lastUpdate);
    }
    
    
}
