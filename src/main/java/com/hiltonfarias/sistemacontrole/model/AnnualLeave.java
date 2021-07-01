package com.hiltonfarias.sistemacontrole.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class AnnualLeave {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class AnnualLeaveId implements Serializable {
        private Long annualLeaveId;
        private Long movementId;
        private Long userId;
    }

    @Id
    @GeneratedValue
    @EmbeddedId
    private AnnualLeaveId id;
    private LocalDateTime dateWorked;
    private BigDecimal amountOfHours;
    private BigDecimal hoursBalance;

}
