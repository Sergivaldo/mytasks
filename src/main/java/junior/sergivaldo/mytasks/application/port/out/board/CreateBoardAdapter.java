package junior.sergivaldo.mytasks.application.port.out.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

public interface CreateBoardAdapter {

    BoardEntity create(BoardEntity board);
}
