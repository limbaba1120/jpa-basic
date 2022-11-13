package hellojpa;
import hellojpa.RoleType;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
public class Member {
    @Id @GeneratedValue
    @Column(name="MEMBER_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    @Column(name = "USERNAME")
    private String username;

//    @Column(name="TEAM_ID")
//    private Long teamId;

    public void setTeam(Team team) {
        this.team = team;
    }
    public Team getTeam() {
        return team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}