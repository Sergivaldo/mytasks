package junior.sergivaldo.mytasks.application.port.in;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;

import java.util.List;

public interface FindTasksByTitleUseCase {

    List<TaskEntity> execute(String title);
}
