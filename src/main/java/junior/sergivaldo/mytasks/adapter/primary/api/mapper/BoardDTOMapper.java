package junior.sergivaldo.mytasks.adapter.primary.api.mapper;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.BoardDTO;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;

public interface BoardDTOMapper {

    BoardDTO toDTO(BoardEntity boardEntity);
    BoardEntity toEntity(BoardDTO boardDTO);

}
