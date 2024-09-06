package junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.impl;

import junior.sergivaldo.mytasks.adapter.secondary.jpa.mapper.BoardModelMapper;
import junior.sergivaldo.mytasks.adapter.secondary.jpa.model.BoardModel;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import org.springframework.stereotype.Component;

@Component
public class BoardModelMapperDefaultImpl implements BoardModelMapper {
    @Override
    public BoardEntity toEntity(BoardModel board) {
        return BoardEntity.builder()
                .id(board.getId())
                .name(board.getName())
                .description(board.getDescription())
                .createAt(board.getCreatedAt())
                .updatedAt(board.getUpdatedAt())
                .build();
    }

    @Override
    public BoardModel toModel(BoardEntity board) {
        return BoardModel.builder()
                .id(board.getId())
                .name(board.getName())
                .description(board.getDescription())
                .createdAt(board.getCreateAt())
                .updatedAt(board.getUpdatedAt())
                .build();
    }
}
