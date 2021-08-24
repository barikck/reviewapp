package com.empreview.app;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
class FeedbackDao {
    private String feedbackFrom;
    private String feedbackTo;
    private String formName;
    private String reportName;
    private int rating;
    private String description;
}
