package junior.sergivaldo.mytasks.application.port.in.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

import java.util.List;

public interface FindAllBoardUseCase {
    List<BoardEntity> execute(Integer page, Integer size);
}
