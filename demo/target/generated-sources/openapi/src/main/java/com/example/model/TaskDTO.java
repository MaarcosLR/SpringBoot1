package com.example.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskDTO
 */

@JsonTypeName("Task")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-04T23:28:17.269548300+01:00[Europe/Madrid]")
public class TaskDTO {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("dueDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dueDate;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("parentTaskId")
  private Integer parentTaskId;

  @JsonProperty("subtasks")
  @Valid
  private List<TaskDTO> subtasks = null;

  public TaskDTO id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, required = false)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TaskDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaskDTO dueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * The due date and time in UTC, e.g., '2023-10-01T08:00:00+00:00'
   * @return dueDate
  */
  @Valid 
  @Schema(name = "dueDate", description = "The due date and time in UTC, e.g., '2023-10-01T08:00:00+00:00'", required = false)
  public OffsetDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

  public TaskDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", required = false)
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public TaskDTO parentTaskId(Integer parentTaskId) {
    this.parentTaskId = parentTaskId;
    return this;
  }

  /**
   * Get parentTaskId
   * @return parentTaskId
  */
  
  @Schema(name = "parentTaskId", required = false)
  public Integer getParentTaskId() {
    return parentTaskId;
  }

  public void setParentTaskId(Integer parentTaskId) {
    this.parentTaskId = parentTaskId;
  }

  public TaskDTO subtasks(List<TaskDTO> subtasks) {
    this.subtasks = subtasks;
    return this;
  }

  public TaskDTO addSubtasksItem(TaskDTO subtasksItem) {
    if (this.subtasks == null) {
      this.subtasks = new ArrayList<>();
    }
    this.subtasks.add(subtasksItem);
    return this;
  }

  /**
   * Get subtasks
   * @return subtasks
  */
  @Valid 
  @Schema(name = "subtasks", required = false)
  public List<TaskDTO> getSubtasks() {
    return subtasks;
  }

  public void setSubtasks(List<TaskDTO> subtasks) {
    this.subtasks = subtasks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDTO task = (TaskDTO) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.description, task.description) &&
        Objects.equals(this.dueDate, task.dueDate) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.parentTaskId, task.parentTaskId) &&
        Objects.equals(this.subtasks, task.subtasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dueDate, status, parentTaskId, subtasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parentTaskId: ").append(toIndentedString(parentTaskId)).append("\n");
    sb.append("    subtasks: ").append(toIndentedString(subtasks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

