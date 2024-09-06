package junior.sergivaldo.mytasks.adapter.primary.api.controller.task;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes;
import junior.sergivaldo.mytasks.application.port.in.task.CreateTaskUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.TASK)
@RequiredArgsConstructor
public class CreateTaskController {

    private final CreateTaskUseCase taskCreateUseCase;
    private final TaskDTOMapper taskDTOMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO create(@RequestBody TaskDTO taskDTO){
        return taskDTOMapper.mapToDTO(
                taskCreateUseCase.execute(taskDTOMapper.mapToEntity(taskDTO)
                )
        );
    }
}
