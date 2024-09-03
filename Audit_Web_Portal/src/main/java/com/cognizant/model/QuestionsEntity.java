package com.cognizant.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**

 * 		This is Model Class for QuestionsEntity
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class QuestionsEntity {

	
	private Integer questionId;
	
	private String auditType;
	
	private String question;
	
	private String response;
}
