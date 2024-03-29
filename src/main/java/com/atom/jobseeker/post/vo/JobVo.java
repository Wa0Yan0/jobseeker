package com.atom.jobseeker.post.vo;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wayan
 */

@Data
public class JobVo {
    private Long id;
    private String name;
    private String salary;
    private String welfare;
    private String region;
    private String experience;
    private String education;
    private String peopleCount;
    private String issueDate;
    private String issueStatus;
    private String jobInfo;
    private Long companyId;

    public void setIssueDate(Date issueDate) {
        this.issueDate = new SimpleDateFormat("yyyy-MM-dd").format(issueDate);
    }
}
