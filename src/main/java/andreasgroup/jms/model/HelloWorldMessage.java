package andreasgroup.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created on 11/Nov/2020 to jms
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HelloWorldMessage implements Serializable {

    static final long serialVersionUID = 3157224225652371299L;
    private UUID id;
    private String message;

}
