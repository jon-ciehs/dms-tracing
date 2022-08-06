package tracing.dev.jobs.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
//@Builder
public class Job {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID jobId;
    private LocalDate initJob;
    private LocalDate finishJob;
    private Boolean working;
    private Duration minutesExpended;

}
