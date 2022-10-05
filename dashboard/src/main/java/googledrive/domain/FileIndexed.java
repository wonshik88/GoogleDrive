package googledrive.domain;

import googledrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private List<List<String>> keywords;
    private Long fileId;
}
