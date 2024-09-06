package junior.sergivaldo.mytasks.application.usecases.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import junior.sergivaldo.mytasks.application.port.in.board.FindBoardByIdUseCase;
import junior.sergivaldo.mytasks.application.port.out.board.FindBoardByIdAdapter;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class FindBoardByIdUseCaseImpl implements FindBoardByIdUseCase {

    private final FindBoardByIdAdapter findBoardByIdAdapter;

    @Override
    public BoardEntity execute(UUID id) {
        return Optional.ofNullable(findBoardByIdAdapter.find(id))
                .orElseThrow(() -> new RuntimeException("Não foi encontrado um board de id: " + id));
    }

}
