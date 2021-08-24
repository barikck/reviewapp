package com.empreview.app;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@Component
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Feedback extends BaseEntity {
    private String feedbackFrom;
    private String feedbackTo;
    private String formName;
    private String reportName;
    private int rating;
    private String description;

}
