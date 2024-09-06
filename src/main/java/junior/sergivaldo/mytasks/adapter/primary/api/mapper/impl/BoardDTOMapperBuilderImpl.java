package junior.sergivaldo.mytasks.adapter.primary.api.mapper.impl;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.BoardDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.BoardDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskListDTOMapper;
import junior.sergivaldo.mytasks.application.domain.BoardEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BoardDTOMapperBuilderImpl implements BoardDTOMapper {

    private  final TaskListDTOMapper taskListDTOMapper;

    @Override
    public BoardDTO toDTO(BoardEntity boardEntity) {
        return BoardDTO.builder()
                .id(boardEntity.getId())
                .name(boardEntity.getName())
                .description(boardEntity.getDescription())
                .createdAt(boardEntity.getCreatedAt())
                .updatedAt(boardEntity.getUpdatedAt())
                .taskLists(taskListDTOMapper.mapToDTO(boardEntity.getTaskLists()))
                .build();
    }

    @Override
    public BoardEntity toEntity(BoardDTO boardDTO) {
        return BoardEntity.builder()
                .id(boardDTO.getId())
                .name(boardDTO.getName())
                .description(boardDTO.getDescription())
                .build();
    }
}
