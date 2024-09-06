package junior.sergivaldo.mytasks.adapter.primary.api.controller.task;

import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.application.port.in.task.FindTaskByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static junior.sergivaldo.mytasks.adapter.primary.api.utils.Routes.TASK;

@RestController
@RequestMapping(TASK)
@RequiredArgsConstructor
public class FindTaskByIdController {
    private final FindTaskByIdUseCase findTaskByIdUseCase;
    private final TaskDTOMapper taskDTOMapper;

    @GetMapping("/{id}")
    public TaskDTO findTaskById(@PathVariable UUID id) {
        return taskDTOMapper
                .mapToDTO(
                    findTaskByIdUseCase.execute(id)
        );
    }
}
