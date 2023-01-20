package org.openapitools.api;

import com.kabilesh.generated.Dto.Error;
import com.kabilesh.generated.Dto.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link UserApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-20T13:00:44.281885900+05:30[Asia/Calcutta]")
public interface UserApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /user : Create user
     *
     * @param userDTO Create user (optional)
     * @return User created successfully. (status code 200)
     *         or Error while creating new user. (status code 200)
     * @see UserApi#createUser
     */
    default ResponseEntity<UserDTO> createUser(UserDTO userDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"isDeleted\" : true, \"id\" : 0, \"updatedOn\" : \"updatedOn\", \"createdOn\" : \"createdOn\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /user/{id} : Delete user
     *
     * @param id User Id (required)
     * @return User deleted successfully. (status code 200)
     *         or User not found. (status code 404)
     *         or User already deleted. (status code 400)
     *         or unexpected error (status code 200)
     * @see UserApi#deleteUser
     */
    default ResponseEntity<UserDTO> deleteUser(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"isDeleted\" : true, \"id\" : 0, \"updatedOn\" : \"updatedOn\", \"createdOn\" : \"createdOn\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /user/{id} : Get user by Id
     *
     * @param id User Id (required)
     * @return User found. (status code 200)
     *         or User not found. (status code 404)
     *         or User already deleted. (status code 400)
     *         or unexpected error (status code 200)
     * @see UserApi#getUserById
     */
    default ResponseEntity<UserDTO> getUserById(Long id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"isDeleted\" : true, \"id\" : 0, \"updatedOn\" : \"updatedOn\", \"createdOn\" : \"createdOn\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see UserApi#updateUser
     */
    default ResponseEntity<UserDTO> updateUser(Long id,
        UserDTO userDTO) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"isDeleted\" : true, \"id\" : 0, \"updatedOn\" : \"updatedOn\", \"createdOn\" : \"createdOn\", \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
