package junior.sergivaldo.mytasks.application.port.in.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

public interface CreateBoardUseCase {

    BoardEntity execute(BoardEntity boardEntity);
}
