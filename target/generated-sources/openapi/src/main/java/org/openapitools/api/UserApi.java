/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import com.kabilesh.generated.Dto.Error;
import com.kabilesh.generated.Dto.UserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-20T13:00:44.281885900+05:30[Asia/Calcutta]")
@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    default UserApiDelegate getDelegate() {
        return new UserApiDelegate() {};
    }

    /**
     * POST /user : Create user
     *
     * @param userDTO Create user (optional)
     * @return User created successfully. (status code 200)
     *         or Error while creating new user. (status code 200)
     */
    @Operation(
        operationId = "createUser",
        summary = "Create user",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User created successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDTO.class))
            }),
            @ApiResponse(responseCode = "200", description = "Error while creating new user.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/user",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDTO> createUser(
        @Parameter(name = "UserDTO", description = "Create user") @Valid @RequestBody(required = false) UserDTO userDTO
    ) {
        return getDelegate().createUser(userDTO);
    }


    /**
     * DELETE /user/{id} : Delete user
     *
     * @param id User Id (required)
     * @return User deleted successfully. (status code 200)
     *         or User not found. (status code 404)
     *         or User already deleted. (status code 400)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "deleteUser",
        summary = "Delete user",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User deleted successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "400", description = "User already deleted.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/user/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDTO> deleteUser(
        @Parameter(name = "id", description = "User Id", required = true) @PathVariable("id") Long id
    ) {
        return getDelegate().deleteUser(id);
    }


    /**
     * GET /user/{id} : Get user by Id
     *
     * @param id User Id (required)
     * @return User found. (status code 200)
     *         or User not found. (status code 404)
     *         or User already deleted. (status code 400)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "getUserById",
        summary = "Get user by Id",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "400", description = "User already deleted.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<UserDTO> getUserById(
        @Parameter(name = "id", description = "User Id", required = true) @PathVariable("id") Long id
    ) {
        return getDelegate().getUserById(id);
    }


    /**
     * PUT /user/{id} : Update user
     *
     * @param id User Id (required)
     * @param userDTO Update user (required)
     * @return User updated successfully. (status code 200)
     *         or User not found. (status code 404)
     *         or User already deleted. (status code 400)
     *         or unexpected error (status code 200)
     */
    @Operation(
        operationId = "updateUser",
        summary = "Update user",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "User not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "400", description = "User already deleted.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "200", description = "unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/user/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<UserDTO> updateUser(
        @Parameter(name = "id", description = "User Id", required = true) @PathVariable("id") Long id,
        @Parameter(name = "UserDTO", description = "Update user", required = true) @Valid @RequestBody UserDTO userDTO
    ) {
        return getDelegate().updateUser(id, userDTO);
    }

}
