package junior.sergivaldo.mytasks.application.port.out.board;

import junior.sergivaldo.mytasks.application.domain.BoardEntity;

import java.util.List;

public interface FindAllBoardAdapter {
    List<BoardEntity> find(Integer page, Integer size);
}
