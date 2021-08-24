package com.empreview.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public String submitFeedback(FeedbackDao feedbackDao) {
        Feedback feedback = Feedback.builder()
                .feedbackFrom(feedbackDao.getFeedbackFrom())
                .feedbackTo(feedbackDao.getFeedbackTo())
                .formName(feedbackDao.getFormName())
                .reportName(feedbackDao.getReportName())
                .rating(feedbackDao.getRating())
                .description(feedbackDao.getDescription())
                .build();

        feedbackRepository.save(feedback);

        return "Feedback submitted successfully.";
    }
}
