package junior.sergivaldo.mytasks.adapter.primary.api.controller.tasklist;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskListDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskListDTOMapper;
import junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes;
import junior.sergivaldo.mytasks.application.port.in.tasklist.CreateTaskListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Routes.TASK_LIST)
@RequiredArgsConstructor
public class CreateTaskListController {
    private final CreateTaskListUseCase createTaskListUseCase;
    private final TaskListDTOMapper taskListDTOMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskListDTO create(@RequestBody TaskListDTO taskList){
        return taskListDTOMapper.mapToDTO(
                createTaskListUseCase.execute(
                        taskListDTOMapper.mapToEntity(taskList)
                )
        );
    }
}
