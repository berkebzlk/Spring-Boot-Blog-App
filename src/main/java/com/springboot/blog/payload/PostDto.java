package com.springboot.blog.payload;

import com.springboot.blog.entity.Category;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Set;

@Data
@Schema(
        description = "PostDTO Model Information"
)
public class PostDto {
    private long id;
    @Schema(
            description = "Blog Post Title"
    )
    @NotNull
    @Size(min=2, message = "Post title should have at least 2 characters")
    private String title;
    @Schema(
            description = "Blog Post Description"
    )
    @NotNull
    @Size(min=10, message = "Post description should have at least 2 characters")
    private String description;
    @Schema(
            description = "Blog Post Content"
    )
    @NotNull
    private String content;

    private Set<CommentDto> comments;

    @Schema(
            description = "Blog Post Category"
    )
    private long categoryId;
}
