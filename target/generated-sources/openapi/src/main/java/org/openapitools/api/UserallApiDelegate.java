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
 * A delegate to be called by the {@link UserallApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-01-20T13:26:26.571429600+05:30[Asia/Calcutta]")
public interface UserallApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /userall : Get all users
     *
     * @return Users found. (status code 200)
     *         or Users not found. (status code 404)
     *         or unexpected error (status code 200)
     * @see UserallApi#getUsers
     */
    default ResponseEntity<List<UserDTO>> getUsers() {
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
