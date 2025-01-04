package com.example.demo.management.model;

import java.sql.Timestamp;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// TODO: Auto-generated Javadoc
/**
 * The Class TaskEntity.
 */
@Data
@Getter
@Setter
@AllArgsConstructor
public class TaskEntity {

	/** The id. */
	private Integer id;
	
	/** The name. */
	private String name;
	
	/** The description. */
	private String description;
	
	/** The duo date. */
	private Timestamp duoDate;
	
	/** The status. */
	private String status;
	
	/** The parent task id. */
	private Integer parentTaskId;
	
	/** The sub tasks. */
	private List<TaskEntity> subTasks;
}
