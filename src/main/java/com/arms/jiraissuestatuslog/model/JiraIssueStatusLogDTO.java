package com.arms.jiraissuestatuslog.model;

import com.egovframework.javaservice.treeframework.model.TreeBaseDTO;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JiraIssueStatusLogDTO extends TreeBaseDTO {


    private String c_issue_status_id;

    private String c_issue_status_desc;

    private String c_issue_status_name;

    private String c_issue_status_url;
}
