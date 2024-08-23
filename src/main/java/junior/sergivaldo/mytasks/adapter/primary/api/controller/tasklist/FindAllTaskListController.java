package junior.sergivaldo.mytasks.adapter.primary.api.controller.tasklist;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskListDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskListDTOMapper;
import junior.sergivaldo.mytasks.application.port.in.tasklist.FindAllTaskListUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static junior.sergivaldo.mytasks.commons.adapter.primary.api.Routes.TASK_LIST;

@RestController
@RequestMapping(TASK_LIST)
@RequiredArgsConstructor
public class FindAllTaskListController {

    private final TaskListDTOMapper taskListDTOMapper;
    private final FindAllTaskListUseCase findAllTaskListUseCase;

    @GetMapping
    public List<TaskListDTO> findAll(@RequestParam Integer page,
                                     @RequestParam(required = false) Integer size) {
        return taskListDTOMapper.mapToDTO(findAllTaskListUseCase.execute(page, size));
    }
}
