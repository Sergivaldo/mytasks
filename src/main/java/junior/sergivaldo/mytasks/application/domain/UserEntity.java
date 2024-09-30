package junior.sergivaldo.mytasks.application.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Builder
public class UserEntity {

    private UUID id;

    private String name;

    private String email;

    private String password;

    private List<BoardEntity> boards;

}
