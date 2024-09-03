package junior.sergivaldo.mytasks.application.port.in.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

import java.util.UUID;

public interface FindBoardByIdUseCase {

    BoardEntity execute(UUID id);
}
