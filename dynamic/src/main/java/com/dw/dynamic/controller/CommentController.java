package com.dw.dynamic.controller;

import com.dw.dynamic.DTO.CommentDTO;
import com.dw.dynamic.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    CommentDTO commentDTO;

    @GetMapping("/board-title/{boardTitle}")
    public ResponseEntity<CommentDTO> getCommentByBoardTitle(@PathVariable String boardTitle) {
        return new ResponseEntity<>(
                CommentService.getCommentByBoardTitle(boardTitle),
                HttpStatus.OK);
    }

    @GetMapping("/board-id/{boardId}")
    public ResponseEntity<CommentDTO> getCommentByBoardId(@PathVariable Long boardId) {

    }
}
