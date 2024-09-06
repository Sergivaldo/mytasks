package junior.sergivaldo.mytasks.adapter.primary.api.controller.board;


import junior.sergivaldo.mytasks.adapter.primary.api.dto.BoardDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.BoardDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes;
import junior.sergivaldo.mytasks.application.port.in.board.CreateBoardUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.BOARD)
@RequiredArgsConstructor
public class CreateBoardController {

    private final CreateBoardUseCase createBoardUseCase;
    private final BoardDTOMapper boardDTOMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BoardDTO create(@RequestBody BoardDTO boardDTO) {
        return boardDTOMapper.toDTO(
                createBoardUseCase.execute(
                        boardDTOMapper.toEntity(boardDTO)
                )
        );
    }
}
