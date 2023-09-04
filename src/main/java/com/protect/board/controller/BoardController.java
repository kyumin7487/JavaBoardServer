package com.protect.board.controller;

import com.protect.board.entity.Board;
import com.protect.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write") //localhost:8080/board/write
    public String boardWriteForm() {

        return "boardwrite";
    }
    @PostMapping("/board/writepro")
    public String boardWritepro(Board board) {
        boardService.write(board);
        return "";
    }
}
