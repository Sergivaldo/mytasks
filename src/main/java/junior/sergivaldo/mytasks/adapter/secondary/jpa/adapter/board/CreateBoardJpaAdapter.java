package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.board;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.BoardModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.BoardRespository;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import junior.sergivaldo.mytasks.application.port.out.board.CreateBoardAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateBoardJpaAdapter implements CreateBoardAdapter {

    private final BoardRespository boardRespository;
    private final BoardModelMapper boardModelMapper;

    @Override
    public BoardEntity create(BoardEntity board) {
        return boardModelMapper.toEntity(
                boardRespository.save(
                        boardModelMapper.toModel(board)
                )
        );
    }
}
