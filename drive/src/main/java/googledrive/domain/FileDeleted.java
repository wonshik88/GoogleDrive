package googledrive.domain;

import googledrive.domain.*;
import googledrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileDeleted extends AbstractEvent {

    private Long id;

    public FileDeleted(File aggregate){
        super(aggregate);
    }
    public FileDeleted(){
        super();
    }
}
