package junior.sergivaldo.mytasks.application.port.out.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

import java.util.UUID;

public interface FindBoardByIdAdapter {
    BoardEntity find(UUID id);
}
