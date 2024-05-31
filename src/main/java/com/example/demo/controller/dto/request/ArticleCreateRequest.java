package com.example.demo.controller.dto.request;

import jakarta.validation.constraints.NotNull;

public record ArticleCreateRequest(
        @NotNull(message = "작성자 ID를 입력해주세요")
        Long authorId,
        @NotNull(message = "게시판 ID를 입력해주세요")
        Long boardId,
        @NotNull(message = "제목을 입력해주세요")
        String title,
        @NotNull(message = "내용을 입력해주세요")
        String description
) {

}
