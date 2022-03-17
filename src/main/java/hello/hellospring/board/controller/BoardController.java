package hello.hellospring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board/getBoardList")
    public String getBoardList() {

        return "/board/board_list";
    }

    @GetMapping("/board/getBoard")
    public String getBoard() {

        return "/board/board_view";
    }

}
