package junior.sergivaldo.mytasks.application.usecases.board;

import junior.sergivaldo.mytasks.application.domain.TaskListEntity;
import junior.sergivaldo.mytasks.application.port.in.tasklist.FindAllTaskListUseCase;
import junior.sergivaldo.mytasks.application.port.out.tasklist.FindAllTaskListAdapter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FindAllBoardUseCaseImpl implements FindAllTaskListUseCase {

    private final FindAllTaskListAdapter findAllTaskListAdapter;

    @Override
    public List<TaskListEntity> execute(Integer page, Integer size) {
        return findAllTaskListAdapter.find(page,size);
    }

}
