package junior.sergivaldo.mytasks.application.usecases.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import junior.sergivaldo.mytasks.application.port.in.board.CreateBoardUseCase;
import junior.sergivaldo.mytasks.application.port.out.board.CreateBoardAdapter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CreateBoardUseCaseImpl implements CreateBoardUseCase {

    private final CreateBoardAdapter createBoardAdapter;

    @Override
    public BoardEntity execute(BoardEntity boardEntity) {
        return createBoardAdapter.create(boardEntity);
    }
}
