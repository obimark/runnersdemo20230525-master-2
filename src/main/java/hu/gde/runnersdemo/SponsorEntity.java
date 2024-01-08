package hu.gde.runnersdemo;

import jakarta.persistence.*;

public class SponsorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long SponsorId;
    private String SponsorName;

    @ManyToOne
    @JoinColumn(name = "runner_id")
    private RunnerEntity runner;

    public long getSponsorId() {
        return SponsorId;
    }

    public String getSponsorName() {
        return SponsorName;
    }
    public void setRunner(RunnerEntity runner) {
        this.runner = runner;
    }

    public void setSponsorId(long sponsorId) {
        this.SponsorId = sponsorId;
    }

    public void setSponsorName(String sponsorName) {
        this.SponsorName = sponsorName;
    }

}


