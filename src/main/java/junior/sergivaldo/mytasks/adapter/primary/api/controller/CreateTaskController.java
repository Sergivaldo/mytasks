package junior.sergivaldo.mytasks.adapter.primary.api.controller;

import junior.sergivaldo.mytasks.commons.adapter.primary.api.Routes;
import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.application.port.in.CreateTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.TASK)
@RequiredArgsConstructor
public class CreateTaskController {
    private final CreateTaskUseCase taskCreateUseCase;
    private final TaskDTOMapper taskDTOMapper;

    @PostMapping
    public TaskDTO create(@RequestBody TaskDTO taskDTO){
        return taskDTOMapper.mapToDTO(taskCreateUseCase.execute(taskDTOMapper.mapToEntity(taskDTO)));
    }
}
