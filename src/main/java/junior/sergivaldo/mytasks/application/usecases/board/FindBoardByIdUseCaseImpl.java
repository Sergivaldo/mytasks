package junior.sergivaldo.mytasks.application.usecases.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import junior.sergivaldo.mytasks.application.port.in.board.FindBoardByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.board.FindBoardByIdAdapter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class FindBoardByIdUseCaseImpl implements FindBoardByIdUseCase {

    private final FindBoardByIdAdapter findBoardByIdAdapter;

    @Override
    public BoardEntity execute(UUID id) {
        return findBoardByIdAdapter.find(id);
    }

}
