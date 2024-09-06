package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.BoardModel;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;

public interface BoardModelMapper {
    BoardEntity toEntity(BoardModel board);

    BoardModel toModel(BoardEntity board);
}
