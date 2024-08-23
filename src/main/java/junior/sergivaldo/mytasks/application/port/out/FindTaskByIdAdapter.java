package junior.sergivaldo.mytasks.application.port.out;

import junior.sergivaldo.mytasks.application.domain.TaskEntity;

import java.util.UUID;

public interface FindTaskByIdAdapter {
    TaskEntity find(UUID id);
}
