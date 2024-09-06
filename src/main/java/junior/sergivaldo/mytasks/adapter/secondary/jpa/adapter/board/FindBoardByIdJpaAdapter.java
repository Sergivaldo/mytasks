package junior.sergivaldo.mytasks.adapter.secondary.jpa.adapter.board;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.BoardModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.repository.BoardRespository;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import junior.sergivaldo.mytasks.application.port.out.board.FindBoardByIdAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class FindBoardByIdJpaAdapter implements FindBoardByIdAdapter {
    private final BoardRespository boardRespository;
    private final BoardModelMapper boardModelMapper;

    @Override
    public BoardEntity find(UUID id) {
        return boardRespository
                .findById(id)
                .map(boardModelMapper::toEntity)
                .orElse(null);
    }

}
