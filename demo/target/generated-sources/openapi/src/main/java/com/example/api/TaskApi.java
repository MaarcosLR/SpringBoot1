/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.0.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.api;

import com.example.model.CreateTaskRequestDTO;
import com.example.model.ErrorResponseDTO;
import com.example.model.TaskDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-04T23:28:17.269548300+01:00[Europe/Madrid]")
@Validated
@Tag(name = "Task", description = "the Task API")
public interface TaskApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * PATCH /task/{id}/complete : Mark a task as completed
     *
     * @param id Task ID (required)
     * @return Task marked as completed (status code 201)
     *         or Task not found (status code 404)
     */
    @Operation(
        operationId = "completeTask",
        summary = "Mark a task as completed",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Task marked as completed"),
            @ApiResponse(responseCode = "404", description = "Task not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/task/{id}/complete"
    )
    default ResponseEntity<Void> completeTask(
        @Parameter(name = "id", description = "Task ID", required = true) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /task : Create a task
     *
     * @param createTaskRequestDTO  (required)
     * @return Task created successfully (status code 200)
     *         or Invalid input (status code 400)
     */
    @Operation(
        operationId = "createTask",
        summary = "Create a task",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Task created successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TaskDTO.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/task",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<TaskDTO> createTask(
        @Parameter(name = "CreateTaskRequestDTO", description = "", required = true) @Valid @RequestBody CreateTaskRequestDTO createTaskRequestDTO
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"subtasks\" : [ null, null ], \"parentTaskId\" : 6, \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"status\" : \"PENDING\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /task/{id} : Delete a task
     *
     * @param id Task ID (required)
     * @return Task deleted successfully (status code 204)
     *         or Task not found (status code 404)
     */
    @Operation(
        operationId = "deleteTask",
        summary = "Delete a task",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Task deleted successfully"),
            @ApiResponse(responseCode = "404", description = "Task not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/task/{id}"
    )
    default ResponseEntity<Void> deleteTask(
        @Parameter(name = "id", description = "Task ID", required = true) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /task : Get all tasks
     *
     * @return List of all tasks (status code 200)
     */
    @Operation(
        operationId = "getAllTasks",
        summary = "Get all tasks",
        tags = { "Task" },
        responses = {
            @ApiResponse(responseCode = "200", description = "List of all tasks", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TaskDTO.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/task",
        produces = { "application/json" }
    )
    default ResponseEntity<List<TaskDTO>> getAllTasks(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"subtasks\" : [ null, null ], \"parentTaskId\" : 6, \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : 0, \"status\" : \"PENDING\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
