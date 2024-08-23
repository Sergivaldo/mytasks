package junior.sergivaldo.mytasks.adapter.primary.api.controller.task;

import junior.sergivaldo.mytasks.commons.adapter.primary.api.Routes;
import junior.sergivaldo.mytasks.adapter.primary.api.dto.TaskDTO;
import junior.sergivaldo.mytasks.adapter.primary.api.mapper.TaskDTOMapper;
import junior.sergivaldo.mytasks.application.port.in.FindTasksByTitleUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Routes.TASK)
@RequiredArgsConstructor
public class FindTasksByTitleController {
    private final FindTasksByTitleUseCase findTasksByTitleUseCase;
    private final TaskDTOMapper taskDTOMapper;

    @GetMapping
    public List<TaskDTO> findTasksByTitle(@RequestParam(required = false) String title) {
        return taskDTOMapper.mapToDTO(
                findTasksByTitleUseCase.execute(title)
        );
    }
}
